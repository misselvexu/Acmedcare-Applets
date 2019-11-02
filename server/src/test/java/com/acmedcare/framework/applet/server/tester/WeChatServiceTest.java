package com.acmedcare.framework.applet.server.tester;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.api.WxMaService;
import com.acmedcare.framework.applet.server.AppletServerBootstrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * {@link WeChatServiceTest}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppletServerBootstrap.class)
public class WeChatServiceTest {

  @Autowired WxMaService wxMaService;

  @Test
  public void test01() throws Exception {


    System.out.println(wxMaService.getAccessToken());


  }
}
