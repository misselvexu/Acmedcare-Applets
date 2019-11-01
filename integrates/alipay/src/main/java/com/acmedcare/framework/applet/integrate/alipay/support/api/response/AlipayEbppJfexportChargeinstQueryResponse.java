package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.JfExportChargeInstModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.chargeinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppJfexportChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3736535133849582151L;

	/** 
	 * 输出的机构列表
	 */
	@ApiListField("charge_insts")
	@ApiField("jf_export_charge_inst_model")
	private List<JfExportChargeInstModel> chargeInsts;

	/** 
	 * 开通的出账机构总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setChargeInsts(List<JfExportChargeInstModel> chargeInsts) {
		this.chargeInsts = chargeInsts;
	}
	public List<JfExportChargeInstModel> getChargeInsts( ) {
		return this.chargeInsts;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
