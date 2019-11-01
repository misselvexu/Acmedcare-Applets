package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ProducerVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.producer.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsProducerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8351656687536554416L;

	/** 
	 * 生产厂商信息
	 */
	@ApiListField("producers")
	@ApiField("producer_v_o")
	private List<ProducerVO> producers;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setProducers(List<ProducerVO> producers) {
		this.producers = producers;
	}
	public List<ProducerVO> getProducers( ) {
		return this.producers;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
