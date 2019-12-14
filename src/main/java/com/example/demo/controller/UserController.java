package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8083")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/allusers")
    public List<UserDto> allusers() {
        return service.getAll();
    }

//  get userId all travels
    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable("id") Long id){
        UserDto dto = service.getUserById(id);
        return dto;
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
