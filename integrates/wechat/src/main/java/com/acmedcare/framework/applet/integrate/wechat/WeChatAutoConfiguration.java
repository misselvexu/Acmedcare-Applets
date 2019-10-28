package com.acmedcare.framework.applet.integrate.wechat;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.impl.WxMaServiceImpl;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.config.impl.WxMaDefaultConfigImpl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl.WxMpServiceImpl;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.config.impl.WxMpDefaultConfigImpl;
import com.acmedcare.framework.applet.integrate.wechat.support.pay.config.WxPayConfig;
import com.acmedcare.framework.applet.integrate.wechat.support.pay.service.WxPayService;
import com.acmedcare.framework.applet.integrate.wechat.support.pay.service.impl.WxPayServiceImpl;
import com.acmedcare.framework.kits.lang.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.EventListener;

import static com.acmedcare.framework.applet.integrate.wechat.WeChatIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX;
import static com.acmedcare.framework.applet.integrate.wechat.WeChatIntegrateProperties.MicroApplicationProperties.INTEGRATE_WECHAT_MICRO_APPLICATION_CONFIG_ENABLED_PROPERTIES;
import static com.acmedcare.framework.applet.integrate.wechat.WeChatIntegrateProperties.WeChatMPProperties.INTEGRATE_WECHAT_MP_CONFIG_ENABLED_PROPERTIES;
import static com.acmedcare.framework.applet.integrate.wechat.WeChatIntegrateProperties.WeChatPayProperties.INTEGRATE_WECHAT_PAY_CONFIG_ENABLED_PROPERTIES;

