package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物料信息变更反馈接口
 *
 * @author auto create
 * @since 1.0, 2019-01-09 20:31:32
 */
public class AntMerchantExpandAssetinfoCorrectionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8881623191264441365L;

	/**
	 * 物料信息更正请求
	 */
	@ApiField("asset_correction")
	private AssetInfoCorrectionItem assetCorrection;

	public AssetInfoCorrectionItem getAssetCorrection() {
		return this.assetCorrection;
	}
	public void setAssetCorrection(AssetInfoCorrectionItem assetCorrection) {
		this.assetCorrection = assetCorrection;
	}

}
