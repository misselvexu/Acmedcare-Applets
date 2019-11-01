package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;
import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 库存查询条件
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class StockQueryCondition extends AlipayObject {

	private static final long serialVersionUID = 8664924729488624482L;

	/**
	 * 库存查询结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 站点列表
	 */
	@ApiListField("position")
	@ApiField("position")
	private List<Position> position;

	/**
	 * 库存查询起始日期
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Position> getPosition() {
		return this.position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
