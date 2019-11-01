package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SignTaskResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdSignatureTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3111778657977228635L;

	/** 
	 * 签约订单id，关联了若干个签约任务id。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约认证任务列表
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_result")
	private List<SignTaskResult> taskList;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setTaskList(List<SignTaskResult> taskList) {
		this.taskList = taskList;
	}
	public List<SignTaskResult> getTaskList( ) {
		return this.taskList;
	}

}
