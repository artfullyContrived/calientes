package com.artfully.contrived.api.resources;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.artfully.contrived.api.services.GreetingService;
import com.codahale.metrics.annotation.Timed;

@Path("greetings")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

  @Context
  private ServletContext context;

  //@Inject
  private GreetingService greetingService;

  @GET
  @Timed
  public Response getGreeting(@QueryParam("name") String name) {

    //String greeting = greetingService.greet(name);
    String greeting = "Hello "+ name;
    return Response.status(200).entity(greeting).build();
  }

}
