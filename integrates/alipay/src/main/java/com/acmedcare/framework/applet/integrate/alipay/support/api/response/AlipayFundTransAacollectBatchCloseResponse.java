package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundTransAacollectBatchCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7686397636435321152L;

	/** 
	 * * 批次状态
     * <p>
     *      <b>一阶段模式:</b>
     *      <pre>
     *                                 ----> SUCCESS
     *                              /
     *                             /
     *          INIT ----------> FIRST_STAGE---> PART_SUCCESS
     *                             \
     *                              \
     *                               -----> FAIL
     *      </pre>
     * </p>
	 */
	@ApiField("batch_status")
	private String batchStatus;

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

}
