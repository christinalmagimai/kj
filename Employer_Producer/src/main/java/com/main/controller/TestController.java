package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Employee;
@RestController
public class TestController {
@RequestMapping(value="/employee",method = RequestMethod.GET)
public Employee firstPage(){
	Employee employee = new Employee();
	employee.setName("emp1");
	employee.setEmpId("1");
	employee.setDesignation("manager");
	employee.setSalary(20000.00);
	return employee;
}
}
