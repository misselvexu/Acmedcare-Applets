package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.membertask.process.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-05 15:11:13
 */
public class AlipayUserMembertaskProcessSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3744565477729436132L;

	/** 
	 * 任务推进结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 任务推进结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 异常是否可重试
	 */
	@ApiField("retriable")
	private String retriable;

	/** 
	 * 任务推进调用结果，不代表推进实际成功，推进是否成功由内部保证，外围无需关心
	 */
	@ApiField("success")
	private String success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setRetriable(String retriable) {
		this.retriable = retriable;
	}
	public String getRetriable( ) {
		return this.retriable;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}