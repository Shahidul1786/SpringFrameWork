package com.shahid;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddController {
	
	/*@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		int k = i +j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		
		
		return mv;
	}
*/
	
	@RequestMapping("/add")
	public void add() {
		
		System.out.println("I'm here");
	}
}
