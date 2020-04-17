public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setBorder(decoratorShape);
    }

    private void setBorder(Shape decoratorShape) {
        System.out.println("Bolder color: Red");
    }
}
