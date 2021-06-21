package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MyRandom random;

    @Test
    public void callApiWithPathVariable() {
        when(random.nextInt(anyInt())).thenReturn(5);

        EmployeeResponse expected = new EmployeeResponse(123, "Somkiat5", "Pui");
        EmployeeResponse response
                = restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Somkiat5", response.getFname());
        assertEquals("Pui", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithRequestParameter() {
        EmployeeResponse response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Somkiat", response.getFname());
        assertEquals("Pui", response.getLname());
    }

    @Test
    public void callApiWithPostRequest(){
        EmployeeRequest employeeRequest = new EmployeeRequest("Somkiat" , "Pui");
        EmployeeResponse response = restTemplate.postForObject("/employee",employeeRequest,EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Somkiat", response.getFname());
        assertEquals("Pui", response.getLname());
    }
}