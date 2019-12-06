package br.com.poc.service

import br.com.poc.domain.Product
import java.util.*

interface ProductService {

    fun findBydId(id:Long): Optional<Product>

    fun findAll(): List<Product>
}