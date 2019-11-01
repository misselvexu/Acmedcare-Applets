package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 申请S码的结果对象
 *
 * @author auto create
 * @since 1.0, 2019-09-18 18:03:11
 */
public class ApplyCodeResponse extends AlipayObject {

	private static final long serialVersionUID = 1198618332246127659L;

	/**
	 * apply_code_results，申请S码的结果中的批量发码结果
	 */
	@ApiListField("apply_code_result")
	@ApiField("apply_code_result")
	private List<ApplyCodeResult> applyCodeResult;

	public List<ApplyCodeResult> getApplyCodeResult() {
		return this.applyCodeResult;
	}
	public void setApplyCodeResult(List<ApplyCodeResult> applyCodeResult) {
		this.applyCodeResult = applyCodeResult;
	}

}
