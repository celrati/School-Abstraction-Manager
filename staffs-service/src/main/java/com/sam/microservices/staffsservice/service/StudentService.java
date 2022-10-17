package com.sam.microservices.staffsservice.service;

import com.sam.microservices.staffsservice.dto.out.StudentResponse;
import com.sam.microservices.staffsservice.dto.utils.StudentResponseMapper;
import com.sam.microservices.staffsservice.repository.StudentRepository;
import com.sam.microservices.staffsservice.repository.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentResponse> findAll() {
        return studentRepository.findAll()
                .stream()
                .map( student -> {
                    return StudentResponseMapper.studentResponseBuilder(student);
                }).collect(Collectors.toList());
    }

}
