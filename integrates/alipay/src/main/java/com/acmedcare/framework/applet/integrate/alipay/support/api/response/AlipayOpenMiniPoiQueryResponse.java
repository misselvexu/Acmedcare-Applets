package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.NearbyAddressInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniPoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2464995691547346677L;

	/** 
	 * 可添加地址的最大数量
	 */
	@ApiField("max_count")
	private Long maxCount;

	/** 
	 * POI信息列表
	 */
	@ApiListField("nearby_address_info_list")
	@ApiField("nearby_address_info")
	private List<NearbyAddressInfo> nearbyAddressInfoList;

	/** 
	 * 当前已添加地址数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}
	public Long getMaxCount( ) {
		return this.maxCount;
	}

	public void setNearbyAddressInfoList(List<NearbyAddressInfo> nearbyAddressInfoList) {
		this.nearbyAddressInfoList = nearbyAddressInfoList;
	}
	public List<NearbyAddressInfo> getNearbyAddressInfoList( ) {
		return this.nearbyAddressInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
