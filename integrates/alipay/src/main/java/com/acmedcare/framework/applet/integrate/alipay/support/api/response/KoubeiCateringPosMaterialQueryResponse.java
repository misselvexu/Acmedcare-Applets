package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MaterialEntity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4821772832417852622L;

	/** 
	 * 配料对象
	 */
	@ApiListField("material_entity_list")
	@ApiField("material_entity")
	private List<MaterialEntity> materialEntityList;

	public void setMaterialEntityList(List<MaterialEntity> materialEntityList) {
		this.materialEntityList = materialEntityList;
	}
	public List<MaterialEntity> getMaterialEntityList( ) {
		return this.materialEntityList;
	}

}
