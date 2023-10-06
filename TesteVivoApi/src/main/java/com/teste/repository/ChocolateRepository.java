package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.entity.Chocolate;

public interface ChocolateRepository extends JpaRepository<Chocolate, Long> {
    Chocolate findByTipo(String tipo);
}
