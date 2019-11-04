package com.shahid;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.xml.sax.SAXParseException;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public T saveEmployeeByPreparedStatement(final Employee e) {
		
		String query="insert into employee values(?,?,?)";
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<T>() {

			public T doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getSalary());
				
				return ps.execute();
			}
			
			
			
			
		});
		
	}

}
