package com.shahid;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		int k = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dispaly.jsp");
		mv.addObject("result", k)
		
		return mv;
	}
}
