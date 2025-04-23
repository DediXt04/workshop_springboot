package com.projetowebservice.Projeto.repository;

import com.projetowebservice.Projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {

}
