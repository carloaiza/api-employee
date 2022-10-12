package co.edu.umanizales.apiemployee.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String identification;
    private String name;
    private String lastName;
    private int age;
    private String phone;
}
