package com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaTemplateMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.WxMaUniformMessage;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.analysis.WxMaRetainInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.analysis.WxMaUserPortrait;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.analysis.WxMaVisitDistribution;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.code.WxMaCodeCommitRequest;
import com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.code.WxMaCodeVersionDistribution;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
public class WxMaGsonBuilder {
  private static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(WxMaTemplateMessage.class, new WxMaTemplateMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMaUniformMessage.class, new WxMaUniformMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMaCodeCommitRequest.class, new WxMaCodeCommitRequestGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMaCodeVersionDistribution.class, new WxMaCodeVersionDistributionGsonAdapter());
    INSTANCE.registerTypeAdapter(
        WxMaVisitDistribution.class, new WxMaVisitDistributionGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMaRetainInfo.class, new WxMaRetainInfoGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMaUserPortrait.class, new WxMaUserPortraitGsonAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }
}
