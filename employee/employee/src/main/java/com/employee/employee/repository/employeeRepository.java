package com.employee.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.models.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long>{

}