/**
 * {@link WeChatAutoConfiguration}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Configuration
@ConditionalOnProperty(
    prefix = INTEGRATE_PROPERTIES_CONFIG_PREFIX,
    name = "enabled",
    havingValue = "true")
@EnableConfigurationProperties(WeChatIntegrateProperties.class)
@ComponentScan(basePackageClasses = WeChatIntegrateProperties.class)
public class WeChatAutoConfiguration implements ApplicationContextAware {

  private static final Logger log = LoggerFactory.getLogger(WeChatAutoConfiguration.class);

  private ApplicationContext applicationContext;

  @EventListener
  public void onApplicationReadyEvent(ApplicationReadyEvent event) {
    WeChatAppletContext.refresh(
        event.getApplicationContext().getBeanFactory(),
        event.getApplicationContext().getEnvironment());
    log.info("[==WeChat Applet==] wechat context is refreshed.");
  }

  // ============ WeChat Micro-App Service Beans ============

  @Bean
  @Primary
  @ConditionalOnMissingBean(WxMaService.class)
  @ConditionalOnProperty(
      prefix = INTEGRATE_WECHAT_MICRO_APPLICATION_CONFIG_ENABLED_PROPERTIES,
      name = "enabled",
      havingValue = "true")
  public WxMaService service(WeChatIntegrateProperties properties) {
    WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
    config.setAppid(StringUtils.trimToNull(properties.getMicroAppConfig().getAppid()));
    config.setSecret(StringUtils.trimToNull(properties.getMicroAppConfig().getSecret()));
    config.setToken(StringUtils.trimToNull(properties.getMicroAppConfig().getToken()));
    config.setAesKey(StringUtils.trimToNull(properties.getMicroAppConfig().getAesKey()));
    config.setMsgDataFormat(
        StringUtils.trimToNull(properties.getMicroAppConfig().getMsgDataFormat().name()));

    final WxMaServiceImpl service = new WxMaServiceImpl();
    service.setWxMaConfig(config);

    log.info("[==WeChat Applet==] wechat micro-app service is initialized.");
    return service;
  }

  // ============ WeChat MP Service Beans ============

  @Bean
  @Primary
  @ConditionalOnMissingBean(WxMpService.class)
  @ConditionalOnProperty(
      prefix = INTEGRATE_WECHAT_MP_CONFIG_ENABLED_PROPERTIES,
      name = "enabled",
      havingValue = "true")
  public WxMpService wxMpService(WeChatIntegrateProperties properties) {

    // create new mp service bean
    WxMpService wxMpService = new WxMpServiceImpl();

    // build default config bean
    WxMpDefaultConfigImpl config = new WxMpDefaultConfigImpl();
    config.setAppId(properties.getMpConfig().getAppId());
    config.setSecret(properties.getMpConfig().getSecret());
    config.setToken(properties.getMpConfig().getToken());
    config.setAesKey(properties.getMpConfig().getAesKey());

    wxMpService.setWxMpConfigStorage(config);
    registerWxMpSubService(wxMpService);

    log.info("[==WeChat Applet==] wechat mp service is initialized.");
    return wxMpService;
  }

  private void registerWxMpSubService(WxMpService wxMpService) {
    ConfigurableListableBeanFactory factory =
        (ConfigurableListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
    factory.registerSingleton("wxMpKefuService", wxMpService.getKefuService());
    factory.registerSingleton("wxMpMaterialService", wxMpService.getMaterialService());
    factory.registerSingleton("wxMpMenuService", wxMpService.getMenuService());
    factory.registerSingleton("wxMpUserService", wxMpService.getUserService());
    factory.registerSingleton("wxMpUserTagService", wxMpService.getUserTagService());
    factory.registerSingleton("wxMpQrcodeService", wxMpService.getQrcodeService());
    factory.registerSingleton("wxMpCardService", wxMpService.getCardService());
    factory.registerSingleton("wxMpDataCubeService", wxMpService.getDataCubeService());
    factory.registerSingleton("wxMpUserBlacklistService", wxMpService.getBlackListService());
    factory.registerSingleton("wxMpStoreService", wxMpService.getStoreService());
    factory.registerSingleton("wxMpTemplateMsgService", wxMpService.getTemplateMsgService());
    factory.registerSingleton("wxMpSubscribeMsgService", wxMpService.getSubscribeMsgService());
    factory.registerSingleton("wxMpDeviceService", wxMpService.getDeviceService());
    factory.registerSingleton("wxMpShakeService", wxMpService.getShakeService());
    factory.registerSingleton("wxMpMemberCardService", wxMpService.getMemberCardService());
    factory.registerSingleton("wxMpMassMessageService", wxMpService.getMassMessageService());
  }

  // ============ WeChat WeChat Payment Service Beans ============

  /**
   * 构造微信支付服务对象.
   *
   * @return 微信支付service
   */
  @Bean
  @Primary
  @ConditionalOnMissingBean(WxPayService.class)
  @ConditionalOnProperty(
      prefix = INTEGRATE_WECHAT_PAY_CONFIG_ENABLED_PROPERTIES,
      name = "enabled",
      havingValue = "true")
  public WxPayService wxPayService(WeChatIntegrateProperties properties) {
    final WxPayServiceImpl wxPayService = new WxPayServiceImpl();
    WxPayConfig payConfig = new WxPayConfig();
    payConfig.setAppId(StringUtils.trimToNull(properties.getPayConfig().getAppId()));
    payConfig.setMchId(StringUtils.trimToNull(properties.getPayConfig().getMchId()));
    payConfig.setMchKey(StringUtils.trimToNull(properties.getPayConfig().getMchKey()));
    payConfig.setSubAppId(StringUtils.trimToNull(properties.getPayConfig().getSubAppId()));
    payConfig.setSubMchId(StringUtils.trimToNull(properties.getPayConfig().getSubMchId()));
    payConfig.setKeyPath(StringUtils.trimToNull(properties.getPayConfig().getKeyPath()));

    wxPayService.setConfig(payConfig);

    log.info("[==WeChat Applet==] wechat payment service is initialized.");
    return wxPayService;
  }

  // =========== Normal Override Method ===========

  @Override
  public void setApplicationContext(@NonNull ApplicationContext applicationContext)
      throws BeansException {
    this.applicationContext = applicationContext;
  }
}
