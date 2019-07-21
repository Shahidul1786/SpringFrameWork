package com.shahid.firstspring.springtest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	
        Patient patient = (Patient)context.getBean("patient");
        patient.Speak();
        
        ((FileSystemXmlApplicationContext)context).close();
        
        //System.out.println();
    }
}
