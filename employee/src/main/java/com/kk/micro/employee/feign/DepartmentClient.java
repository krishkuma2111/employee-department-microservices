package com.kk.micro.employee.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kk.micro.employee.entity.DepartmentDTO;

@FeignClient(
    name = "DEPARTMENT-SERVICE",
    fallback = DepartmentClientFallback.class
)
public interface DepartmentClient {

    @GetMapping("/departments/{id}")
    DepartmentDTO getDepartment(@PathVariable Long id);
}
