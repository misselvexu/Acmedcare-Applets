package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.bill.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 19:45:07
 */
public class AlipayEcoRenthouseBillOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8427759512673114338L;

	/** 
	 * billNo-账单编号
status-1:成功
	 */
	@ApiListField("result_bill_list")
	@ApiField("string")
	private List<String> resultBillList;

	public void setResultBillList(List<String> resultBillList) {
		this.resultBillList = resultBillList;
	}
	public List<String> getResultBillList( ) {
		return this.resultBillList;
	}

}
