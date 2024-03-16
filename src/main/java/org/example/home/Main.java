package org.example.home;

import org.example.home.entity.Department;
import org.example.home.entity.Employee;
import org.example.home.service.Service;

public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        Department department1 = new Department();

        Employee employee = new Employee();
        Employee employee1 = new Employee();

        Service service = new Service();

        service.addEmployee(employee);
        service.addEmployee(employee1);

        service.addDepartment(department);
        service.addDepartment(department1);

        System.out.println(service.getAllEmployee());
        System.out.println(service.getAllDepartment());

        service.updateEmployeeSurname(employee, "Серов");
        System.out.println(service.getAllEmployee());
    }
}
