public class BridgePatternDemo {

    public static void main (String[] args){
        Shape redCircle = new Circle(5,5,10, new RedCircle());

        Shape greenCircle = new Circle(5,5,10, new GreenCircle());

        redCircle.draw();

        greenCircle.draw();
    }
}
