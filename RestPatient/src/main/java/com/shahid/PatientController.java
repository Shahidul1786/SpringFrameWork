package com.shahid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@GetMapping(value = "/")
	public String test() {
		
		return "hello spring boot";
	}

}
