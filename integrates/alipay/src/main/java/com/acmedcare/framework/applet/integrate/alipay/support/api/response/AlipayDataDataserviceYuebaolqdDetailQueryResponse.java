package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayYebLqdDataResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.yuebaolqd.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 16:29:24
 */
public class AlipayDataDataserviceYuebaolqdDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1224171686884968432L;

	/** 
	 * 余额宝清算日预测申赎数据
	 */
	@ApiListField("yeb_ldq_data")
	@ApiField("alipay_yeb_lqd_data_result")
	private List<AlipayYebLqdDataResult> yebLdqData;

	public void setYebLdqData(List<AlipayYebLqdDataResult> yebLdqData) {
		this.yebLdqData = yebLdqData;
	}
	public List<AlipayYebLqdDataResult> getYebLdqData( ) {
		return this.yebLdqData;
	}

}
