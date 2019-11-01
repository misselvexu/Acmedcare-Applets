package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MiniAppModelQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.model.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 17:03:25
 */
public class AlipayOpenMiniModelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7654484827127859789L;

	/** 
	 * 蚂蚁域小程序核心模型查询接口返回对象，model_type：查询模型类型，records：记录列表
	 */
	@ApiListField("model_infos")
	@ApiField("mini_app_model_query_response")
	private List<MiniAppModelQueryResponse> modelInfos;

	public void setModelInfos(List<MiniAppModelQueryResponse> modelInfos) {
		this.modelInfos = modelInfos;
	}
	public List<MiniAppModelQueryResponse> getModelInfos( ) {
		return this.modelInfos;
	}

}
