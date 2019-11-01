package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OriDestOdItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.oridestod.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 19:51:15
 */
public class AlipayDataAiserviceCloudbusOridestodGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1151521665241175413L;

	/** 
	 * 7OD  结果
	 */
	@ApiListField("result")
	@ApiField("ori_dest_od_item")
	private List<OriDestOdItem> result;

	public void setResult(List<OriDestOdItem> result) {
		this.result = result;
	}
	public List<OriDestOdItem> getResult( ) {
		return this.result;
	}

}
