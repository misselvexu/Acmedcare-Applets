package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 返回给isv结果，成员为列表类型
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:12
 */
public class TableInfoResult extends AlipayObject {

	private static final long serialVersionUID = 4133388332474955644L;

	/**
	 * 返回TableListResult集合
	 */
	@ApiListField("table_info_list")
	@ApiField("table_list_result")
	private List<TableListResult> tableInfoList;

	public List<TableListResult> getTableInfoList() {
		return this.tableInfoList;
	}
	public void setTableInfoList(List<TableListResult> tableInfoList) {
		this.tableInfoList = tableInfoList;
	}

}
