package com.example.demo.service;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserConverter userConverter;
    private final UserRepository repository;


    public List<User> getAll(){
        List<User> users = repository.findAll();
        return users;
    }

    public UserDto getUserById(Long id) {
        return userConverter.convert(repository.findUserById(id));
    }
}
