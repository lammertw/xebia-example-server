package com.xebia.example;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by jamiecraane on 07/07/16.
 */
@ApplicationPath("/")
public class Application extends ResourceConfig {
    public Application() {
        packages(
                "com.xebia.example",
                "io.swagger.jaxrs.listing"
        );

        // Enable this to log all request and responses
        // registerInstances(new LoggingFilter(Logger.getLogger(Application.class.getName()), true));
    }
}
