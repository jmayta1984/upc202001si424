package pe.edu.upc.jakartademoapplication.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greetings")
public class GreetingResource {

    @GET
    public String greeting(){
        return "Hello UPC";
    }
}
