package com.crm.employeeTest;

import com.crm.entity.Employee;
import com.crm.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootTest
public class EmployeeTest {

    @Autowired
    EmployeeService employeeService;


    @Test
    public List<Employee> showAllEmployee(){
        List<Employee> employeeList = employeeService.showAllEmployees();
        return employeeList;
    }

}
