package br.com.poc.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "PRODUCT")
data class Product(@Id @GeneratedValue val id: Long, val name: String)