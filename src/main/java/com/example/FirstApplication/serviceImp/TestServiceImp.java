package com.example.FirstApplication.serviceImp;

import com.example.FirstApplication.Dto.EmployeeDetails;
import com.example.FirstApplication.entity.Employee;
import com.example.FirstApplication.practice.EmployeeDAO;
import com.example.FirstApplication.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public String registerEmployee(EmployeeDetails employeeDetails) {
        System.out.println(employeeDetails);
        return null;
    }



    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public String registerNewEmployee(Employee employee) {
        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setQualification(employee.getQualification());
        employee1.setAge(employee.getAge());
        employeeDAO.save(employee1);
        return "Data added successfully";
    }

}
