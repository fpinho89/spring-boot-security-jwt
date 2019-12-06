package br.com.poc.service

import br.com.poc.domain.ApplicationUser
import br.com.poc.repository.ApplicationUserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl(private val applicationUserRepository: ApplicationUserRepository) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {

        val applicationUser: ApplicationUser = this.applicationUserRepository.findByUsername(username) ?: throw UsernameNotFoundException(username)

        return User(applicationUser?.username, applicationUser?.password, emptyList())
    }
}