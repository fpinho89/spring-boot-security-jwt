package br.com.poc

import br.com.poc.domain.ApplicationUser
import br.com.poc.repository.ApplicationUserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@SpringBootApplication
class PocApplication {

	@Bean
	fun loadUserTest(repository: ApplicationUserRepository) = CommandLineRunner {
		//BCryptPasswordEncoder()
		repository.save(ApplicationUser(1,"admin", "\$2a\$10\$D8Zhm5q4KRgWe4QoBfpmQuo8Kck1kwuEk5GsBBRZbRw4FEFlaBoji"))
	}

}

fun main(args: Array<String>) {
	runApplication<PocApplication>(*args)
}
