package com.kk.micro.employee.service;

import org.springframework.stereotype.Service;

import com.kk.micro.employee.entity.DepartmentDTO;
import com.kk.micro.employee.entity.Employee;
import com.kk.micro.employee.exceptions.EmployeeException;
import com.kk.micro.employee.feign.DepartmentClient;
import com.kk.micro.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final DepartmentClient client;
    private EmployeeRepository repo;
    public EmployeeService(EmployeeRepository repo, DepartmentClient client) {
        this.repo = repo;
        this.client = client;
    }

    public Employee create(Employee emp){
        return repo.save(emp);
    }

    public Employee get(Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new EmployeeException("GET EMPLOYEE FAILURE WITH ID: "+id));
    }

      // GET DEPARTMENT (via Feign)
    public DepartmentDTO getDepartment(Long employeeId) {
        Employee emp = get(employeeId);   // reuse get()
        return client.getDepartment(emp.getDepartmentId());
    }
}

