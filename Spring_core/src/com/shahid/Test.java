/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Shahidul
 */
public class Test {
    
    public static void main(String[] args) {
        
        // programatic xml ApplicationContext;
        ApplicationContext context = new ClassPathXmlApplicationContext("com/shahid/ApplicationContext.xml");
        
        Hello h = (Hello) context.getBean("hello");
        h.setMessage("Hello Spring");
        System.out.println(h.getMessage());
        
        
        // Configration ApplicationContext;
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(HelloConfig.class);
        
        Hello h2 = (Hello) context1.getBean("hello");
        h2.setMessage("Hello Spring2");
        System.out.println(h2.getMessage());
        
    }
    
}
