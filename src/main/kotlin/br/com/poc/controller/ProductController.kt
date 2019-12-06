package br.com.poc.controller

import br.com.poc.domain.Product
import br.com.poc.service.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(private val productService: ProductService) {

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long) : ResponseEntity<Product> {
        return ResponseEntity.of(this.productService.findBydId(id))
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Product>> {
        return ResponseEntity.ok(this.productService.findAll())
    }
}