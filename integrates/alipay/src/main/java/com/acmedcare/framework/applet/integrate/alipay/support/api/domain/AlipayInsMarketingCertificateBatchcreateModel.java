package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 保险凭证批量创建
 *
 * @author auto create
 * @since 1.0, 2016-10-13 19:50:45
 */
public class AlipayInsMarketingCertificateBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 3532387921526197975L;

	/**
	 * 批量创建凭证请求
	 */
	@ApiListField("ins_create_certificate_requests")
	@ApiField("ins_create_certificate_request")
	private List<InsCreateCertificateRequest> insCreateCertificateRequests;

	public List<InsCreateCertificateRequest> getInsCreateCertificateRequests() {
		return this.insCreateCertificateRequests;
	}
	public void setInsCreateCertificateRequests(List<InsCreateCertificateRequest> insCreateCertificateRequests) {
		this.insCreateCertificateRequests = insCreateCertificateRequests;
	}

}
