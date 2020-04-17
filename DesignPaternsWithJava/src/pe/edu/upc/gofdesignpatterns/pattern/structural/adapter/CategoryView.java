package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public class CategoryView extends RenderableView {
    @Override
    protected void renderInfo() {
        System.out.print("Category Info: ");
        super.renderInfo();
    }
}
