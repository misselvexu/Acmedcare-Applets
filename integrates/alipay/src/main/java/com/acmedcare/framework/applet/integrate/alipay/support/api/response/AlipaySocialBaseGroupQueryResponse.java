package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.GroupMemberInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3673517878652687288L;

	/** 
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 群的群成员总数
	 */
	@ApiField("group_member_count")
	private Long groupMemberCount;

	/** 
	 * 群成员列表
	 */
	@ApiListField("group_members")
	@ApiField("group_member_info")
	private List<GroupMemberInfo> groupMembers;

	/** 
	 * 群的名称
	 */
	@ApiField("group_name")
	private String groupName;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setGroupMemberCount(Long groupMemberCount) {
		this.groupMemberCount = groupMemberCount;
	}
	public Long getGroupMemberCount( ) {
		return this.groupMemberCount;
	}

	public void setGroupMembers(List<GroupMemberInfo> groupMembers) {
		this.groupMembers = groupMembers;
	}
	public List<GroupMemberInfo> getGroupMembers( ) {
		return this.groupMembers;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

}
