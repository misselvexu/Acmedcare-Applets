package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 标签删除接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:49:25
 */
public class AlipayOpenPublicLifeLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8534938888931313426L;

	/**
	 * 标签id, 只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

}
