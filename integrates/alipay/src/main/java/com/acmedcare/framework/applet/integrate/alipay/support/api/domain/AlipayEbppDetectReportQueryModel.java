package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 准入任务检测结果查询
 *
 * @author auto create
 * @since 1.0, 2019-03-20 21:38:00
 */
public class AlipayEbppDetectReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3789274366946219512L;

	/**
	 * 外部业务标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
