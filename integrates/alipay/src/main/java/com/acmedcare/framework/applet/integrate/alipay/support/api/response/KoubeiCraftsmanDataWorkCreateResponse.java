package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CraftsmanWorkOutIdOpenModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.work.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCraftsmanDataWorkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5894256722546812976L;

	/** 
	 * 作品id
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_out_id_open_model")
	private List<CraftsmanWorkOutIdOpenModel> works;

	public void setWorks(List<CraftsmanWorkOutIdOpenModel> works) {
		this.works = works;
	}
	public List<CraftsmanWorkOutIdOpenModel> getWorks( ) {
		return this.works;
	}

}
