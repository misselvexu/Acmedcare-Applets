package com.acmedcare.framework.applet.integrate.wechat.support.mp.api.impl;

import com.acmedcare.framework.applet.integrate.wechat.support.common.bean.menu.WxMenu;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpMenuService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.api.WxMpService;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.menu.WxMpGetSelfMenuInfoResult;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.menu.WxMpMenu;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.enums.WxMpApiUrl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Acmedcare+ Developer on 2016/7/21.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Slf4j
@RequiredArgsConstructor
public class WxMpMenuServiceImpl implements WxMpMenuService {
  private final WxMpService wxMpService;

  @Override
  public String menuCreate(WxMenu menu) throws WxErrorException {
    String menuJson = menu.toJson();
    WxMpApiUrl.Menu url = WxMpApiUrl.Menu.MENU_CREATE;
    if (menu.getMatchRule() != null) {
      url = WxMpApiUrl.Menu.MENU_ADDCONDITIONAL;
    }

    log.debug("开始创建菜单：{}", menuJson);

    String result = this.wxMpService.post(url, menuJson);
    log.debug("创建菜单：{},结果：{}", menuJson, result);

    if (menu.getMatchRule() != null) {
      return new JsonParser().parse(result).getAsJsonObject().get("menuid").getAsString();
    }

    return null;
  }

  @Override
  public String menuCreate(String json) throws WxErrorException {
    JsonParser jsonParser = new JsonParser();
    JsonObject jsonObject = jsonParser.parse(json).getAsJsonObject();
    WxMpApiUrl.Menu url = WxMpApiUrl.Menu.MENU_CREATE;
    if (jsonObject.get("matchrule") != null) {
      url = WxMpApiUrl.Menu.MENU_ADDCONDITIONAL;
    }

    String result = this.wxMpService.post(url, json);
    if (jsonObject.get("matchrule") != null) {
      return jsonParser.parse(result).getAsJsonObject().get("menuid").getAsString();
    }

    return null;
  }

  @Override
  public void menuDelete() throws WxErrorException {
    String result = this.wxMpService.get(WxMpApiUrl.Menu.MENU_DELETE, null);
    log.debug("删除菜单结果：{}", result);
  }

  @Override
  public void menuDelete(String menuId) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("menuid", menuId);
    String result =
        this.wxMpService.post(WxMpApiUrl.Menu.MENU_DELCONDITIONAL, jsonObject.toString());
    log.debug("根据MeunId({})删除个性化菜单结果：{}", menuId, result);
  }

  @Override
  public WxMpMenu menuGet() throws WxErrorException {
    try {
      String resultContent = this.wxMpService.get(WxMpApiUrl.Menu.MENU_GET, null);
      return WxMpMenu.fromJson(resultContent);
    } catch (WxErrorException e) {
      // 46003 不存在的菜单数据
      if (e.getError().getErrorCode() == 46003) {
        return null;
      }
      throw e;
    }
  }

  @Override
  public WxMenu menuTryMatch(String userid) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("user_id", userid);
    try {
      String resultContent =
          this.wxMpService.post(WxMpApiUrl.Menu.MENU_TRYMATCH, jsonObject.toString());
      return WxMenu.fromJson(resultContent);
    } catch (WxErrorException e) {
      // 46003 不存在的菜单数据；46002 不存在的菜单版本
      if (e.getError().getErrorCode() == 46003 || e.getError().getErrorCode() == 46002) {
        return null;
      }
      throw e;
    }
  }

  @Override
  public WxMpGetSelfMenuInfoResult getSelfMenuInfo() throws WxErrorException {
    String resultContent = this.wxMpService.get(WxMpApiUrl.Menu.GET_CURRENT_SELFMENU_INFO, null);
    return WxMpGetSelfMenuInfoResult.fromJson(resultContent);
  }
}
