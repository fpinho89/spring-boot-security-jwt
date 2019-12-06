package br.com.poc.repository

import br.com.poc.domain.ApplicationUser
import org.springframework.data.repository.CrudRepository

interface ApplicationUserRepository : CrudRepository<ApplicationUser, Long> {

    fun findByUsername(username:String) : ApplicationUser?
}