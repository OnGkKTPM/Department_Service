package com.example.department.service;

import com.example.department.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public Department getDepartmentById(Long id);
    public List<Department> getAllDepartment();
    public String deleteDepartment(Long id);
}
