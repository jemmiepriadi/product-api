package com.project.projectapi.services;

import com.project.projectapi.model.entities.Order;
import com.project.projectapi.repos.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderServices {
    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public Order getById(long id){
        return orderRepository.findById(id).get();
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(long id){
        orderRepository.deleteById(id);
    }
}
