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
    private EmployeeService employeeService;

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

        EmployeeResponse employeeResponse = employeeService.process(_id);
        return  employeeResponse;
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
