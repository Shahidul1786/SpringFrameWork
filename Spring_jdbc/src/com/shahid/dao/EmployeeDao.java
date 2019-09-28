
package com.shahid.dao;

import com.shahid.model.Employee;
import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Shahidul
 */

@Component
public class EmployeeDao {
    
    DataSource dataSource;
    
    JdbcTemplate jdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

   @Autowired
    public void setDataSource(DataSource dataSource) {
        
       jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
        
        
    }
    
    
    public int saveEmployee(Employee employee){
        
        String sql = "insert into employee (name, salary) values ('"+employee.getName()+"','"+employee.getSalary()+"')";
        
      return jdbcTemplate.update(sql);
        
        
    }
     
    
    
}
