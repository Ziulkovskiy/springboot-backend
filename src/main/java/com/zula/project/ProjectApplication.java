package com.zula.project;

import model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        Employee oEmployee = new Employee();
        oEmployee.setFirstName("Braga");
        oEmployee.setLastName("Kaga");
        oEmployee.setEmail("email");

    }

}
