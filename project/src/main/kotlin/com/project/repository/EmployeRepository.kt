package com.project.repository

import com.project.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeRepository : JpaRepository<Employee,Long>