package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 表格一行内容
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:04:10
 */
public class AiOcrTableRow extends AlipayObject {

	private static final long serialVersionUID = 8577441849561569982L;

	/**
	 * table一行的内容
	 */
	@ApiListField("row")
	@ApiField("ai_ocr_table_context")
	private List<AiOcrTableContext> row;

	public List<AiOcrTableContext> getRow() {
		return this.row;
	}
	public void setRow(List<AiOcrTableContext> row) {
		this.row = row;
	}

}
