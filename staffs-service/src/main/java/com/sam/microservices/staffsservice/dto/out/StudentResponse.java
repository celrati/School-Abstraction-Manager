package com.sam.microservices.staffsservice.dto.out;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentResponse {
    private String name;
}
