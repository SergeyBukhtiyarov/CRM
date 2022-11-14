//package com.crm.controller;
//
//import com.crm.entity.Employee;
//import com.crm.service.EmployeeService;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Data
//@RestController
//@RequestMapping("/api")
//public class EmployeeController {
//    @Autowired
//    EmployeeService employeeService;
//
//    @GetMapping("/employee")
//    public List<Employee> showAllEmployees(Employee employee) {
//        List<Employee> employeeList = employeeService.showAllEmployees();
//        return employeeList;
//    }
//
//}
