/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid.test;

import com.shahid.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Shahidul
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/shahid/test/spring-aop.xml");

        EmpService eservice = context.getBean("empservice", EmpService.class);

        System.out.println(eservice.getManager().getName());
        System.out.println(eservice.getAccountant().getName());

    }

}
