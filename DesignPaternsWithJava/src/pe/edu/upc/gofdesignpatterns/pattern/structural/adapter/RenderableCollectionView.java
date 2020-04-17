package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

import java.util.stream.IntStream;

public class RenderableCollectionView {
    private  CollectionAdapter adapter;
    public void renderView() {
        // Render header
        adapter.getHeader().render();
        // Render elements
        IntStream.range(0, adapter.numberOfItems())
                .forEach(i -> adapter.getViewFromElementAt(i).render());
    }

    public RenderableCollectionView setAdapter(CollectionAdapter adapter) {
        this.adapter = adapter;
        return this;
    }
}
