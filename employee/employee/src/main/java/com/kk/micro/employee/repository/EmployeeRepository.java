package com.kk.micro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kk.micro.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}

