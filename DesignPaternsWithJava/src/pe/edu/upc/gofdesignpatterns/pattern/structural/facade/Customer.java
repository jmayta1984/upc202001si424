package pe.edu.upc.gofdesignpatterns.pattern.structural.facade;

public class Customer {
    private String firstName;
    private String lastName;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
