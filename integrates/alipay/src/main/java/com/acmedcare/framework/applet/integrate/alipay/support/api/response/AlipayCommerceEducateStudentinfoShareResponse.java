package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.EduStudentInfoShareResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.studentinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceEducateStudentinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 6847559548218161136L;

	/** 
	 * 学生信息
	 */
	@ApiField("student_info_share_result")
	private EduStudentInfoShareResult studentInfoShareResult;

	public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult) {
		this.studentInfoShareResult = studentInfoShareResult;
	}
	public EduStudentInfoShareResult getStudentInfoShareResult( ) {
		return this.studentInfoShareResult;
	}

}
