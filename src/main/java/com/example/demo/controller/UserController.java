package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/allusers")
    public List<User> allusers() {
        return service.getAll();
    }

//  get userId all travels
    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable("id") Long id){
        return service.getUserById(id);
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
