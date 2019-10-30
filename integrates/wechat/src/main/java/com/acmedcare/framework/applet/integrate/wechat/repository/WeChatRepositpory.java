package com.acmedcare.framework.applet.integrate.wechat.repository;

import com.acmedcare.framework.applet.integrate.common.spi.Extension;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.acmedcare.framework.applet.integrate.wechat.WeChatExtensionDefined.WECHAT;

/**
 * {@link WeChatRepositpory}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/30.
 */
@Extension(WECHAT)
public class WeChatRepositpory extends AppletsRepository {

  private static final Logger log = LoggerFactory.getLogger(WeChatRepositpory.class);


}
