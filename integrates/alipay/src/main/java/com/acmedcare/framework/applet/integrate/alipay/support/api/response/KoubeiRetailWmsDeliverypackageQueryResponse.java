package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DeliveryPackageVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliverypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsDeliverypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6242815381142133383L;

	/** 
	 * 包裹列表
	 */
	@ApiListField("delivery_package_vo_list")
	@ApiField("delivery_package_v_o")
	private List<DeliveryPackageVO> deliveryPackageVoList;

	public void setDeliveryPackageVoList(List<DeliveryPackageVO> deliveryPackageVoList) {
		this.deliveryPackageVoList = deliveryPackageVoList;
	}
	public List<DeliveryPackageVO> getDeliveryPackageVoList( ) {
		return this.deliveryPackageVoList;
	}

}
