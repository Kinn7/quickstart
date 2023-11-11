package com.youtube.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "<h1>Hello world</h1>";
    }
}
