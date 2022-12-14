package com.lab.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/hello")
public class CicdHelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(CicdHelloWorldApplication.class, args);
    }

    @GetMapping
    public String sayHello(@RequestHeader HttpHeaders headers) {
        return "Hello world from " + headers.getHost().getHostName();
    }
}
