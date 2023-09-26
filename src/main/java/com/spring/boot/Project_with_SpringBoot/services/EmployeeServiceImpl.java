package com.spring.boot.Project_with_SpringBoot.services;


import com.spring.boot.Project_with_SpringBoot.dao.EmployeeRepository;
import com.spring.boot.Project_with_SpringBoot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> byId = employeeRepository.findById(id);

        if (byId.isPresent()) {
            employee = byId.get();
        } else {
            //throw new NoSuchElementException("No such employee with ID: " + id);
            System.out.println("No such employee with ID: " + id);
        }
        return employee;
    }


    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employeeList = employeeRepository.findAllByName(name);

        return employeeList;
    }
}
