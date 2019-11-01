package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 城服用户证件查询
 *
 * @author auto create
 * @since 1.0, 2019-05-23 15:31:32
 */
public class AlipayEcoCityserviceCertinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7464991932153178447L;

	/**
	 * 用户证件信息列表。
	 */
	@ApiListField("cert_infos")
	@ApiField("cert_info_request")
	private List<CertInfoRequest> certInfos;

	public List<CertInfoRequest> getCertInfos() {
		return this.certInfos;
	}
	public void setCertInfos(List<CertInfoRequest> certInfos) {
		this.certInfos = certInfos;
	}

}
