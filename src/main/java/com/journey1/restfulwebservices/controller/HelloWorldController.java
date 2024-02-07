package com.journey1.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Expose a REST API
@RestController
public class HelloWorldController {
    //call: /hello-world
    //return: "Hello world"
    @GetMapping(path="/hello-world")
    public HelloWorldBean helloWorld(){
        return new HelloWorldBean("Hello Guys alll!!!");
    }
    @GetMapping(path = "hello-world1")
    public String helloWorld1(){
        return "Hello World";
    }
}
