package com.project.api

import com.project.domain.Employee
import com.project.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class EmployeeApi(@Autowired var service: EmployeeService) {
    @GetMapping("/getall")
    fun getAllRecords(): List<Employee> {
        return service.getAllRecords()
    }

    @GetMapping("/get")
    fun getRecordById(@PathVariable id: Long): Employee {
        return service.getRecordById(id)
    }

    @PostMapping("/create")
    fun createRecord(@RequestBody emp: Employee): Employee {
        return service.createRecord(emp)
    }

    @DeleteMapping("/del")
    fun deleteRecord(@PathVariable id: Long) {
        service.deleteRecord(id)
    }

    @PutMapping("/update")
    fun updateRecord(@RequestBody emp: Employee): Employee {
        return service.updateRecord(emp)
    }
}