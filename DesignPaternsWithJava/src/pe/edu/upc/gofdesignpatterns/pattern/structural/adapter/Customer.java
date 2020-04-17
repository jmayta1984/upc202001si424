package pe.edu.upc.gofdesignpatterns.pattern.structural.adapter;

public class Customer implements Collectable {
    private final String firstName;
    private final String lastName;
    private final String jobTitle;

    public Customer(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    @Override
    public String getTitle() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String getSubtitle() {
        return String.format("who works as %s", jobTitle);
    }
}
