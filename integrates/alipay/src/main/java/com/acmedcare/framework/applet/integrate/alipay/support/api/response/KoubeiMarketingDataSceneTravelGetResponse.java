package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SceneMarketingContentGroup;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SceneMarketingHeader;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.scene.travel.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataSceneTravelGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6114263183485281246L;

	/** 
	 * 场景营销内容分组场景营
	 */
	@ApiListField("content")
	@ApiField("scene_marketing_content_group")
	private List<SceneMarketingContentGroup> content;

	/** 
	 * 场景营销头部信息
	 */
	@ApiField("header")
	private SceneMarketingHeader header;

	public void setContent(List<SceneMarketingContentGroup> content) {
		this.content = content;
	}
	public List<SceneMarketingContentGroup> getContent( ) {
		return this.content;
	}

	public void setHeader(SceneMarketingHeader header) {
		this.header = header;
	}
	public SceneMarketingHeader getHeader( ) {
		return this.header;
	}

}
