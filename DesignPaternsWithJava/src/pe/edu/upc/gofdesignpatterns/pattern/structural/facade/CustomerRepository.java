package pe.edu.upc.gofdesignpatterns.pattern.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;


    public CustomerRepository() {
        this.customers = new ArrayList<Customer>();
    }

    public void add(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getAll() {
        return this.customers;
    }

}
