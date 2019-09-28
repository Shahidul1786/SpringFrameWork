/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.jdbctest;

import com.shahid.dao.EmployeeDao;
import com.shahid.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Shahidul
 */
public class Test {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/jdbctest/spring-jdbc.xml");
        
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        
        System.out.println(employeeDao.saveEmployee(new Employee("shahid", 20000)));
    }
    
}
