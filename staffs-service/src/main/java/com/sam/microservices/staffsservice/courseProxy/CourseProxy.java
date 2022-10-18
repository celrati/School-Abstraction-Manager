package com.sam.microservices.staffsservice.courseProxy;

import com.sam.microservices.staffsservice.dto.out.CourseResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "courses-service")
public interface CourseProxy {

    @GetMapping( "/courses")
    public ResponseEntity<Object> findAll();

}

