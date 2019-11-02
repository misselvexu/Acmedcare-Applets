package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 10:50:06
 */
public class AlipaySecurityRiskVerifyidentityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4635899232579386414L;

	/** 
	 * 可用性查询失败错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 核身可用性查询错误描述
	 */
	@ApiField("err_message")
	private String errMessage;

	/** 
	 * 系统是否处理成功，true表示系统成功处理，false表示系统异常，系统处理成功不表示业务成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 不可用产品集合
	 */
	@ApiField("unusable_product_list")
	private String unusableProductList;

	/** 
	 * 可用产品集合
	 */
	@ApiField("usable_product_group")
	private String usableProductGroup;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public String getErrMessage( ) {
		return this.errMessage;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setUnusableProductList(String unusableProductList) {
		this.unusableProductList = unusableProductList;
	}
	public String getUnusableProductList( ) {
		return this.unusableProductList;
	}

	public void setUsableProductGroup(String usableProductGroup) {
		this.usableProductGroup = usableProductGroup;
	}
	public String getUsableProductGroup( ) {
		return this.usableProductGroup;
	}

}