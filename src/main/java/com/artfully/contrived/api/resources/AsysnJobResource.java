package com.artfully.contrived.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("async")
@Produces(MediaType.APPLICATION_JSON)
public class AsysnJobResource {

  @GET
  public Response runAsync(int sleepTime) {
    return Response.accepted().build();
  }

}
