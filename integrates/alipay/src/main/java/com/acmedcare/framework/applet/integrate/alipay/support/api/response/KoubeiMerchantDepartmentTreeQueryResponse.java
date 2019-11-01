package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DepartmentDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.tree.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantDepartmentTreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4131266491349937448L;

	/** 
	 * 商户部门组织模型集合，根据返回的结果构造出商户的部门树
	 */
	@ApiListField("department_dtos")
	@ApiField("department_d_t_o")
	private List<DepartmentDTO> departmentDtos;

	public void setDepartmentDtos(List<DepartmentDTO> departmentDtos) {
		this.departmentDtos = departmentDtos;
	}
	public List<DepartmentDTO> getDepartmentDtos( ) {
		return this.departmentDtos;
	}

}
