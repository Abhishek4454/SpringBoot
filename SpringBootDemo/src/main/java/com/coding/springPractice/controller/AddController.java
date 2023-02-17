package com.coding.springPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding.springPractice.Employee;
import com.coding.springPractice.dao.AddRepository;


@Controller
public class AddController {

	@Autowired
	AddRepository addRepo;
	
	@RequestMapping("/")
	public String profile(Employee emp) {
		
		return "profile";
	}
	@RequestMapping("/add")
	public String add(Employee emp) {
		addRepo.save(emp);
		return "profile";
	}
}
