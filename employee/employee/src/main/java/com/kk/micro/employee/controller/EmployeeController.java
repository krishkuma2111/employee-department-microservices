package com.kk.micro.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.micro.employee.entity.Department;
import com.kk.micro.employee.entity.Employee;
import com.kk.micro.employee.service.EmployeeService;

@RequestMapping("/employees")
@RestController
public class EmployeeController {
    private final EmployeeService ser;

    public EmployeeController(EmployeeService ser) {
        this.ser = ser;
    }

    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody Employee emp){
        return ResponseEntity.status(201).body(ser.create(emp));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable Long id){
        return ResponseEntity.status(200).body(ser.get(id));
    }

    @GetMapping("department/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id){
        return ResponseEntity.status(200).body(ser.getDepartment(id));
    }
}
