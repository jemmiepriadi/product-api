package com.project.projectapi.services;

import com.project.projectapi.model.entities.Product;
import com.project.projectapi.repos.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product getById(long id){
        return productRepository.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void delete(long id){
         productRepository.deleteById(id);
    }
}
