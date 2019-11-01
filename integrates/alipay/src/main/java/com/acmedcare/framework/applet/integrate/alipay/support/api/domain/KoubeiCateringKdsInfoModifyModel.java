package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 更新kds详情
 *
 * @author auto create
 * @since 1.0, 2019-03-05 15:49:38
 */
public class KoubeiCateringKdsInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3282291728362178825L;

	/**
	 * kds配置详情
	 */
	@ApiListField("kds_info_model_list")
	@ApiField("kds_info_model")
	private List<KdsInfoModel> kdsInfoModelList;

	public List<KdsInfoModel> getKdsInfoModelList() {
		return this.kdsInfoModelList;
	}
	public void setKdsInfoModelList(List<KdsInfoModel> kdsInfoModelList) {
		this.kdsInfoModelList = kdsInfoModelList;
	}

}
