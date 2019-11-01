package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 取消订单或退货完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-09-20 10:30:22
 */
public class AntMerchantExpandAssetreverseCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2448917252753392735L;

	/**
	 * 取消订单或退货成功入参
	 */
	@ApiListField("asset_reverse_details")
	@ApiField("asset_reverse_detail")
	private List<AssetReverseDetail> assetReverseDetails;

	public List<AssetReverseDetail> getAssetReverseDetails() {
		return this.assetReverseDetails;
	}
	public void setAssetReverseDetails(List<AssetReverseDetail> assetReverseDetails) {
		this.assetReverseDetails = assetReverseDetails;
	}

}
