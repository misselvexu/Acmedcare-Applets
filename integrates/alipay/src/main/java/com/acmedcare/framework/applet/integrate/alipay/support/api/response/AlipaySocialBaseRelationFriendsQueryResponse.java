package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FriendListVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.friends.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-03 10:55:41
 */
public class AlipaySocialBaseRelationFriendsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4198781254379564192L;

	/** 
	 * 好友列表数据
	 */
	@ApiListField("friend_list")
	@ApiField("friend_list_v_o")
	private List<FriendListVO> friendList;

	public void setFriendList(List<FriendListVO> friendList) {
		this.friendList = friendList;
	}
	public List<FriendListVO> getFriendList( ) {
		return this.friendList;
	}

}
