package com.project.projectapi.services;

import com.project.projectapi.model.entities.Customer;
import com.project.projectapi.repos.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer Customer){
        return customerRepository.save(Customer);
    }

    public Customer getById(long id){
        return customerRepository.findById(id).get();
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void delete(long id){
        customerRepository.deleteById(id);
    }
}
