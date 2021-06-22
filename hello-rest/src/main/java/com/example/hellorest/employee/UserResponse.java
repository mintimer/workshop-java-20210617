package com.example.hellorest.employee;

import java.util.List;
import java.util.Objects;

public class UserResponse{
    private List<UserResponseItem> userResponse;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse response = (UserResponse) o;
        return Objects.equals(userResponse, response.userResponse);
    }

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

    public UserResponseItem getUserResponse(int id){
        UserResponseItem userResponseItem = new UserResponseItem();
        for (UserResponseItem responseItem : userResponse) {
            if(responseItem.getId()==id){
                userResponseItem = responseItem;
            }
        }
        return userResponseItem;
    }
}