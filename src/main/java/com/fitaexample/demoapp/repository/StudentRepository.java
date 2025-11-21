package com.fitaexample.demoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitaexample.demoapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    java.util.Optional<Student> findByEmail(String email);

    
} 