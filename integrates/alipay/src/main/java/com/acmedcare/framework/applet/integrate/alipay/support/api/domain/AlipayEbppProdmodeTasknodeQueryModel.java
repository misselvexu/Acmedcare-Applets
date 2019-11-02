package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 审批任务节点状态API
 *
 * @author auto create
 * @since 1.0, 2018-11-15 19:43:07
 */
public class AlipayEbppProdmodeTasknodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4282443163589731987L;

	/**
	 * 任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}