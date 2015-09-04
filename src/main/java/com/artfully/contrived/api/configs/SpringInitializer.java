package com.artfully.contrived.api.configs;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.artfully.contrived.api.listeners.MyHealthCheckServletContextListener;
import com.artfully.contrived.api.listeners.MyMetricsServletContextListener;
import com.codahale.metrics.servlets.AdminServlet;

public class SpringInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    //add metrics stuff listeners
    servletContext.addListener(MyMetricsServletContextListener.class);
    servletContext.addListener(MyHealthCheckServletContextListener.class);

    servletContext.addListener(ContextLoaderListener.class);

    servletContext.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM,
        AnnotationConfigWebApplicationContext.class.getName());
    servletContext.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM, SpringConfiguration.class.getName());

    ServletRegistration.Dynamic jerseyServlet = servletContext.addServlet("bestone", ServletContainer.class.getName());
    jerseyServlet.addMapping("/api/*");
    jerseyServlet.setLoadOnStartup(1);
    jerseyServlet.setInitParameter("javax.ws.rs.Application", ApplicationConfig.class.getName());

    ServletRegistration.Dynamic metricsServlet = servletContext.addServlet("metrics", AdminServlet.class.getName());
    metricsServlet.addMapping("/metrics/*");
  }

}
