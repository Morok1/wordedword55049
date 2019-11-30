package com.example.demo.dto;

import com.example.demo.model.Travel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class UserDto {
    private String name;
    private Set<TravelDto> travels;
}
