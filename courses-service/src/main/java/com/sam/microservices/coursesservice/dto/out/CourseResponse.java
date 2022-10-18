package com.sam.microservices.coursesservice.dto.out;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CourseResponse {
    private String name;
}
