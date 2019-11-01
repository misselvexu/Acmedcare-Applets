package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IpAddrLbsInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.ipaddrinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityDataInfoIpaddrinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1664966911963148257L;

	/** 
	 * ip_addr_lbs_info:IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
	 */
	@ApiField("ip_addr_lbs_info")
	private IpAddrLbsInfo ipAddrLbsInfo;

	public void setIpAddrLbsInfo(IpAddrLbsInfo ipAddrLbsInfo) {
		this.ipAddrLbsInfo = ipAddrLbsInfo;
	}
	public IpAddrLbsInfo getIpAddrLbsInfo( ) {
		return this.ipAddrLbsInfo;
	}

}
