package com.example.demo.controller;

import com.example.demo.service.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greeting/")
public class GreetingController {

    @Autowired
    private GreetingInterface greetingInterface;

    @RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name) {
        return greetingInterface.sayhello(name);
    }
}
