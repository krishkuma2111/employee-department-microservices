package com.kk.micro.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kk.micro.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
