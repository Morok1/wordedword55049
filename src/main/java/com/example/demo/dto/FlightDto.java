package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FlightDto {
    private String destination;
    private Long price;
}
