package com.wttn.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greetTheUser(){
        return "Hello User";
    }

    @GetMapping("/")
    public String root(){
        return "This is the root!";
    }
}
