package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SupplierVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplier.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsSupplierQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2432264723487287763L;

	/** 
	 * 供应商信息
	 */
	@ApiListField("suppliers")
	@ApiField("supplier_v_o")
	private List<SupplierVO> suppliers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setSuppliers(List<SupplierVO> suppliers) {
		this.suppliers = suppliers;
	}
	public List<SupplierVO> getSuppliers( ) {
		return this.suppliers;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
