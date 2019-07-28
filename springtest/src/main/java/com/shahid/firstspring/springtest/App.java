package com.shahid.firstspring.springtest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/shahid/firstspring/springtest/beans/beans.xml");
    	
        Patient patient = (Patient)context.getBean("Patient");
        patient.Speak();
        System.out.println(patient);
        
        ((ClassPathXmlApplicationContext)context).close();
        
        //System.out.println();
    }
}
