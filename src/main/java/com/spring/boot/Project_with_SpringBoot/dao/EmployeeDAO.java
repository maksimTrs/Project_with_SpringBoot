package com.spring.boot.Project_with_SpringBoot.dao;





import com.spring.boot.Project_with_SpringBoot.entities.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
