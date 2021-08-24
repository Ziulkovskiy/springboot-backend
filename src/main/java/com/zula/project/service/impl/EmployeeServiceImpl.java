package com.zula.project.service.impl;

import com.zula.project.exception.ResourceNotFoundException;
import com.zula.project.model.Employee;
import com.zula.project.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeesByID(long id) {
//        Optional<Employee> employee = employeeRepository.findById(id);
//        if (employee.isPresent()){
//            return  employee.get();
//        } else {
//            throw new ResourceNotFoundException("Employee", "Id", id);
//        }

        return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));

    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee ExistingEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Emploee", "id", id)
        );
        ExistingEmployee.setFirstName(employee.getFirstName());
        ExistingEmployee.setSecondName(employee.getSecondName());
        ExistingEmployee.setEmail(employee.getEmail());
        employeeRepository.save(ExistingEmployee);
        return ExistingEmployee;
    }


}
