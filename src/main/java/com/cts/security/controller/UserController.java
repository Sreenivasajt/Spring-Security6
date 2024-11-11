package com.cts.security.controller;

import com.cts.security.entity.User;
import com.cts.security.repository.UserRepository;
import com.cts.security.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }


    @PostMapping("/register")
    public User register(@RequestBody User user){
       //return userRepository.save(user);
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.verify(user);
 //     User u = userRepository.findByUserName(user.getUserName());
//      if(!Objects.isNull(u))
//        return "Success";
//      return "failure";
    }
}
