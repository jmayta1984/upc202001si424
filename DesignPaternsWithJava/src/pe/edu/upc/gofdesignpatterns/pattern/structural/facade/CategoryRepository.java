package pe.edu.upc.gofdesignpatterns.pattern.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    private List<Category> categories;


    public CategoryRepository() {
        this.categories = new ArrayList<Category>();
    }

    public void add(Category category) {
        this.categories.add(category);
    }

    public List<Category> getAll() {
        return categories;
    }

}
