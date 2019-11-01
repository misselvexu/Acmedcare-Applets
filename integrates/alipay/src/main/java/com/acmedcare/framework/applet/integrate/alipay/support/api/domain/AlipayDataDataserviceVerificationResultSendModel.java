package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 验证结果反馈
 *
 * @author auto create
 * @since 1.0, 2019-08-14 15:13:41
 */
public class AlipayDataDataserviceVerificationResultSendModel extends AlipayObject {

	private static final long serialVersionUID = 7643959828472834852L;

	/**
	 * 部署单记录id
	 */
	@ApiField("record_id")
	private Long recordId;

	/**
	 * 验证结果列表
	 */
	@ApiListField("result_items")
	@ApiField("dx_verify_result_item")
	private List<DxVerifyResultItem> resultItems;

	public Long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public List<DxVerifyResultItem> getResultItems() {
		return this.resultItems;
	}
	public void setResultItems(List<DxVerifyResultItem> resultItems) {
		this.resultItems = resultItems;
	}

}
