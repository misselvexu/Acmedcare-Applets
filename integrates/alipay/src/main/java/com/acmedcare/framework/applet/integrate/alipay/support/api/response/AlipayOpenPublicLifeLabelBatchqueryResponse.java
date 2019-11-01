package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.LifeLabel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicLifeLabelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795991695329379997L;

	/** 
	 * 标签列表
	 */
	@ApiListField("labels")
	@ApiField("life_label")
	private List<LifeLabel> labels;

	public void setLabels(List<LifeLabel> labels) {
		this.labels = labels;
	}
	public List<LifeLabel> getLabels( ) {
		return this.labels;
	}

}
