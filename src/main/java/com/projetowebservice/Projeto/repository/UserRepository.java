package com.projetowebservice.Projeto.repository;

import com.projetowebservice.Projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {

}
