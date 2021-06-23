package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {

    @Autowired
    private MyRandom random;

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse process(int id) {
        // Workshop
        int number = random.nextInt(10);
        Optional<Employee> result = employeeRepository.findById(id);
        if(result.isPresent()){
            Employee employee = result.get();
            return new EmployeeResponse(employee.getId(), employee.getFirstName() + number, employee.getLastName());
        }else {
            return new EmployeeResponse();
        }
    }

    public void setRandom(MyRandom random) {
        this.random = random;
    }

    public void setRepository(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }
}
