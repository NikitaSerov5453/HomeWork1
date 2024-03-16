package org.example.home.dao;

import org.example.home.entity.Department;
import org.example.home.entity.Employee;

import java.util.TreeMap;

public interface Dao {

    void addEmployee(Employee employee);

    void updateEmployeeName(Employee employee, String name);

    void updateEmployeeSurname(Employee employee, String surname);

    void updateEmployeeSalary(Employee employee, Long salary);

    void deleteByEmployeeId(Long id);

    void addDepartment(Department department);

    void updateDepartmentName(Department department, String departmentName);

    void deleteByDepartmentId(Long id);

    TreeMap<Long, Employee> getAllEmployee();

    TreeMap<Long, Department> getAllDepartment();
}
