package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SubCertDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.subcert.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignSubcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1744963499274554645L;

	/** 
	 * 子凭证详细信息
	 */
	@ApiListField("subcert_list")
	@ApiField("sub_cert_detail")
	private List<SubCertDetail> subcertList;

	/** 
	 * 有效子凭证条数
	 */
	@ApiField("total_num")
	private String totalNum;

	public void setSubcertList(List<SubCertDetail> subcertList) {
		this.subcertList = subcertList;
	}
	public List<SubCertDetail> getSubcertList( ) {
		return this.subcertList;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
