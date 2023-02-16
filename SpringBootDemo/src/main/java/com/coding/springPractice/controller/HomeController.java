package com.coding.springPractice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	//Using HttpServletRequest and HttpSession
//	@RequestMapping("/home")
//	public String home(HttpServletRequest req) {
//		System.out.println("hi");
//		HttpSession session= req.getSession();
//		session.setAttribute("name", req.getParameter("name"));
//		return "home";
//	}
	
	//Using HttpSession only ,dispatcher servlet provides this feature
//	@RequestMapping("/home")
//	public String home(String name,HttpSession session) {
//		System.out.println("hi");
//		session.setAttribute("name", name);
//		return "home";
//	}
	
	//using Model and view
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam("name")String name) {
		System.out.println("hi");
		ModelAndView mv= new ModelAndView();
		mv.setViewName("home");
		mv.addObject("name", name);
		return mv;
	}
}
