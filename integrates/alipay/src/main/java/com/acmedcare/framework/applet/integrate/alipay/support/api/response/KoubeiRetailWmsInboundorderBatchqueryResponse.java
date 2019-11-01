package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InboundOrderVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2826117387328427142L;

	/** 
	 * 入库通知单列表
	 */
	@ApiListField("inbound_order_vo_list")
	@ApiField("inbound_order_v_o")
	private List<InboundOrderVO> inboundOrderVoList;

	public void setInboundOrderVoList(List<InboundOrderVO> inboundOrderVoList) {
		this.inboundOrderVoList = inboundOrderVoList;
	}
	public List<InboundOrderVO> getInboundOrderVoList( ) {
		return this.inboundOrderVoList;
	}

}
