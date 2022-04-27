package com.example.FirstApplication.controller;


import com.example.FirstApplication.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public String myFirstMethod() {
        return "controller class";
    }

    /**
     * @GetMapping("fetch-details/{firstName}") public String getDetails(@PathVariable String firstName) {
     * return "hello " + firstName;
     * }
     * <p>
     * public String getBootCampDetails() {
     * return getDetails("");
     * }
     * @GetMapping("fetch-department-details/{departmentName}") public String getDepartmentDetails(@PathVariable String departmentName) {
     * switch (departmentName) {
     * case "Associate":
     * return associateDepartmentDetails();
     * case "HR":
     * return hrDepartmentDetails();
     * case "TeamLead":
     * return teamLeadDepartmentDetails();
     * default:
     * return "No data found";
     * }
     * <p>
     * }
     * <p>
     * public String associateDepartmentDetails() {
     * return "Newly joined employee:sanjay";
     * }
     * <p>
     * public String hrDepartmentDetails() {
     * return "Newly joined employee:jagadish";
     * }
     * <p>
     * public String teamLeadDepartmentDetails() {
     * return "Newly joined employee:veer";
     * }
     * @GetMapping("fetch-result/{numOne}/{numTwo}") public  double multiplyNumbers(@PathVariable double numOne,@PathVariable double numTwo)
     * {
     * double result;
     * result=numOne*numTwo;
     * System.out.println(result);
     * return  result;
     * }
     * public  double displayResult()
     * {
     * return  multiplyNumbers(8.7,4.2);
     * }
     **/

    @Autowired
    private TestService service;

    @GetMapping("fetch-details/{departmentName}")
    public String getDetails(@PathVariable String departmentName) {
        String result = service.fetchDepartmentDetails(departmentName);
        return result;
    }


}
