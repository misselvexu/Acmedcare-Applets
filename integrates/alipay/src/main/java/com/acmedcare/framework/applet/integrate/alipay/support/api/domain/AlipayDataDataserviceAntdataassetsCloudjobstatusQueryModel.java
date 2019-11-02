package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 上云任务状态查询
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:23:01
 */
public class AlipayDataDataserviceAntdataassetsCloudjobstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6565696148246534182L;

	/**
	 * 分区信息
	 */
	@ApiField("bizdate")
	private String bizdate;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	public String getBizdate() {
		return this.bizdate;
	}
	public void setBizdate(String bizdate) {
		this.bizdate = bizdate;
	}

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

}