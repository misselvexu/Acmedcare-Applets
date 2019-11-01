package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DeliveryOrderProcessVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliveryorderprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsDeliveryorderprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2393823788884225842L;

	/** 
	 * 物流单据状态列表
	 */
	@ApiListField("delivery_order_process_vo_list")
	@ApiField("delivery_order_process_v_o")
	private List<DeliveryOrderProcessVO> deliveryOrderProcessVoList;

	public void setDeliveryOrderProcessVoList(List<DeliveryOrderProcessVO> deliveryOrderProcessVoList) {
		this.deliveryOrderProcessVoList = deliveryOrderProcessVoList;
	}
	public List<DeliveryOrderProcessVO> getDeliveryOrderProcessVoList( ) {
		return this.deliveryOrderProcessVoList;
	}

}
