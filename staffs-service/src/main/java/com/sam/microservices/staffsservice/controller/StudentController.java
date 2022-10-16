package com.sam.microservices.staffsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student/hi")
    public String sayHi() {
        return "hi";
    }
}
