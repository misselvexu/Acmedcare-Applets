package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SceneContent;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SceneDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.scene.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseSceneContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4723246239951549711L;

	/** 
	 * 内容中台场景页文章信息
	 */
	@ApiListField("scene_content")
	@ApiField("scene_content")
	private List<SceneContent> sceneContent;

	/** 
	 * 场景详情信息
	 */
	@ApiField("scene_detail")
	private SceneDetail sceneDetail;

	/** 
	 * 更多文章跳转链接
	 */
	@ApiField("scheme")
	private String scheme;

	public void setSceneContent(List<SceneContent> sceneContent) {
		this.sceneContent = sceneContent;
	}
	public List<SceneContent> getSceneContent( ) {
		return this.sceneContent;
	}

	public void setSceneDetail(SceneDetail sceneDetail) {
		this.sceneDetail = sceneDetail;
	}
	public SceneDetail getSceneDetail( ) {
		return this.sceneDetail;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getScheme( ) {
		return this.scheme;
	}

}
