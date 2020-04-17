package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public abstract class RenderableView  implements Renderable {
    private boolean isHeader;
    private String header;
    private Collectable info;

    @Override
    public Collectable getInfo() {
        return info;
    }

    @Override
    public boolean isHeader() {
        return isHeader;
    }

    @Override
    public void setHeader(String header) {
        if(header.length() > 0) {
            this.header = header;
            isHeader = true;
        }
    }

    @Override
    public void setInfo(Collectable item) {
        info = item;
        isHeader = false;
    }

    private void renderHeader() {
        System.out.println(String.format("Section: %s", header));
    }


    protected void renderInfo() {
        System.out.println(String.format("%s %s", info.getTitle(), info.getSubtitle()));
    }
    @Override
    public void render() {
        if(isHeader ) renderHeader();
        else {
            renderInfo();
        }
    }
}
