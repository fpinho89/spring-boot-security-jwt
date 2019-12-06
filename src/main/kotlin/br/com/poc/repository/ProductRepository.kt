package br.com.poc.repository

import br.com.poc.domain.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>