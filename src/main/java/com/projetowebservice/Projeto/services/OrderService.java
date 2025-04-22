package com.projetowebservice.Projeto.services;

import com.projetowebservice.Projeto.entities.Order;
import com.projetowebservice.Projeto.entities.User;
import com.projetowebservice.Projeto.repository.OrderRepository;
import com.projetowebservice.Projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;


    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj= repository.findById(id);
        return obj.get();
    }
}
