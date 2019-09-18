package com.acmedcare.framework.applet.integrate.aorp;

import com.acmedcare.framework.applet.integrate.aorp.endpoints.DefaultAuthEndpoint;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Feature;
import java.util.Set;

import static com.acmedcare.framework.applet.integrate.api.AppletEndpoints.APPLET_ENDPOINT_PREFIX;

/**
 * {@link DefaultEndpointApplication}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2019/9/18.
 */
@Component
@ApplicationPath(APPLET_ENDPOINT_PREFIX)
public class DefaultEndpointApplication extends Application {

  /**
   * Get a set of root resource, provider and {@link Feature feature} classes.
   *
   * <p>The default life-cycle for resource class instances is per-request. The default life-cycle
   * for providers (registered directly or via a feature) is singleton.
   *
   * <p>Implementations should warn about and ignore classes that do not conform to the requirements
   * of root resource or provider/feature classes. Implementations should warn about and ignore
   * classes for which {@link #getSingletons()} returns an instance. Implementations MUST NOT modify
   * the returned set.
   *
   * <p>The default implementation returns an empty set.
   *
   * @return a set of root resource and provider classes. Returning {@code null} is equivalent to
   *     returning an empty set.
   */
  @Override
  public Set<Class<?>> getClasses() {
    return Sets.newHashSet(DefaultAuthEndpoint.class);
  }
}
