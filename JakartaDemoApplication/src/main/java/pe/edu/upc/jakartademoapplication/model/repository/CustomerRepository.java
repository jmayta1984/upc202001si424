package pe.edu.upc.jakartademoapplication.model.repository;

import pe.edu.upc.jakartademoapplication.model.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll() throws Exception;
}
