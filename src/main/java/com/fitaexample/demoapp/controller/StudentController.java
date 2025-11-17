package com.fitaexample.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitaexample.demoapp.dto.Loginrequestdto;
import com.fitaexample.demoapp.dto.User;
import com.fitaexample.demoapp.service.UserService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {

    UserService userService = new UserService();

    @PostMapping("/singup")
    public String singupUser(@RequestBody User user) {
        return userService.singup(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Loginrequestdto loginrequestdto) {
        return userService.login(loginrequestdto.getUsername(), loginrequestdto.getPassword());
    }

    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return param;
    }
    
}
