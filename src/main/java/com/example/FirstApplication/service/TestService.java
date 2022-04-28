package com.example.FirstApplication.service;

import com.example.FirstApplication.Dto.EmployeeDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchDepartmentDetails(String departmentName);

    String registerEmployee(EmployeeDetails employeeDetails);

}
