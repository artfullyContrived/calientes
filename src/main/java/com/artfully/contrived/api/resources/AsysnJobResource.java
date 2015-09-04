package com.artfully.contrived.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;

@Path("async")
@Produces(MediaType.APPLICATION_JSON)
public class AsysnJobResource {

  @GET
  @Timed
  public Response runAsync(@QueryParam("sleepTime") int sleepTime) {
    return Response.accepted().build();
  }

}
