package com.example.hellorest.employee;

import java.util.List;

public class UserResponse{
    private List<UserResponseItem> userResponse;

    public UserResponse() {
    }

    public UserResponse(List<UserResponseItem> userResponse) {
        this.userResponse = userResponse;
    }

    public void setUserResponse(List<UserResponseItem> userResponse){
        this.userResponse = userResponse;
    }

    public List<UserResponseItem> getUserResponse(){
        return userResponse;
    }
}