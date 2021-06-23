package com.example.hellorest.user;

import com.example.hellorest.employee.UserResponseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/userHalf")
    public Users getHalfUsers(){
        Users users = new Users();
        List<UserModel> userModels = new ArrayList<>();
        for (UserModel userModel : userGateway.getAllUser()) {
            if ((userModel.getId() % 2) == 0){
                userModels.add(userModel);
            }
        }
        users.setUsers(userModels);
        return users;
    }


}
