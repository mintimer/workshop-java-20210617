package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class UserController {

    private static final UserResponse userResponse = new UserResponse(asList(
            new UserResponseItem(1, "Leanne Graham", "Bret", "Sincere@april.biz"
                    , new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874"
                    , new Geo("-37.3159", "81.1496"))
                    , "1-770-736-8031 x56442", "hildegard.org"
                    , new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")),
            new UserResponseItem(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv"
                    , new Address("Victor Plains", "Suite 879", "Wisokyburgh", "90566-7771"
                    , new Geo("-43.9509", "-34.4618"))
                    , "010-692-6593 x09125", "anastasia.net"
                    , new Company("Deckow-Crist", "Proactive didactic contingency", "synergize scalable supply-chains")),
            new UserResponseItem(3, "Clementine Bauch", "Samantha", "Nathan@yesenia.net"
                    , new Address("Douglas Extension", "Suite 847", "McKenziehaven", "59590-4157"
                    , new Geo("-68.6102", "-47.0653"))
                    , "1-463-123-4447", "ramiro.info"
                    , new Company("Romaguera-Jacobson", "Face to face bifurcated interface", "e-enable strategic applications"))
    ));

    @GetMapping("/user/{id}")
    public UserResponseItem getUserById(@PathVariable String id) {
        // Validate ID Number Only
        int _id = 0;
        UserResponseItem userResponseItem = null;
        try {
            _id = Integer.parseInt(id);
            for (UserResponseItem responseItem : userResponse.getUserResponse()) {
                if (responseItem.getId() == _id) {
                    userResponseItem = responseItem;
                }
            }
            if (userResponseItem == null) {
                //
            }
        } catch (NumberFormatException e) {
            //
        }
        return userResponseItem;
    }

    @GetMapping("/user")
    public UserResponse getAllUsers() {
        return userResponse;
    }
}
