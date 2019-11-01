package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryInstBillInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppBillSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6765149164473676615L;

	/** 
	 * 已经缓存的的key
	 */
	@ApiField("cachekey")
	private String cachekey;

	/** 
	 * 实时查询欠费单返回对象
	 */
	@ApiListField("inst_bill_info_list")
	@ApiField("query_inst_bill_info")
	private List<QueryInstBillInfo> instBillInfoList;

	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}
	public String getCachekey( ) {
		return this.cachekey;
	}

	public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}
	public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}
