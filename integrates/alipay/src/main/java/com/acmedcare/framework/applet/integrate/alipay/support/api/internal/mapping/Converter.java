package com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayApiException;
import com.acmedcare.framework.applet.integrate.alipay.support.api.Decryptor;
import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayRequest;
import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;
import com.acmedcare.framework.applet.integrate.alipay.support.api.CertItem;
import com.acmedcare.framework.applet.integrate.alipay.support.api.SignItem;

/**
 * 动态格式转换器。
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Converter {

    /**
     * 把字符串转换为响应对象。
     *
     * @param <T>   领域泛型
     * @param rsp   响应字符串
     * @param clazz 领域类型
     * @return 响应对象
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
            throws AlipayApiException;

    /**
     * 获取响应内的签名数据
     *
     * @param request
     * @param responseBody
     * @return
     * @throws AlipayApiException
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException;

    /**
     * 获取响应内的证书和签名数据
     *
     * @param request
     * @param responseBody
     * @return
     * @throws AlipayApiException
     */
    public CertItem getCertItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException;

    /**
     * 获取解密后的响应内的真实内容
     *
     * @param request
     * @param body
     * @param format
     * @param decryptor
     * @param encryptType
     * @param charset
     * @return
     * @throws AlipayApiException
     */
    public String decryptSourceData(AlipayRequest<?> request, String body, String format,
                                    Decryptor decryptor, String encryptType, String charset)
            throws AlipayApiException;

}
