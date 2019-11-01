package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 口碑零售生产厂商信息批量查询
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:38:14
 */
public class KoubeiRetailWmsProducerBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1865769475432978713L;

	/**
	 * 最多查询100个
	 */
	@ApiListField("producer_ids")
	@ApiField("string")
	private List<String> producerIds;

	public List<String> getProducerIds() {
		return this.producerIds;
	}
	public void setProducerIds(List<String> producerIds) {
		this.producerIds = producerIds;
	}

}
