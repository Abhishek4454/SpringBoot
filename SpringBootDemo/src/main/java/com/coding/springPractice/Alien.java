package com.coding.springPractice;

import org.springframework.stereotype.Component;

@Component
public class Alien {

	private String aid;
	private String aname;

	private String tech;

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}
	
	

//	@Autowired         //By Type injection
//	@Qualifier("lap1") //By name injection 
//	private Laptop laptop;

	

//	@Override
//	public String toString() {
//		return "Alien [aid=" + aid + ", tech=" + tech + ", laptop=" + laptop + "]";
//	}
//	
//	public void show() {
//		System.out.println("In show .....");
//	}

}
