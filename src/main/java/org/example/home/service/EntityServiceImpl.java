package org.example.home.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.example.home.dao.Dao;
import org.example.home.entity.Department;
import org.example.home.entity.Employee;

import java.util.TreeMap;


@Service
@RequiredArgsConstructor
public class EntityServiceImpl implements EntityService {

    private final Dao dao;

    @Override
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }

    @Override
    public void updateEmployeeName(Employee employee, String name) {
        dao.updateEmployeeName(employee, name);
    }

    @Override
    public void updateEmployeeSurname(Employee employee, String surname) {
        dao.updateEmployeeSurname(employee, surname);
    }

    @Override
    public void updateEmployeeSalary(Employee employee, Long salary) {
        dao.updateEmployeeSalary(employee, salary);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        dao.deleteByEmployeeId(id);
    }

    @Override
    public void addDepartment(Department department) {
        dao.addDepartment(department);
    }

    @Override
    public void updateDepartmentName(Department department, String departmentName) {
        dao.updateDepartmentName(department, departmentName);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        dao.deleteByDepartmentId(id);
    }

    @Override
    public TreeMap<Long, Employee> getAllEmployee() {
        return dao.getAllEmployee();
    }

    @Override
    public TreeMap<Long, Department> getAllDepartment() {
        return dao.getAllDepartment();
    }
}
