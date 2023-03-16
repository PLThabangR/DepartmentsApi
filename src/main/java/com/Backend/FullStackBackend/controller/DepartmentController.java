package com.Backend.FullStackBackend.controller;

import com.Backend.FullStackBackend.Service.DepartmentService;
import com.Backend.FullStackBackend.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
        public Department saveDepartment(@RequestBody Department department){
            return departmentService.saveDepartment(department);

        }
}
