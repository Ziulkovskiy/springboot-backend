package com.zula.project.service.impl;

import com.zula.project.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmploe(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeesByID(long id);
}
