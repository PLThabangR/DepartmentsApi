package com.Backend.FullStackBackend.Service;

import com.Backend.FullStackBackend.model.Department;
import com.Backend.FullStackBackend.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImple implements DepartmentService{

    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRepo.save(department);
    }
}
