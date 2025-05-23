package com.projetowebservice.Projeto.resources;

import com.projetowebservice.Projeto.entities.Product;
import com.projetowebservice.Projeto.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Product> findById(Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

