package org.example.home.dbconfig;

import lombok.Data;
import org.example.home.entity.Department;
import org.example.home.entity.Employee;

import java.util.TreeMap;

@Data
public class DBConfig {

    private final TreeMap<Long, Employee> employeeList = new TreeMap<>();

    private final TreeMap<Long, Department> departmentList = new TreeMap<>();
}