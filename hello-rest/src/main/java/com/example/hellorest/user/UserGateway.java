package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public UserModel[] getAllUser() {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", UserModel[].class);
    }

    public UserModel getUserById(int id) {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + id, UserModel.class);
    }
}
