package com.example.FirstApplication.serviceImp;

import com.example.FirstApplication.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService {

    public String fetchDepartmentDetails(String departmentName) {
        if (departmentName != null) {
            switch (departmentName) {
                case "Associate":
                    return "Newly joined employee:Sanjay";
                case "HR":
                    return "Newly joined hr:Jagadish";
                case "Teamlead":
                    return "Newly joined teamlead:Veer";
                default:
                    return "No data found";
            }
        } else {
            return "Data cannot be null";
        }

    }
}
