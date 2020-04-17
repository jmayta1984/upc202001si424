package pe.edu.upc.gofdesignpatterns.pattern.creational.builder;

import pe.edu.upc.gofdesignpatterns.common.Showcase;

public class BuilderShowcase implements Showcase {

    @Override
    public void show() {
        System.out.println("Builder Pattern Showcase");
        User john = new User.Builder()
                .withFirstName("John")
                .withLastName("Doe")
                .withAge(25)
                .withAddress("Nowhere")
                .withPhone("990000000")
                .build();

        User bruce = new User.Builder()
                .withFirstName("Bruce")
                .withLastName("Wayne")
                .withAge(45)
                .build();
        System.out.println(john);
        System.out.println(bruce);

    }
}
