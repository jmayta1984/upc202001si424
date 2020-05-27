package pe.edu.upc.jakartademoapplication.model.repository.impl;

import pe.edu.upc.jakartademoapplication.model.entity.Customer;
import pe.edu.upc.jakartademoapplication.model.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() throws Exception {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1,"Daniel", "Rosales"));
        customers.add(new Customer(2,"Juan", "Perez"));
        customers.add(new Customer(3,"Carlos", "Fuentes"));

        return customers;

    }
}
