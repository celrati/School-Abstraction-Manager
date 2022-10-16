package com.sam.microservices.staffsservice.repository;

import com.sam.microservices.staffsservice.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends JpaRepository<Student, String> {

}
