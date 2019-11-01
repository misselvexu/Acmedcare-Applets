package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PracticeEntity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.practice.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosPracticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1899188287524272696L;

	/** 
	 * 做法模型
	 */
	@ApiListField("practice_entity_list")
	@ApiField("practice_entity")
	private List<PracticeEntity> practiceEntityList;

	public void setPracticeEntityList(List<PracticeEntity> practiceEntityList) {
		this.practiceEntityList = practiceEntityList;
	}
	public List<PracticeEntity> getPracticeEntityList( ) {
		return this.practiceEntityList;
	}

}
