package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class ExampleSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringBoot.class, args);
    }

}
