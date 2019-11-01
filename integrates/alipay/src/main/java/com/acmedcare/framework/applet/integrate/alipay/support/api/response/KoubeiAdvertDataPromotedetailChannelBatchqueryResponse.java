package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoteDetailChannelModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotedetail.channel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDataPromotedetailChannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3141474223629492573L;

	/** 
	 * 业务数据
	 */
	@ApiListField("data")
	@ApiField("promote_detail_channel_model")
	private List<PromoteDetailChannelModel> data;

	/** 
	 * 当前页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setData(List<PromoteDetailChannelModel> data) {
		this.data = data;
	}
	public List<PromoteDetailChannelModel> getData( ) {
		return this.data;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
