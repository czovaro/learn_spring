package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class GreetingServiceEnglish implements GreetingInterface {

    @Override
    public String sayhello(String name) {
        return "Hello " + name;
    }
}
