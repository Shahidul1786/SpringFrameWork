package com.shahid;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		
		String query="insert into employee(id,name,salary) values(103,'rani',500)";
		
		return jdbcTemplate.update(query);
		
	}
	
	//public int updateEmployee(Employee e){  
	    //String query=" update employee set name='Raj' where id=100";	    
	    //return jdbcTemplate.update(query);  
	//} 
	
	
	//public int deleteEmployee(Employee e){  
	 //   String query="delete from employee where id=100 ";  
	  //  return jdbcTemplate.update(query);  
	//}
	
	
	

}
