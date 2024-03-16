package org.example.home.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class Department {

    private static int numberCreation;

    private Long id;

    @Setter
    private String departmentName;

    public Department() {
        numberCreation++;
        this.id = (long) numberCreation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
