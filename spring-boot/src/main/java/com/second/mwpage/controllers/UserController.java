package com.second.mwpage.controllers;

import com.second.mwpage.entities.Role;
import com.second.mwpage.entities.User;
import com.second.mwpage.pojos.UserRegistration;
import com.second.mwpage.repository.UserRepository;
import com.second.mwpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping(value = "/rest")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value="/user/register")
    public String register(@RequestBody UserRegistration userRegistration) {
        if(!userRegistration.getPassword().equals(userRegistration.getPasswordConfirmation())) {
            return "Error the passwords do not match";
        }
        else if (userService.getUser(userRegistration.getUsername()) != null){
            return "Error this username already exists";
        }

        Pattern patter = Pattern.compile("[^a-zA-Z0-9]");
        if (patter.matcher(userRegistration.getUsername()).find()){
            return "No special characters are allowed in the username";
        }

        userService.save(new User(userRegistration.getUsername(), userRegistration.getPassword(), Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));
//        userService.save(new User(userRegistration.getUsername(), userRegistration.getPassword()));
        return "User created";
    }

    @GetMapping(value="/user")
    public List<User> users(){
        return userService.getAllUsers();
    }

    @GetMapping(value="/user/all")
    public List<User> user(){
        return userRepository.findAll();
    }

    @GetMapping(value="/user/test")
    public String test(){
        return userService.test();
    }
}
