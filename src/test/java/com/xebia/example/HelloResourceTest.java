package com.xebia.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwesterhoff on 02/08/16.
 */
public class HelloResourceTest extends JerseyTest {

    @Override
    protected javax.ws.rs.core.Application configure() {
        return new ResourceConfig(HelloResource.class);
    }

    @Test
    public void test() {
        final String responseBody = target("/v1/hello").request().get(String.class);
        assertEquals("Hello", responseBody);
    }
}
