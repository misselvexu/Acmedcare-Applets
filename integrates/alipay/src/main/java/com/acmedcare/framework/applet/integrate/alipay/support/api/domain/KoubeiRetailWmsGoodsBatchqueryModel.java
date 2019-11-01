package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 口碑零售货品信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:16:42
 */
public class KoubeiRetailWmsGoodsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8331436661786166681L;

	/**
	 * 货品编码，限制批量查询100个
	 */
	@ApiListField("goods_codes")
	@ApiField("string")
	private List<String> goodsCodes;

	public List<String> getGoodsCodes() {
		return this.goodsCodes;
	}
	public void setGoodsCodes(List<String> goodsCodes) {
		this.goodsCodes = goodsCodes;
	}

}
