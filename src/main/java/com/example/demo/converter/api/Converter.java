package com.example.demo.converter.api;

public interface Converter<S, D> {
    D convert(S s);
}
