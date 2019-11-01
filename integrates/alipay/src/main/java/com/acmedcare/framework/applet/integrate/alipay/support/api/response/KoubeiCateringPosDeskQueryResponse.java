package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DeskEntity;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.desk.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosDeskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2489487466858368679L;

	/** 
	 * 餐台信息
	 */
	@ApiListField("pos_desk_list")
	@ApiField("desk_entity")
	private List<DeskEntity> posDeskList;

	public void setPosDeskList(List<DeskEntity> posDeskList) {
		this.posDeskList = posDeskList;
	}
	public List<DeskEntity> getPosDeskList( ) {
		return this.posDeskList;
	}

}
