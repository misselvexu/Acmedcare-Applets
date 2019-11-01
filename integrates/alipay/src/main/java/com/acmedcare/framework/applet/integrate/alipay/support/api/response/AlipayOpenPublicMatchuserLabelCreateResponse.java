package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ErrorMatcher;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 11:39:45
 */
public class AlipayOpenPublicMatchuserLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1587758584991224558L;

	/** 
	 * 用户打标失败数量
	 */
	@ApiField("error_count")
	private Long errorCount;

	/** 
	 * 出错的匹配器列表
	 */
	@ApiListField("error_matchers")
	@ApiField("error_matcher")
	private List<ErrorMatcher> errorMatchers;

	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}
	public Long getErrorCount( ) {
		return this.errorCount;
	}

	public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
		this.errorMatchers = errorMatchers;
	}
	public List<ErrorMatcher> getErrorMatchers( ) {
		return this.errorMatchers;
	}

}
