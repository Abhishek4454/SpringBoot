package com.coding.springPractice.dao;

import org.springframework.data.repository.CrudRepository;

import com.coding.springPractice.Employee;

public interface AddRepository extends CrudRepository<Employee, Integer> {

}
