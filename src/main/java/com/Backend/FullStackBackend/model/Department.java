package com.Backend.FullStackBackend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
