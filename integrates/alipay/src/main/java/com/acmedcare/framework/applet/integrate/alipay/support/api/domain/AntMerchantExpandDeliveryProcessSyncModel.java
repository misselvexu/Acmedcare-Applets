package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物料发货计划反馈接口
 *
 * @author auto create
 * @since 1.0, 2019-06-03 19:46:00
 */
public class AntMerchantExpandDeliveryProcessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1868653969881869854L;

	/**
	 * 发货计划反馈信息
	 */
	@ApiField("asset_delivery_process_info")
	private AssetDeliveryProcessInfo assetDeliveryProcessInfo;

	public AssetDeliveryProcessInfo getAssetDeliveryProcessInfo() {
		return this.assetDeliveryProcessInfo;
	}
	public void setAssetDeliveryProcessInfo(AssetDeliveryProcessInfo assetDeliveryProcessInfo) {
		this.assetDeliveryProcessInfo = assetDeliveryProcessInfo;
	}

}
