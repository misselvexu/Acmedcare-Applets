package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 视觉货柜商品上新采集请求
 *
 * @author auto create
 * @since 1.0, 2019-01-04 11:54:30
 */
public class AlipayMsaasMediarecogMmtcaftscvGoodsApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7858466486538928395L;

	/**
	 * 商品上新批次号
	 */
	@ApiField("batch_num")
	private String batchNum;

	/**
	 * 上新商品信息列表
	 */
	@ApiListField("goods_infos")
	@ApiField("apply_goods_info")
	private List<ApplyGoodsInfo> goodsInfos;

	/**
	 * 视觉货柜机型ID
	 */
	@ApiField("machine_type_id")
	private String machineTypeId;

	public String getBatchNum() {
		return this.batchNum;
	}
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public List<ApplyGoodsInfo> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<ApplyGoodsInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getMachineTypeId() {
		return this.machineTypeId;
	}
	public void setMachineTypeId(String machineTypeId) {
		this.machineTypeId = machineTypeId;
	}

}
