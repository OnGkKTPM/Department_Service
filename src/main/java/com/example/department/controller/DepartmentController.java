package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Save Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
    public List<Department> getAllDepartment(){
        log.info("Inside getAll Department");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        log.info("Inside getDepartmentById");
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/{id}")
    public String updateDepartmentId(@PathVariable("id") Long id, @RequestBody Department department){
        Department department1= departmentService.getDepartmentById(id);
        if(department1==null){
            return "Update error";
        }else {
            department1.setDepartmentName(department.getDepartmentName());
            department1.setDepartmentCode(department.getDepartmentCode());
            department1.setDepartmentAddress(department.getDepartmentAddress());
            departmentService.saveDepartment(department1);
            return "Update complete";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteDepatment(@PathVariable("id") Long id){
        return departmentService.deleteDepartment(id);
    }
}
