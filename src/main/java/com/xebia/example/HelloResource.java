package com.xebia.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by lwesterhoff on 02/08/16.
 */
@Path("/v1/hello")
public class HelloResource {

    @GET
    public Response hello() {
        return Response.ok("Hello").build();
    }
}
