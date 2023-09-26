package com.spring.boot.Project_with_SpringBoot.dao;


import com.spring.boot.Project_with_SpringBoot.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
}
