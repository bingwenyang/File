package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication



public class FirstApplication {

    @RequestMapping("/")
    String index(){

        return "hello Spring Boot Change" + "my name is YangBingWen and I am feature-a";
    }
    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

}
