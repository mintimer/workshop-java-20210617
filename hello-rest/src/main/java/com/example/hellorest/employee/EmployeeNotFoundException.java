package com.example.hellorest.employee;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String s) {
        super(s);
    }
}
