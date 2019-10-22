package com.acmedcare.framework.applet.server.tester;

import com.acmedcare.framework.applet.integrate.api.AppletsSPIExtensionFactory;
import com.acmedcare.framework.applet.integrate.dingtalk.bean.DingTalkPrincipal;
import com.acmedcare.framework.applet.integrate.dingtalk.repository.DingTalkRepository;
import com.acmedcare.framework.applet.integrate.storage.api.AppletsRepository;
import com.acmedcare.framework.applet.integrate.storage.api.model.AppletAuthModel;
import com.acmedcare.framework.applet.server.AppletServerBootstrap;
import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.acmedcare.framework.applet.integrate.dingtalk.DingTalkExtensionDefined.DING_TALK;

/**
 * {@link RdbServiceTest}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/10/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppletServerBootstrap.class)
public class RdbServiceTest {


  @Test
  public void testSave() throws Exception {

    AppletAuthModel.AppletAuthModelKey key =
        AppletAuthModel.AppletAuthModelKey.builder()
            .thirdPlatformId("280342300093621182")
            .thirdPlatformType(DING_TALK)
            .build();


    DingTalkPrincipal dingTalkPrincipal = DingTalkPrincipal.builder()

        .avatar("")
        .basePlatformPrincipalId("111")
        .basePlatformPrincipalToken("111")
        .name("bella")
        .unionid("KeDwVAziiPM4fahfaxPJuaQiEiE")
        .userid("280342300093621182")
        .build();

    DingTalkRepository repository =
        (DingTalkRepository) AppletsSPIExtensionFactory.getRepository(DING_TALK, AppletsRepository.class);

    repository.savePrincipal(key,dingTalkPrincipal);

    DingTalkPrincipal principal = repository.queryPrincipal(key,DingTalkPrincipal.class);

    Assert.assertNotNull(principal);

    System.out.println(JSON.toJSONString(principal));

    Assert.assertEquals(dingTalkPrincipal.getUserid(),principal.getUserid());

  }

}
