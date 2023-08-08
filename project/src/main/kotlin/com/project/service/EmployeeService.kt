package com.project.service

import com.project.domain.Employee
import com.project.repository.EmployeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService(@Autowired var repositry: EmployeRepository) {

    // get all
    fun getAllRecords(): List<Employee> {
        return repositry.findAll()
    }

    //get by id
    fun getRecordById(id: Long): Employee {
        return repositry.findById(id).get()
    }

    // create record

    fun createRecord(emp: Employee): Employee {
        return repositry.save(emp)
    }

    // delete by id
    fun deleteRecord(id: Long) {
        repositry.deleteById(id)
    }

    // update
    fun updateRecord(emp: Employee): Employee {
        val emp1 = repositry.findById(emp.id!!).get()
        emp1.name = emp.name
        return repositry.save(emp1)
    }
}
