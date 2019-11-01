package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 展台对应的内容信息列表
 *
 * @author auto create
 * @since 1.0, 2019-01-29 14:19:28
 */
public class BoothContentInfoModel extends AlipayObject {

	private static final long serialVersionUID = 6352481431355589352L;

	/**
	 * 展台名称
	 */
	@ApiField("booth")
	private String booth;

	/**
	 * 内容信息列表
	 */
	@ApiListField("content_info_list")
	@ApiField("content_info_model")
	private List<ContentInfoModel> contentInfoList;

	public String getBooth() {
		return this.booth;
	}
	public void setBooth(String booth) {
		this.booth = booth;
	}

	public List<ContentInfoModel> getContentInfoList() {
		return this.contentInfoList;
	}
	public void setContentInfoList(List<ContentInfoModel> contentInfoList) {
		this.contentInfoList = contentInfoList;
	}

}
