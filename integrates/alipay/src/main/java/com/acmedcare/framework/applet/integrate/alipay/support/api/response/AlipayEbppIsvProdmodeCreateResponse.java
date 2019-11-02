package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.isv.prodmode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppIsvProdmodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5765389474813251792L;

	/** 
	 * 流程实例ID
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 创建产品模型成功后返回任务ID
	 */
	@ApiField("task_id")
	private String taskId;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}