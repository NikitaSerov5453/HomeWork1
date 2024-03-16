package org.example.home.entity;

import lombok.*;


@Getter
@AllArgsConstructor
@Builder
public class Employee {

    private static int numberCreation;

    private Long id;

    @Setter
    private String name;

    @Setter
    private String surname;

    @Setter
    private Long salary;

    public Employee() {
        numberCreation++;
        this.id = (long) numberCreation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
