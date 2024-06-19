package com.example.deployExample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @Value("${devName}")
    private String devName;

    @GetMapping("/name")
    public String getDevName() {
        return devName;
    }
}