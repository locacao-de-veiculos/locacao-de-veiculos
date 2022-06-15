package com.example.crudUsuarios.repository;

import com.example.crudUsuarios.model.Veiculos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculosRepo extends JpaRepository<Veiculos, Long> {
}