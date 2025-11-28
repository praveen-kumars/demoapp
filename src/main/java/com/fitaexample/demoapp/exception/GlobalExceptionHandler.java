package com.fitaexample.demoapp.exception;

import java.io.FileNotFoundException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ArithmeticException.class)
    public String handleException(ArithmeticException ex) {
        // Global exception handling logic can be added here
        System.out.println("An error occurred: " + ex.getMessage());
        return "An error occurred: " + ex.getMessage();
    }

    

}
