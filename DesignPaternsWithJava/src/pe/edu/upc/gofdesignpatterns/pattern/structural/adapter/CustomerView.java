package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

import java.util.Optional;

import static java.util.Optional.of;

public class CustomerView extends RenderableView {
    @Override
    protected void renderInfo() {
        System.out.println(String.format("Customer Info: %s %s", getInfo().getTitle(), getInfo().getSubtitle()));
    }
}
