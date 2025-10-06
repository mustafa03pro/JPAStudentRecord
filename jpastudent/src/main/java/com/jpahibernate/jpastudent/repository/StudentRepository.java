package com.jpahibernate.jpastudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpahibernate.jpastudent.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
