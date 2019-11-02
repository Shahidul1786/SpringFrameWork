package com.shahid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		EmployeeDao dao  = (EmployeeDao) ctx.getBean("edao");
		
		int status = dao.saveEmployee(new Employee());
		
		//System.out.println(status);

	}

}
