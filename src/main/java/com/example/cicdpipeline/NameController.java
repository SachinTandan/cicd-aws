package com.example.cicdpipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to the Home Page!";
    }
}
