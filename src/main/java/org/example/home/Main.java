package org.example.home;

import org.example.home.dao.DaoImpl;
import org.example.home.dbconfig.DBConfig;
import org.example.home.entity.Department;
import org.example.home.entity.Employee;
import org.example.home.service.EntityServiceImpl;

public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        Department department1 = new Department();


        Employee employee = new Employee();
        Employee employee1 = new Employee();

        EntityServiceImpl employeeServiceImpl = new EntityServiceImpl(new DaoImpl(new DBConfig()));

        employeeServiceImpl.addEmployee(employee);
        employeeServiceImpl.addEmployee(employee1);

        employeeServiceImpl.addDepartment(department);
        employeeServiceImpl.addDepartment(department1);

        System.out.println(employeeServiceImpl.getAllEmployee());
        System.out.println(employeeServiceImpl.getAllDepartment());

        employeeServiceImpl.updateEmployeeSurname(employee, "Серов");
        System.out.println(employeeServiceImpl.getAllEmployee());
    }
}
