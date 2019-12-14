package com.example.demo.service;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserConverter userConverter;
    private final UserRepository repository;

    public List<UserDto> getAll(){
        return repository.findAll()
                .stream()
                .map(userConverter::convert)
                .collect(Collectors.toList());
    }

    public UserDto getUserById(Long id) {
        return userConverter.convert(repository.findUserById(id));
    }
}
