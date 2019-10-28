package com.acmedcare.framework.applet.integrate.wechat.support.open.bean.fastma;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 修改更新类目所需实体
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @since 2019/1/25 10:49
 */
@Data
public class WxFastMaCategory implements Serializable {

  /** 一级类目ID */
  private int first;

  /** 二级类目ID */
  private int second;

  /** 资质信息 */
  private List<certicaty> certicates;

  @Data
  public static class certicaty {
    private String key;
    private String value;
  }
}
