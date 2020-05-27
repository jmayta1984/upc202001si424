package pe.edu.upc.jakartademoapplication.business;

import pe.edu.upc.jakartademoapplication.model.entity.Customer;

import java.util.List;

public interface CustomerBusiness {
    List<Customer> findAll() throws Exception;

}
