package com.example.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class CicdPipelineApplication {

    public static void main(String[] args) {

        System.out.println("Hello world CICD");
        SpringApplication.run(CicdPipelineApplication.class, args);


    }
}
