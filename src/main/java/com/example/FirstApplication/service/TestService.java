package com.example.FirstApplication.service;

import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchDepartmentDetails(String departmentName);

}
