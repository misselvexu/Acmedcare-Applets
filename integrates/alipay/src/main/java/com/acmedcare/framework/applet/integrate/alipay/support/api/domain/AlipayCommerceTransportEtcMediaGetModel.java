package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * etc办理资料接口
 *
 * @author auto create
 * @since 1.0, 2019-05-25 14:25:26
 */
public class AlipayCommerceTransportEtcMediaGetModel extends AlipayObject {

	private static final long serialVersionUID = 6633842724872162658L;

	/**
	 * 业务标识。
1：身份证正面照片；
2：身份证背面照片；
3：行驶证正页正面照片；
4：行驶证副页正面照片；
5：车头照片
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝生成的申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
