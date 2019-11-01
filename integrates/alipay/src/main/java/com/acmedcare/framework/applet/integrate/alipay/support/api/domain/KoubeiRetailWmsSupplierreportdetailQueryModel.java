package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 供货商通知单详情
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:11
 */
public class KoubeiRetailWmsSupplierreportdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1491183112659811886L;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	public String getSupplierReportId() {
		return this.supplierReportId;
	}
	public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

}
