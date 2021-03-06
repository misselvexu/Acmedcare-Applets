package com.acmedcare.framework.applet.integrate.wechat.support.microapp.message;

import com.acmedcare.framework.applet.integrate.wechat.support.common.api.WxErrorExceptionHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.InternalSession;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.InternalSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.StandardSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.common.session.WxSessionManager;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.LogExceptionHandler;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaMessage;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaMessageRouter {
  private static final int DEFAULT_THREAD_POOL_SIZE = 100;
  private final Logger log = LoggerFactory.getLogger(WxMaMessageRouter.class);
  private final List<WxMaMessageRouterRule> rules = new ArrayList<>();

  private final WxMaService wxMaService;

  private ExecutorService executorService;

  private WxSessionManager sessionManager;

  private WxErrorExceptionHandler exceptionHandler;

  public WxMaMessageRouter(WxMaService wxMaService) {
    this.wxMaService = wxMaService;
    ThreadFactory namedThreadFactory =
        new ThreadFactoryBuilder().setNameFormat("WxMaMessageRouter-pool-%d").build();
    this.executorService =
        new ThreadPoolExecutor(
            DEFAULT_THREAD_POOL_SIZE,
            DEFAULT_THREAD_POOL_SIZE,
            0L,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(),
            namedThreadFactory);
    this.sessionManager = new StandardSessionManager();
    this.exceptionHandler = new LogExceptionHandler();
  }

  /**
   *
   *
   * <pre>
   * 设置自定义的 {@link ExecutorService}
   * 如果不调用该方法，默认使用 Executors.newFixedThreadPool(100)
   * </pre>
   */
  public void setExecutorService(ExecutorService executorService) {
    this.executorService = executorService;
  }

  /**
   *
   *
   * <pre>
   * 设置自定义的{@link WxSessionManager}
   * 如果不调用该方法，默认使用 {@link StandardSessionManager}
   * </pre>
   */
  public void setSessionManager(WxSessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  /**
   *
   *
   * <pre>
   * 设置自定义的{@link WxErrorExceptionHandler}
   * 如果不调用该方法，默认使用 {@link LogExceptionHandler}
   * </pre>
   */
  public void setExceptionHandler(WxErrorExceptionHandler exceptionHandler) {
    this.exceptionHandler = exceptionHandler;
  }

  List<WxMaMessageRouterRule> getRules() {
    return this.rules;
  }

  /** 开始一个新的Route规则. */
  public WxMaMessageRouterRule rule() {
    return new WxMaMessageRouterRule(this);
  }

  /** 处理微信消息. */
  private WxMaXmlOutMessage route(final WxMaMessage wxMessage, final Map<String, Object> context) {
    final List<WxMaMessageRouterRule> matchRules = new ArrayList<>();
    // 收集匹配的规则
    for (final WxMaMessageRouterRule rule : this.rules) {
      if (rule.test(wxMessage)) {
        matchRules.add(rule);
        if (!rule.isReEnter()) {
          break;
        }
      }
    }

    if (matchRules.size() == 0) {
      return null;
    }

    final List<Future<?>> futures = new ArrayList<>();
    WxMaXmlOutMessage result = null;
    for (final WxMaMessageRouterRule rule : matchRules) {
      // 返回最后一个非异步的rule的执行结果
      if (rule.isAsync()) {
        futures.add(
            this.executorService.submit(
                new Runnable() {
                  @Override
                  public void run() {
                    rule.service(
                        wxMessage,
                        context,
                        WxMaMessageRouter.this.wxMaService,
                        WxMaMessageRouter.this.sessionManager,
                        WxMaMessageRouter.this.exceptionHandler);
                  }
                }));
      } else {
        result =
            rule.service(
                wxMessage, context, this.wxMaService, this.sessionManager, this.exceptionHandler);
        // 在同步操作结束，session访问结束
        this.log.info("End session access: async=false, sessionId={}", wxMessage.getFromUser());
        sessionEndAccess(wxMessage);
      }
    }

    if (futures.size() > 0) {
      this.executorService.submit(
          new Runnable() {
            @Override
            public void run() {
              for (Future<?> future : futures) {
                try {
                  future.get();
                  WxMaMessageRouter.this.log.info(
                      "End session access: async=true, sessionId={}", wxMessage.getFromUser());
                  // 异步操作结束，session访问结束
                  sessionEndAccess(wxMessage);
                } catch (InterruptedException | ExecutionException e) {
                  WxMaMessageRouter.this.log.error("Error happened when wait task finish", e);
                }
              }
            }
          });
    }
    return result;
  }

  public WxMaXmlOutMessage route(final WxMaMessage wxMessage) {
    return this.route(wxMessage, new HashMap<String, Object>(2));
  }

  /** 对session的访问结束. */
  private void sessionEndAccess(WxMaMessage wxMessage) {
    InternalSession session =
        ((InternalSessionManager) this.sessionManager).findSession(wxMessage.getFromUser());
    if (session != null) {
      session.endAccess();
    }
  }
}
