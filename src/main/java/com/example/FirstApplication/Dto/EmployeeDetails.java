package com.example.FirstApplication.Dto;


import com.example.FirstApplication.entity.Employee;
import com.example.FirstApplication.practice.EmployeeDAO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeeDetails {
    private  String employeeName;
    private  String jobRole;
    private  String contactNumber;
    private String emailId;


}


