package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 桌位排序
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:22
 */
public class KoubeiCateringPosDeskTransferModel extends AlipayObject {

	private static final long serialVersionUID = 6787871766392139773L;

	/**
	 * 餐区信息
	 */
	@ApiListField("sort_area")
	@ApiField("desk_area_entity")
	private List<DeskAreaEntity> sortArea;

	/**
	 * 桌位排序list
	 */
	@ApiListField("sort_desk")
	@ApiField("sort_desk_param")
	private List<SortDeskParam> sortDesk;

	public List<DeskAreaEntity> getSortArea() {
		return this.sortArea;
	}
	public void setSortArea(List<DeskAreaEntity> sortArea) {
		this.sortArea = sortArea;
	}

	public List<SortDeskParam> getSortDesk() {
		return this.sortDesk;
	}
	public void setSortDesk(List<SortDeskParam> sortDesk) {
		this.sortDesk = sortDesk;
	}

}
