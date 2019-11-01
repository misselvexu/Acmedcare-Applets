package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 风险雷达上传监控实体列表接口
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:33:27
 */
public class ZhimaCreditEpEntityMonitorUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7515252916318973422L;

	/**
	 * 监控实体列表（实体名，实体代码）
	 */
	@ApiField("entity_list")
	private String entityList;

	/**
	 * 监控实体类别
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 监控方案ID,可空
	 */
	@ApiField("solution_id")
	private String solutionId;

	/**
	 * 芝麻商户2688 ID
	 */
	@ApiField("zhima_pid")
	private String zhimaPid;

	public String getEntityList() {
		return this.entityList;
	}
	public void setEntityList(String entityList) {
		this.entityList = entityList;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getZhimaPid() {
		return this.zhimaPid;
	}
	public void setZhimaPid(String zhimaPid) {
		this.zhimaPid = zhimaPid;
	}

}
