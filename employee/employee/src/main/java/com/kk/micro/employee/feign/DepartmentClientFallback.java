package com.kk.micro.employee.feign;

import org.springframework.stereotype.Component;

import com.kk.micro.employee.entity.DepartmentDTO;

@Component
public class DepartmentClientFallback implements DepartmentClient {

    @Override
    public DepartmentDTO getDepartment(Long id) {
        DepartmentDTO dto = new DepartmentDTO(id, "Department service unavailable");
        return dto;
    }
}
