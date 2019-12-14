//package com.example.demo.converter;
//
//import com.example.demo.converter.api.Converter;
//import com.example.demo.dto.FlightDto;
//import com.example.demo.model.Flight;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class FlightConverter implements Converter<Flight, FlightDto> {
//
//    @Override
//    public FlightDto convert(Flight flight) {
//        return new FlightDto(flight.getDestination(), flight.getPrice());
//    }
//}
