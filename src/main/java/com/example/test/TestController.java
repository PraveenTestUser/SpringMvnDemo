package com.example.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/sampleTest")
    public String sampleTest(@RequestParam(value = "name", defaultValue = "Praveen") String name){
        return String.format("Hello, %s", name);
    }
}