package com.project.domain

import jakarta.persistence.*

@Table
@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id : Long? = null,
    var name : String?

)
