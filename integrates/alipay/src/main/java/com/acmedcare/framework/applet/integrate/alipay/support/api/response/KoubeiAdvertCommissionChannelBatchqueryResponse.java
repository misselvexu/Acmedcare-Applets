package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertChannelResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5179739465948954254L;

	/** 
	 * 渠道信息
	 */
	@ApiField("data")
	private KbAdvertChannelResponse data;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 每页页数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setData(KbAdvertChannelResponse data) {
		this.data = data;
	}
	public KbAdvertChannelResponse getData( ) {
		return this.data;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
