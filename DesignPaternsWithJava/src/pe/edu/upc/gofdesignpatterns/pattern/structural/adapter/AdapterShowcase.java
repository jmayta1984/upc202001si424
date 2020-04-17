package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

import pe.edu.upc.gofdesignpatterns.common.Showcase;

import java.util.ArrayList;
import java.util.List;

public class AdapterShowcase implements Showcase {
    private final CustomerAdapter customerAdapter;
    private final CategoryAdapter categoryAdapter;
    private final List<Customer> customers;
    private final List<Category> categories;
    private final RenderableCollectionView collectionView;
    public AdapterShowcase() {
        customers = new ArrayList<>();
        categories = new ArrayList<>();
        customers.add(new Customer("Ethan","Hunt","IMF Agent"));
        customers.add(new Customer("Bruce", "Wayne", "CEO"));
        categories.add(new Category("Premium", "Customers with monthly purchase beyond 1K"));
        categories.add(new Category("Standard", "Customer with monthly purchase between 500 and 1K"));
        customerAdapter = new CustomerAdapter(customers);
        categoryAdapter = new CategoryAdapter(categories);
        collectionView = new RenderableCollectionView();

    }

    @Override
    public void show() {
        System.out.println("Adapter Pattern Showcase");
        collectionView.setAdapter(customerAdapter).renderView();
        collectionView.setAdapter(categoryAdapter).renderView();

    }
}
