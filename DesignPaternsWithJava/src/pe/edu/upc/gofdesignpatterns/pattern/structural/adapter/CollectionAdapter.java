package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public interface CollectionAdapter {
    public int numberOfItems();
    public Collectable getElementAt(int position);
    public Renderable getHeader();
    public Renderable getViewFromElementAt(int position);
}
