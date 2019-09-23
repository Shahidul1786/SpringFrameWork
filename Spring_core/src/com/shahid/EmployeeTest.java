/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Shahidul
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/shahid/ApplicationContext.xml");
        
        Employee emp = (Employee) context.getBean("e");
        emp.show();
    }
    
}
