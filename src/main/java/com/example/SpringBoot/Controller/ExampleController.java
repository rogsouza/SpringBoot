package com.example.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Primeiro exemplo de Spring Boot...";
    }

    @GetMapping("/exemplo")
    @ResponseBody
    public String example() {
        return "Mais um teste...";
    }
}
