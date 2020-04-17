package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public class Category implements Collectable {
    private final String name;
    private final String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public String getSubtitle() {
        return description;
    }
}
