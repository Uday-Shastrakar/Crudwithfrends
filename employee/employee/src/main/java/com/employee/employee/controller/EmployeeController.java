package com.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.models.Employee;
import com.employee.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee emp) {
		return service.create(emp);
		
	}
	
    @GetMapping("/get/{id}")
	Employee getEmployeeById(@PathVariable Long id) {
		return service.getEmployeeById(id);
		
	}
	@GetMapping("/getall")
	List<Employee> getAllEmployee(){
		return service.getAllEmployee();
		
	}
	@DeleteMapping("/del")
	void deleteEmployee(@RequestParam Long id) {
		service.deleteEmployee(id);
	}
	@PutMapping("/update")
	Employee update(@RequestBody Employee emp) {
		return service.update(emp);
		
	}
	
	

}
