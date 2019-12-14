package com.example.demo.converter;

import com.example.demo.converter.api.Converter;
import com.example.demo.dto.FlightDto;
import com.example.demo.dto.TravelDto;
import com.example.demo.model.Travel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor

public class TravelConverter implements Converter<Travel, TravelDto> {
//    private final FlightConverter flightConverter;

    @Override
    public TravelDto convert(Travel travel) {
        return new TravelDto(travel.getName(), /*convertToFlights(travel)*/ Collections.emptySet());
    }

//    private List<FlightDto> convertToFlights(Travel travel) {
//        return travel.getFlights().stream().map(flightConverter::convert).collect(Collectors.toList());
//    }
}
