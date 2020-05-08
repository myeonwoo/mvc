package com.second.mwpage.service;

import com.second.mwpage.entities.User;
import com.second.mwpage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public String test(){
        return "Test userRepository";
    }

}
