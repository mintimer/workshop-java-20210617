package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    public EmployeeResponse getEmployeeById(Int id) {
        return new EmployeeResponse(id, "Somkiat", "Pui");
    }

}
