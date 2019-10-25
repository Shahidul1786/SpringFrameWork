package com.shahid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main (String []args) {
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AppplicationContext.xml");
	
	A a = applicationContext.getBean("a",A.class);
	a.display();
}

}
