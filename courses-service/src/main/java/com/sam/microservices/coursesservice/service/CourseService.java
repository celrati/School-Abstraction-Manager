package com.sam.microservices.coursesservice.service;

import com.sam.microservices.coursesservice.dto.out.CourseResponse;
import com.sam.microservices.coursesservice.dto.utils.CourseResponseMapper;
import com.sam.microservices.coursesservice.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<CourseResponse> findAll() {
        return courseRepository.findAll()
                .stream()
                .map( course -> {
                    return CourseResponseMapper.courseResponseBuilder(course);
                }).collect(Collectors.toList());
    }

}
