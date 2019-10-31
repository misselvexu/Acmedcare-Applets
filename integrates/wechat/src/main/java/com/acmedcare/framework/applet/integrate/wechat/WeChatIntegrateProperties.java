package com.acmedcare.framework.applet.integrate.wechat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * {@link WeChatIntegrateProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties(prefix = WeChatIntegrateProperties.INTEGRATE_PROPERTIES_CONFIG_PREFIX)
public class WeChatIntegrateProperties {

  static final String INTEGRATE_PROPERTIES_CONFIG_PREFIX = "applet.integrate.wechat";

  private boolean enabled = false;

  /**
   * WeChat Micro Application Integrate Config Properties
   *
   * @see MicroApplicationProperties
   */
  @NestedConfigurationProperty private MicroApplicationProperties microAppConfig;

  /**
   * WeChat MP Platform Integrate Config Properties
   *
   * @see WeChatMPProperties
   */
  @NestedConfigurationProperty private WeChatMPProperties mpConfig;

  /**
   * WeChat Payment Integrate Config Properties
   *
   * @see WeChatPayProperties
   */
  @NestedConfigurationProperty private WeChatPayProperties payConfig;

  // ======= Supported Properties Defined =======

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class MicroApplicationProperties implements Serializable {

    static final String INTEGRATE_WECHAT_MICRO_APPLICATION_CONFIG_ENABLED_PROPERTIES = "applet.integrate.wechat.micro-app-config";

    private boolean enabled = false;

    /** 设置微信小程序的appid. */
    private String appid;

    /** 设置微信小程序的Secret. */
    private String secret;

    /** 设置微信小程序消息服务器配置的token. */
    private String token;

    /** 设置微信小程序消息服务器配置的EncodingAESKey. */
    private String aesKey;

    /** 消息格式，XML或者JSON. */
    private DataFormat msgDataFormat;

    public enum DataFormat {
      JSON,
      XML;
    }
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class WeChatMPProperties implements Serializable {

    static final String INTEGRATE_WECHAT_MP_CONFIG_ENABLED_PROPERTIES = "applet.integrate.wechat.mp-config";

    private boolean enabled = false;

    /** 设置微信公众号的appid. */
    private String appId;

    /** 设置微信公众号的app secret. */
    private String secret;

    /** 设置微信公众号的token. */
    private String token;

    /** 设置微信公众号的EncodingAESKey. */
    private String aesKey;
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class WeChatPayProperties implements Serializable {

    static final String INTEGRATE_WECHAT_PAY_CONFIG_ENABLED_PROPERTIES = "applet.integrate.wechat.pay-config";

    private boolean enabled = false;

    /** 设置微信公众号或者小程序等的appid. */
    private String appId;

    /** 微信支付商户号. */
    private String mchId;

    /** 微信支付商户密钥. */
    private String mchKey;

    /** 服务商模式下的子商户公众账号ID，普通模式请不要配置，请在配置文件中将对应项删除. */
    private String subAppId;

    /** 服务商模式下的子商户号，普通模式请不要配置，最好是请在配置文件中将对应项删除. */
    private String subMchId;

    /** apiclient_cert.p12文件的绝对路径，或者如果放在项目中，请以classpath:开头指定. */
    private String keyPath;

    /** 支付回调通知URL地址 */
    private String notifyUrl;
  }
}
