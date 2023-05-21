package com.sringboot.clienteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sringboot.clienteapp.models.entity.Ejercicio;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Integer> {

}

