package com.example.demo.converter;

import com.example.demo.converter.api.Converter;
import com.example.demo.dto.TravelDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserConverter implements Converter<User, UserDto> {
    private final TravelConverter travelConverter;

    @Override
    public UserDto convert(User user) {
        return new UserDto(user.getName(), toTravelDtos(user));
    }

    private Set<TravelDto> toTravelDtos(User user) {
        return user.getTravels().stream().map(travelConverter::convert).collect(Collectors.toSet());
    }
}
