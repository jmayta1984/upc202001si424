package pe.edu.upc.jakartademoapplication.business.impl;

import pe.edu.upc.jakartademoapplication.business.CustomerBusiness;
import pe.edu.upc.jakartademoapplication.model.entity.Customer;
import pe.edu.upc.jakartademoapplication.model.repository.CustomerRepository;

import javax.inject.Inject;
import java.util.List;

public class CustomerBusinessImpl implements CustomerBusiness {

    @Inject
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() throws Exception {
        return customerRepository.findAll();
    }
}
