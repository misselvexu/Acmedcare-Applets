package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.notice.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-22 13:05:00
 */
public class KoubeiServindustryExerciseNoticeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132557859898765148L;

	/** 
	 * 通知ID
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
