package com.sample.sb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("jsample3");
		return mav;
	}

	@RequestMapping("/other1")
	public ModelAndView other5(){
		 return new ModelAndView("redirect:/");
	}

	@RequestMapping("/home1")
	public ModelAndView home() {
		return new ModelAndView("forward:/");
	}

}
