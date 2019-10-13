package com.shahid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping(path = "/insert")
	public String index() {
		jdbc.execute("insert into springbootdb.user(name,email) values ('shahid','st@gmail.com')");
		
		return"insert";
	}

}
