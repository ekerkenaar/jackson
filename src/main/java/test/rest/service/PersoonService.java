package test.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.joda.time.DateTime;

import test.rest.domain.Persoon;

@Path("persoon-service")
public class PersoonService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Persoon getPersoon() {
        return new Persoon("Jan", "Janssen", new DateTime());
    }
}
