package com.artfully.contrived.api.listeners;

import com.artfully.contrived.api.configs.MetricsConfig;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;

public class MyMetricsServletContextListener extends MetricsServlet.ContextListener {

  @Override
  protected MetricRegistry getMetricRegistry() {
    return MetricsConfig.METRIC_REGISTRY;
  }
}