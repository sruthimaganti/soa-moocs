package com.example.demo.productservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable String id,
            @RequestBody Product product) {

        Product existing = repository.findById(id).orElse(null);

        if (existing == null) {
            return null;
        }

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setCategory(product.getCategory());

        return repository.save(existing);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {

        if (!repository.existsById(id)) {
            return "Product not found";
        }

        repository.deleteById(id);

        return "Product deleted successfully";
    }
}
