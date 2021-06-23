package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private MyRandom random;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable String id) {
        // Validate ID Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }
        catch (NumberFormatException e){
            //
        }
        // Workshop
        int number = random.nextInt(10);
        Optional<Employee> result = employeeRepository.findById(_id);
        if(result.isPresent()){
            Employee employee = result.get();
            return new EmployeeResponse(employee.getId(), employee.getFirstName() + number, employee.getLastName());
        }else {
            return new EmployeeResponse();
        }
    }

    // employee?id2=?

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeById2(@RequestParam String id) {
        // Validate ID Number Only
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }
        catch (NumberFormatException ignored){

        }
        return new EmployeeResponse(_id, "Somkiat", "Pui");
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request) {
        return new EmployeeResponse(999, request.getFname(), request.getLname());
    }
}
