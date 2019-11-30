package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
public class TravelDto {
    private String name;
    private List<FlightDto> flightDtos;
    private Set<String> requirements;
}