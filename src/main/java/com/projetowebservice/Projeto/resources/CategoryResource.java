package com.projetowebservice.Projeto.resources;

import com.projetowebservice.Projeto.entities.Category;
import com.projetowebservice.Projeto.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Category> findById(Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}

