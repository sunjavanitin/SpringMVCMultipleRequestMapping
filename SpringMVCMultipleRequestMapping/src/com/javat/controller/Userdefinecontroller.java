package com.javat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/secure")
public class Userdefinecontroller {
		
	@RequestMapping("/firstmvc") //firstmvc is the name of form action 
	protected ModelAndView springBasic() throws Exception {
		
		ModelAndView obj=new ModelAndView("welcome"); // welcome is the name of view(jsp file)
		
		obj.addObject("javat","welcome to spring basic example"); // javat is the object holding value welcome to.....
				
		return obj;
	}
	
	@RequestMapping("/hi") //firstmvc is the name of form action 
	protected ModelAndView javat() throws Exception {
		
		ModelAndView obj=new ModelAndView("welcome"); // welcome is the name of view(jsp file)
		
		obj.addObject("javat","multiple request mapping"); // javat is the object holding value welcome to.....
				
		return obj;
	}	
}



