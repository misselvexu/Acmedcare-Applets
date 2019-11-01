package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.modellist.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceIotModellistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4684134223122721123L;

	/** 
	 * 重复的型号id列表，当所请求创建的型号已经存在时，则将已存在的型号id列表通过该字段返回
	 */
	@ApiListField("duplicated_model_ids")
	@ApiField("string")
	private List<String> duplicatedModelIds;

	public void setDuplicatedModelIds(List<String> duplicatedModelIds) {
		this.duplicatedModelIds = duplicatedModelIds;
	}
	public List<String> getDuplicatedModelIds( ) {
		return this.duplicatedModelIds;
	}

}
