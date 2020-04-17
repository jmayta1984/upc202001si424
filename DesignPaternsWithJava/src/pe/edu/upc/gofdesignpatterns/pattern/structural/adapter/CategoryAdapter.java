package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

import java.util.List;

public class CategoryAdapter implements CollectionAdapter {
    private List<Category> categories;

    public CategoryAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public int numberOfItems() {
        return categories.size();
    }

    @Override
    public Collectable getElementAt(int position) {
        return categories.get(position);
    }

    @Override
    public Renderable getHeader() {
        Renderable categoryHeader = new CategoryView();
        categoryHeader.setHeader("Categories");
        return categoryHeader;
    }

    @Override
    public Renderable getViewFromElementAt(int position) {
        Renderable categoryView = new CategoryView();
        categoryView.setInfo(categories.get(position));
        return categoryView;
    }
}
