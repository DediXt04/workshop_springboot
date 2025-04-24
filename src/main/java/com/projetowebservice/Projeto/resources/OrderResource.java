package com.projetowebservice.Projeto.resources;

import com.projetowebservice.Projeto.entities.Order;
import com.projetowebservice.Projeto.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Order> findById(Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

