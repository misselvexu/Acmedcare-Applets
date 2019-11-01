package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GroupRecord;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenDataServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5652942288988878948L;

	/** 
	 * 返回结果
	 */
	@ApiListField("group_records")
	@ApiField("group_record")
	private List<GroupRecord> groupRecords;

	/** 
	 * 是否成功
true：成功
false:失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setGroupRecords(List<GroupRecord> groupRecords) {
		this.groupRecords = groupRecords;
	}
	public List<GroupRecord> getGroupRecords( ) {
		return this.groupRecords;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
