package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApi() {
        UserResponse expected = UserControllerNA.getUserResponse();
        UserResponse response = restTemplate.getForObject("/user", UserResponse.class);
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithPathVariable() {
        UserResponseItem expected = UserControllerNA.getUserResponse().getUserResponse(3);
        UserResponseItem response = restTemplate.getForObject("/user/3", UserResponseItem.class);
        assertEquals(expected,response);
    }
}