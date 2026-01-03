package com.kk.micro.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.micro.department.entity.Department;
import com.kk.micro.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService ser;
    
    public DepartmentController(DepartmentService ser) {
        this.ser = ser;
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id) {
        return ser.get(id);
    }
}

