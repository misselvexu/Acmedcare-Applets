package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExerciseUserMappingDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.memberphone.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 16:05:22
 */
public class KoubeiServindustryExerciseMemberphoneSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6352615148165191813L;

	/** 
	 * 健身用户手机号与健身用户id映射
	 */
	@ApiListField("mapping_list")
	@ApiField("exercise_user_mapping_d_t_o")
	private List<ExerciseUserMappingDTO> mappingList;

	public void setMappingList(List<ExerciseUserMappingDTO> mappingList) {
		this.mappingList = mappingList;
	}
	public List<ExerciseUserMappingDTO> getMappingList( ) {
		return this.mappingList;
	}

}
