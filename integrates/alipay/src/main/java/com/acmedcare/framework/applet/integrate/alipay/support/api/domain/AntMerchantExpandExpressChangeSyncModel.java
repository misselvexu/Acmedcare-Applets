package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物流状态信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2019-06-03 19:46:51
 */
public class AntMerchantExpandExpressChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7758292278356688767L;

	/**
	 * 传入需要上传的附件内容及相关业务参数
	 */
	@ApiField("asset_logistics_record")
	private AssetLogisticsRecord assetLogisticsRecord;

	public AssetLogisticsRecord getAssetLogisticsRecord() {
		return this.assetLogisticsRecord;
	}
	public void setAssetLogisticsRecord(AssetLogisticsRecord assetLogisticsRecord) {
		this.assetLogisticsRecord = assetLogisticsRecord;
	}

}
