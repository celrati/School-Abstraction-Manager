package com.sam.microservices.staffsservice.controller;

import com.sam.microservices.staffsservice.courseProxy.CourseProxy;
import com.sam.microservices.staffsservice.dto.out.CourseResponse;
import com.sam.microservices.staffsservice.dto.out.StudentResponse;
import com.sam.microservices.staffsservice.service.StudentService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value =  "students", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {

    private final StudentService studentService;
    private final CourseProxy courseProxy;


    @GetMapping
    public ResponseEntity<List<StudentResponse>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @CircuitBreaker(name = "courseCaller", fallbackMethod = "getEmptyListForTest")
    @GetMapping("/coursesByFeign")
    public ResponseEntity<Object> findAllCoursesByFeign(){
        return courseProxy.findAll();
    }


    public ResponseEntity<Object> getEmptyListForTest(Exception e){
        return  ResponseEntity.ok(List.of());
    }
}
