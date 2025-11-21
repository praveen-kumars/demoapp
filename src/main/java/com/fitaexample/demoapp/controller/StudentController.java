package com.fitaexample.demoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitaexample.demoapp.dto.SingupDto;
import com.fitaexample.demoapp.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/singup")
    public SingupDto singUpStudent(@RequestBody SingupDto singup) {
        return studentService.saveStudent(singup);
    }

    @GetMapping("/findUser/")
    public SingupDto getMethodName(@RequestParam Long id) {
        return studentService.getStudentById(id);
    }
    
    

   
}
