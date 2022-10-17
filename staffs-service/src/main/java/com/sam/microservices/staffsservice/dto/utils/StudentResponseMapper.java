package com.sam.microservices.staffsservice.dto.utils;

import com.sam.microservices.staffsservice.dto.out.StudentResponse;
import com.sam.microservices.staffsservice.repository.entity.Student;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StudentResponseMapper {

    public StudentResponse studentResponseBuilder(Student student) {
        return StudentResponse.builder()
                .name(student.getName())
                .build();
    }
}
