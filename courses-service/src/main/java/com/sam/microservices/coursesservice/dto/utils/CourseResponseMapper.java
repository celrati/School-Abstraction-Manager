package com.sam.microservices.coursesservice.dto.utils;


import com.sam.microservices.coursesservice.dto.out.CourseResponse;
import com.sam.microservices.coursesservice.repository.entity.Course;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CourseResponseMapper {

    public CourseResponse courseResponseBuilder(Course course) {
        return CourseResponse.builder()
                .name(course.getName())
                .build();
    }
}
