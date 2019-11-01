package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbdishDictionary;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.dictionary.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringDishDictionaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8819644123464497242L;

	/** 
	 * 返回的字典数据列表
	 */
	@ApiListField("kb_dish_dictionary_list")
	@ApiField("kbdish_dictionary")
	private List<KbdishDictionary> kbDishDictionaryList;

	public void setKbDishDictionaryList(List<KbdishDictionary> kbDishDictionaryList) {
		this.kbDishDictionaryList = kbDishDictionaryList;
	}
	public List<KbdishDictionary> getKbDishDictionaryList( ) {
		return this.kbDishDictionaryList;
	}

}
