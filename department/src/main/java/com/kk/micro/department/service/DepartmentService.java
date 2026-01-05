package com.kk.micro.department.service;

import org.springframework.stereotype.Service;

import com.kk.micro.department.entity.Department;
import com.kk.micro.department.entity.DepartmentDTO;
import com.kk.micro.department.exceptions.DepartmentException;
import com.kk.micro.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;
    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }    
    public DepartmentDTO get(Long id) {
        return repo.findById(id)
        .map(dep->new DepartmentDTO(dep.getId(), dep.getDepartmentId(), dep.getName()))
            .orElseThrow(() -> new DepartmentException("GET Department FAILURE WITH ID: "+id));
    }
    public Department create(Department dept){
        return repo.save(dept);
    }
}
