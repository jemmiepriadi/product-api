package com.project.projectapi.controller;

import com.project.projectapi.model.entities.Customer;
import com.project.projectapi.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerServices customerService;

    @PostMapping
    public Customer create(@RequestBody Customer Customer) {
        return customerService.save(Customer) ;
    }
    @GetMapping
    public Iterable <Customer> findALL() {
        return customerService.findAll();
    }
    @GetMapping("/{id)")
    public Customer findOne (@PathVariable("id") Long id){
        return customerService.getById(id);
    }
    @PutMapping
    public Customer update(@RequestBody Customer Customer) {
        return customerService.save(Customer);
    }
}
