package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

import java.util.List;

public class CustomerAdapter implements CollectionAdapter {

    private final List<Customer> customers;

    public CustomerAdapter(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public int numberOfItems() {
        return customers.size();
    }

    @Override
    public Collectable getElementAt(int position) {
        return customers.get(position);
    }

    @Override
    public Renderable getHeader() {
        Renderable customerHeader = new CustomerView();
        customerHeader.setHeader("Customers");
        return customerHeader;
    }

    public Renderable getViewFromElementAt(int position) {
        Renderable customerView = new CustomerView();
        customerView.setInfo(getElementAt(position));
        return customerView;
    }
}
