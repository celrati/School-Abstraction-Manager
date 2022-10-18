package com.sam.microservices.coursesservice.dto.out;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseResponse {
    private String name;
}
