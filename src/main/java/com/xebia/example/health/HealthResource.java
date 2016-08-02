package com.xebia.example.health;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by jamiecraane on 07/07/16.
 */
@Path("/v1/health")
public class HealthResource {
    @GET
    public Response health() {
//        todo add additional health checks if required to inform the load balancer of the application is ready to serve requests.
        return Response.ok().build();
    }
}
