package pe.edu.upc.jakartademoapplication.boundary;

import pe.edu.upc.jakartademoapplication.business.CustomerBusiness;
import pe.edu.upc.jakartademoapplication.model.entity.Customer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("customers")
public class CustomerResource {

    @Inject
    private CustomerBusiness customerBusiness;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();

        try {
            customers = customerBusiness.findAll();
        } catch (Exception e){
        }

        return customers;
    }
}
