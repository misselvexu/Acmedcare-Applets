package com.acmedcare.framework.applet.integrate.alipay.support.api.request;

import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CommerceAppUploadRequestContent;
import java.util.HashMap;
import java.util.Map;

import com.acmedcare.framework.applet.integrate.alipay.support.api.FileItem;
import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayUploadRequest;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.util.AlipayHashMap;
import com.acmedcare.framework.applet.integrate.alipay.support.api.response.AlipayCommerceAppUploadResponse;
import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.app.upload request
 * 
 * @author auto create
 * @since 1.0, 2019-05-29 09:35:01
 */
public class AlipayCommerceAppUploadRequest implements AlipayUploadRequest<AlipayCommerceAppUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 租户应用服务数据
	 */
	private CommerceAppUploadRequestContent content;

	/** 
	* 上传文件的二进制流
	 */
	private FileItem file;

	/** 
	* 租户应用服务名称
	 */
	private String serviceName;

	/** 
	* 目标租户
	 */
	private String targetId;

	public void setContent(CommerceAppUploadRequestContent content) {
		this.content = content;
	}
	public CommerceAppUploadRequestContent getContent() {
		return this.content;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}
	public FileItem getFile() {
		return this.file;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceName() {
		return this.serviceName;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetId() {
		return this.targetId;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.app.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("content", this.content == null? null : new com.acmedcare.framework.applet.integrate.alipay.support.api.internal.util.json.JSONWriter().write(this.content, true));
		txtParams.put("service_name", this.serviceName);
		txtParams.put("target_id", this.targetId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
		return params;
	}

	public Class<AlipayCommerceAppUploadResponse> getResponseClass() {
		return AlipayCommerceAppUploadResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}