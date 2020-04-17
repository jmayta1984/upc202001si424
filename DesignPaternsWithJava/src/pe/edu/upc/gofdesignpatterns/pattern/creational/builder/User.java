package pe.edu.upc.gofdesignpatterns.pattern.creational.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phone;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("User withFirstName: %s, withLastName: %s, withAge: %d", this.firstName, this.lastName, this.age);
    }

    public static class Builder {
        private String firstName;
        protected String lastName;
        protected int age;
        protected String address;
        protected String phone;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return (isValid()) ? new User(this) : null;
        }

        public boolean isValid() {
            return age > 0;
        }
    }
}
