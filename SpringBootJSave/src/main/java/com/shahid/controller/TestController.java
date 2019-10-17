package com.shahid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shahid.dao.DaoTestdb;
import com.shahid.model.ModelTestdb;

@Controller
public class TestController {
	
	@Autowired
	private DaoTestdb daoTestdb;
	
	@RequestMapping(path = "/test123/init")
	public String init() {
		
		return "Test";
	}
	
	@RequestMapping(path = "/test123/save")
	@ResponseBody
	public int test(
			@RequestParam("name1") String name,
			@RequestParam("salary") int salary,
			@RequestParam("designation") String designation
			) {
		
		try {
		ModelTestdb modelTestdb = new ModelTestdb();
		modelTestdb.setName(name);
		modelTestdb.setSalary(salary);
		modelTestdb.setDesignation(designation);
		
		int saveStatus = daoTestdb.save(modelTestdb);
		return saveStatus;
		}catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		}
		
	}

}
