package com.slavamashkov.spring.mvc_hibernate_aop.dao;

import com.slavamashkov.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DAO class responsible for providing
 * CRUD operations on database table
 * */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    // Field injection isn't recommended, but this is not critical here
    @Autowired // DI on sessionFactory bean from application_context
    private SessionFactory sessionFactory;

    /**
     * @return List of all Employees in table
     */
    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee ", Employee.class);
        // Get all employees and save them as List
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }
}
