package com.second.mwpage.resource;

import com.second.mwpage.entities.User;
import com.second.mwpage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/all")
    private List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<User> persist(@RequestBody final User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }
}
