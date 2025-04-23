package com.projetowebservice.Projeto.repository;

import com.projetowebservice.Projeto.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long > {

}
