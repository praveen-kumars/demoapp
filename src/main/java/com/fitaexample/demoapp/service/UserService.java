package com.fitaexample.demoapp.service;

import org.springframework.stereotype.Service;

import com.fitaexample.demoapp.dto.User;

@Service
public class UserService {

    public String login(String username, String password) {
        
        return username;
    }

    public String singup(User user) {
        return user.getUsername() + " registered successfully!";
    }
    
}
