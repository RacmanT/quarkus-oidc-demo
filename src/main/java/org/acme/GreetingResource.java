package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/ping")
public class GreetingResource {

    @ConfigProperty(name = "quarkus.oidc.logout.path")
    String logoutPath;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return logoutPath;
    }
}
