package com.coding.springPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	 @Id
	 int eid;
	
	 String ename;
	 String tech;
	

	

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", tech=" + tech + "]";
	}
}
