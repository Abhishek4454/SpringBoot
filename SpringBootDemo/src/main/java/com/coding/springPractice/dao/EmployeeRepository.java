package com.coding.springPractice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coding.springPractice.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	List<Employee> findAllBytech(String string);
	List<Employee> findByEidGreaterThan(Integer eid);

	//JPQL
	//@Query("from employee where tech=?1 order by ename")
	//List<Employee> findByTechSorted(String tech);
}
