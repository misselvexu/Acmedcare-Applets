package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CustomerEntity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataassets.metadata response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayZdataassetsMetadataResponse extends AlipayResponse {

	private static final long serialVersionUID = 7758934118479381257L;

	/** 
	 * 用户标签集合
	 */
	@ApiListField("result")
	@ApiField("customer_entity")
	private List<CustomerEntity> result;

	public void setResult(List<CustomerEntity> result) {
		this.result = result;
	}
	public List<CustomerEntity> getResult( ) {
		return this.result;
	}

}
