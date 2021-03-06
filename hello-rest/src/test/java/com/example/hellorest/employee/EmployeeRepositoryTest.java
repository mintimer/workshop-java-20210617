package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void foundWithID1(){
        employeeRepository.save(new Employee(1, "Somkiat from DB","Pui from DB"));
        Employee employee1 = employeeRepository.getById(1);
        assertEquals(1,employee1.getId());
        assertEquals("Somkiat from DB",employee1.getFirstName());
        assertEquals("Pui from DB",employee1.getLastName());
    }

}