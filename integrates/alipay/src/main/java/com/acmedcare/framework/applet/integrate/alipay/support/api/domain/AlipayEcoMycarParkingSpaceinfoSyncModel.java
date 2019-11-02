package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 停车场车位信息同步
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:18:16
 */
public class AlipayEcoMycarParkingSpaceinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8778345499372262446L;

	/**
	 * 空闲充电桩车位数
	 */
	@ApiField("free_charging_pile")
	private Long freeChargingPile;

	/**
	 * 车场空闲可用的车位数
	 */
	@ApiField("free_parking_space")
	private Long freeParkingSpace;

	/**
	 * 停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 停车场实时状态: 0 拥堵,1 正常，2 空闲
	 */
	@ApiField("parking_space_status")
	private String parkingSpaceStatus;

	public Long getFreeChargingPile() {
		return this.freeChargingPile;
	}
	public void setFreeChargingPile(Long freeChargingPile) {
		this.freeChargingPile = freeChargingPile;
	}

	public Long getFreeParkingSpace() {
		return this.freeParkingSpace;
	}
	public void setFreeParkingSpace(Long freeParkingSpace) {
		this.freeParkingSpace = freeParkingSpace;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingSpaceStatus() {
		return this.parkingSpaceStatus;
	}
	public void setParkingSpaceStatus(String parkingSpaceStatus) {
		this.parkingSpaceStatus = parkingSpaceStatus;
	}

}