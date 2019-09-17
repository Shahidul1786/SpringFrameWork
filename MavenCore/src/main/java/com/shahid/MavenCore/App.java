package com.shahid.MavenCore;

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
        //Car car = new Car();
       // car.Drive();
    	
    	//Bike bike = new Bike();
    	//bike.Drive();
    	
    	//Vehicle obj = new Bike();
    	//obj.Drive();
    	
    	//Vehicle ob = new Car();
    	//ob.Drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	Vehicle obj = (Vehicle) context.getBean("car");
    	obj.Drive();
    	
    	//Tyre tyre = (Tyre)context.getBean("car");
    	
    	//System.out.println(tyre);
    }
}
