package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value = {"/","/home"})
	public String showHome(Model model) {
		
		model.addAttribute("welcomeText", "welcome to spring security");
		
		return "home";
		
	}
	
	@GetMapping("/hello")
	public String helloUser() {
		
		return "helloUser";
		
	}
	
	@GetMapping("/login")
	public String loginUser() {
		
		return "login";
		
	}

}
