package com.acmedcare.framework.applet.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * {@link AppletServerBootstrap}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/17.
 */
@SpringBootApplication
public class AppletServerBootstrap {

  public static void main(String[] args) {
    new SpringApplicationBuilder(AppletServerBootstrap.class)
        .web(WebApplicationType.SERVLET)
        .properties("spring.profiles.active=production")
        .run(args);
  }
}
