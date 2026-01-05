package com.kk.micro.department.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(DepartmentException.class)
    public ResponseEntity<String> handle(DepartmentException e){
        return ResponseEntity.status(400).body(e.getMessage());
    }
}

