package br.com.poc.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ApplicationUser(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long, val username: String, val password:String)