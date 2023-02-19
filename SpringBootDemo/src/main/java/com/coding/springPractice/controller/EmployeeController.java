package com.coding.springPractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coding.springPractice.Employee;
import com.coding.springPractice.dao.EmployeeRepository;

import jakarta.websocket.server.PathParam;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@RequestMapping("/")
	public String profile(Employee emp) {
		return "profile";
	}
	@RequestMapping("/add")
	public String addEmployee(Employee emp) {
		employeeRepo.save(emp);
		return "profile";
	}
	
	@RequestMapping("/get")
	public ModelAndView getEmployee(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("showEmployee");
		Employee employee= employeeRepo.findById(eid).orElse(new Employee());
		mv.addObject("employee", employee);
		
//		just for experiment
		System.out.println(employeeRepo.findAllBytech("java"));
		System.out.println(employeeRepo.findByEidGreaterThan(102));
		//System.out.println(employeeRepo.findByTechSorted("java"));//Using JPQL
		
		return mv;
	}
	
	
	@RequestMapping("/employees")
	@ResponseBody
	public String getEmployee() {
		
		return employeeRepo.findAll().toString();
	}
	

	@RequestMapping("/employee/{eid}")
	@ResponseBody
	public String getEmployeeByID(@PathVariable int eid) {
		
		return employeeRepo.findById(eid).toString();
	}
	
	
}
