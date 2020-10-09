package com.example.helloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {


        System.out.println();
        return "hello,Spring Boot!";
    }
}
