package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public interface Renderable {
    public boolean isHeader();
    public void setHeader(String header);
    public void setInfo(Collectable item);
    public Collectable getInfo();
    public void render();
}
