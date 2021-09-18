package com.slavamashkov.spring.mvc_hibernate_aop.dao;

import com.slavamashkov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;
/**
 * Interface for employee's Data Access Object (DAO)
 */
public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
