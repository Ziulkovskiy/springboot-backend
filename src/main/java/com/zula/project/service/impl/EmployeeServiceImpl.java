package com.zula.project.service.impl;

import com.zula.project.model.Employee;
import com.zula.project.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmploe(Employee employee) {
        return employeeRepository.save(employee);
    }
}
