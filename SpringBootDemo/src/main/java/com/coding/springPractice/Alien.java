package com.coding.springPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private int aid;
	private int tech;
	
	@Autowired         //By Type injection
	@Qualifier("lap1") //By name injection 
	private Laptop laptop;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", tech=" + tech + ", laptop=" + laptop + "]";
	}
	
	public void show() {
		System.out.println("In show .....");
	}

}
