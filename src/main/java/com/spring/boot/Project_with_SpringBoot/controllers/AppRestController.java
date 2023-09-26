package com.spring.boot.Project_with_SpringBoot.controllers;


import com.spring.boot.Project_with_SpringBoot.entities.Employee;
import com.spring.boot.Project_with_SpringBoot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppRestController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees") // http://localhost:8084/springBoot-rest/api/employees
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList;
    }


    @GetMapping("/employees/{empId}")
    public Employee getEmployees(@PathVariable int empId) {

        Employee employee = employeeService.getEmployee(empId);

        return employee;
    }


    @GetMapping("/employees/name/{empName}")
    public List<Employee> getEmployeesByName(@PathVariable String empName) {

        List<Employee> employee = employeeService.findAllByName(empName);

        return employee;
    }


    @PostMapping("/employees")
    public Employee createEmployees(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployees(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }


    @DeleteMapping("/employees/{empId}")
    public String deleteEmployees(@PathVariable int empId) {


        employeeService.deleteEmployee(empId);

        return "Employee with ID: " + empId + " was deleted!";
    }
}