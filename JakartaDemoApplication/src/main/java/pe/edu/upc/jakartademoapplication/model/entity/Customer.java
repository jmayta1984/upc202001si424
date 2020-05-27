package pe.edu.upc.jakartademoapplication.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
