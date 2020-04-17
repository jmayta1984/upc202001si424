package pe.edu.upc.gofdesignpatterns.pattern.structural.facade;

import java.util.List;

public class BusinessFacade {

    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;


    public BusinessFacade() {
        categoryRepository = new CategoryRepository();
        customerRepository = new CustomerRepository();
    }

    public void addCustomer(Customer customer) {
        customerRepository.add(customer);
    }

    public void addCategory(Category category) {
        categoryRepository.add(category);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }

    public List<Category> getAllCategories() {
        return categoryRepository.getAll();
    }
}
