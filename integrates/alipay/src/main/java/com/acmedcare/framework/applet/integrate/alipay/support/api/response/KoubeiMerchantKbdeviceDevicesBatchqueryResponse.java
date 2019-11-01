package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DeviceInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbdevice.devices.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbdeviceDevicesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8224454191675517725L;

	/** 
	 * 门店下设备列表
	 */
	@ApiListField("device_info_list")
	@ApiField("device_info")
	private List<DeviceInfo> deviceInfoList;

	public void setDeviceInfoList(List<DeviceInfo> deviceInfoList) {
		this.deviceInfoList = deviceInfoList;
	}
	public List<DeviceInfo> getDeviceInfoList( ) {
		return this.deviceInfoList;
	}

}
