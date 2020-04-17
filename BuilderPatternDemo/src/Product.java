import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }


    public void add(String part) {

        parts.add(part);
    }

    public void show() {

        System.out.println("\nProduct completed as below :");

        // iterating using for loop
        /*    for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }*/

        // iterating enhanced for loop
        for (String part : parts) {
            System.out.println(parts);
        }
    }
}
