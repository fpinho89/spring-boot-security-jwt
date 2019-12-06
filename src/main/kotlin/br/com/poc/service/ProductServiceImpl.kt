package br.com.poc.service

import br.com.poc.domain.Product
import br.com.poc.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(private val repository: ProductRepository) : ProductService {

    override fun findBydId(id: Long): Optional<Product> {
        return this.repository.findById(id)
    }

    override fun findAll(): List<Product> {
        return this.repository.findAll().toList()
    }
}