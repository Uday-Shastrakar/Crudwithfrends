package com.employee.employee.service;

import java.util.List;

import com.employee.employee.models.Employee;

public interface EmployeeService {

	Employee create(Employee emp);
	
	Employee getEmployeeById(Long id);
	
	List<Employee> getAllEmployee();
	
	void deleteEmployee(Long id);
	
	Employee update(Employee emp);
	
	
}
