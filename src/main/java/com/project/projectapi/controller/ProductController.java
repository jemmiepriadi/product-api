package com.project.projectapi.controller;

import com.project.projectapi.model.entities.Product;
import com.project.projectapi.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServices productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product) ;
    }
    @GetMapping
    public Iterable <Product> findALL() {
        return productService.findAll();
    }
    @GetMapping("/{id)")
    public Product findOne (@PathVariable("id") Long id){
        return productService.getById(id);
    }
    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }
}
