package com.slavamashkov.spring.mvc_hibernate_aop.service;

import com.slavamashkov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
