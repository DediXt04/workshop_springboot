package com.projetowebservice.Projeto.repository;

import com.projetowebservice.Projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long > {

}
