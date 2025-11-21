package com.fitaexample.demoapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitaexample.demoapp.dto.SingupDto;
import com.fitaexample.demoapp.model.Student;
import com.fitaexample.demoapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public SingupDto saveStudent(SingupDto singup) {

        Student student = new Student();
        student.setUsername(singup.getUsername());
        student.setPassword(singup.getPassword());
        student.setEmail(singup.getEmail());
        student.setPhone(singup.getPhone());
        if(studentRepository.findByEmail(singup.getEmail()).isPresent()){
            throw new RuntimeException("Email already exists");
        }

        Student savedValue = studentRepository.save(student);

        SingupDto response = new SingupDto();
        response.setUsername(savedValue.getUsername());
        response.setEmail(savedValue.getEmail());
        response.setPhone(savedValue.getPhone());

        return response;

    }

    public SingupDto getStudentById(Long id) {
        // Implementation to retrieve student by ID
        Optional<Student> studentOpt = studentRepository.findById(id);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            SingupDto response = new SingupDto();       
            response.setUsername(student.getUsername());
            response.setEmail(student.getEmail());      
            response.setPhone(student.getPhone());
        return response;
        } else {
            throw new RuntimeException("Student not found");
        }

}
}
