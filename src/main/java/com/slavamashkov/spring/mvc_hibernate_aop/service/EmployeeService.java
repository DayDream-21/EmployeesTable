package com.slavamashkov.spring.mvc_hibernate_aop.service;

import com.slavamashkov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * Description
     * @return return
     */
    List<Employee> getAllEmployees();

    /**
     * Description
     * @param employee description
     */
    void saveEmployee(Employee employee);

    /**
     * Description
     * @param id description
     * @return return
     */
    Employee getEmployee(int id);

    /**
     * Description
     * @param id description
     */
    void deleteEmployee(int id);
}
