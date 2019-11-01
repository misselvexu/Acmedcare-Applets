package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SupplierReport;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SupplierReportDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplierreportdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsSupplierreportdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2355284181663496693L;

	/** 
	 * 盘点单信息
	 */
	@ApiField("supplier_report")
	private SupplierReport supplierReport;

	/** 
	 * 盘点单明细记录
	 */
	@ApiListField("supplier_report_details")
	@ApiField("supplier_report_detail")
	private List<SupplierReportDetail> supplierReportDetails;

	public void setSupplierReport(SupplierReport supplierReport) {
		this.supplierReport = supplierReport;
	}
	public SupplierReport getSupplierReport( ) {
		return this.supplierReport;
	}

	public void setSupplierReportDetails(List<SupplierReportDetail> supplierReportDetails) {
		this.supplierReportDetails = supplierReportDetails;
	}
	public List<SupplierReportDetail> getSupplierReportDetails( ) {
		return this.supplierReportDetails;
	}

}
