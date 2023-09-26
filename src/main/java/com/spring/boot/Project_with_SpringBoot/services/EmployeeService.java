package com.spring.boot.Project_with_SpringBoot.services;


import com.spring.boot.Project_with_SpringBoot.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
