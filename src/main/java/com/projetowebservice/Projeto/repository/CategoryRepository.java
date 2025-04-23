package com.projetowebservice.Projeto.repository;

import com.projetowebservice.Projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long > {

}
