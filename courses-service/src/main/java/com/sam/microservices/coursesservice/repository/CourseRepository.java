package com.sam.microservices.coursesservice.repository;

import com.sam.microservices.coursesservice.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CourseRepository extends JpaRepository<Course, String> {

}
