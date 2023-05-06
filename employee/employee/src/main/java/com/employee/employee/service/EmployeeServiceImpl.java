package com.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.models.Employee;
import com.employee.employee.repository.employeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
	employeeRepository repo;

@Override
public Employee create(Employee emp) {
	
	return repo.save(emp);
}

@Override
public Employee getEmployeeById(Long id) {
	
	return repo.findById(id).get();
}

@Override
public List<Employee> getAllEmployee() {
	
	return repo.findAll();
}

@Override
public void deleteEmployee(Long id) {
	
	repo.deleteById(id);
}

@Override
public Employee update(Employee emp) {
	Employee emp1 = repo.findById(emp.getId()).get();
	emp1.setName(emp.getName());
	emp1.setEmail(emp.getEmail());
	emp1.setMoNumber(emp.getMoNumber());
	return repo.save(emp1);
}

	
	
}
