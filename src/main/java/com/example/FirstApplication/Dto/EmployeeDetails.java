package com.example.FirstApplication.Dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
