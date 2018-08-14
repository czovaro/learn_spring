package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("portuguese")
public class GreetingServicePortuguese implements GreetingInterface {

    @Override
    public String sayhello(String name) {
        return "Olá " + name;
    }
}
