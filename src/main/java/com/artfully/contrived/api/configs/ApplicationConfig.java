package com.artfully.contrived.api.configs;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.codahale.metrics.jersey2.InstrumentedResourceMethodApplicationListener;

@ApplicationPath("api")
public class ApplicationConfig extends ResourceConfig {

  public ApplicationConfig() {
    register(new InstrumentedResourceMethodApplicationListener(MetricsConfig.METRIC_REGISTRY));
    packages("com.artfully.contrived.api.resources");
  }
}
