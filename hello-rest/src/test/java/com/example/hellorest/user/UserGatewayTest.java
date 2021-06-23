package com.example.hellorest.employee;

import com.example.hellorest.user.UserGateway;
import com.example.hellorest.user.UserModel;
import com.example.hellorest.user.Users;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void tryToCallApi() {
        List<UserModel> users = Arrays.asList(userGateway.getAllUser());
        assertEquals(10, users.size());
    }

    @Test
    public void tryToCallApiById(){
        UserModel userModel = userGateway.getUserById(1);
        assertEquals(1, userModel.getId());
        assertEquals("Leanne Graham",userModel.getName());
    }
}