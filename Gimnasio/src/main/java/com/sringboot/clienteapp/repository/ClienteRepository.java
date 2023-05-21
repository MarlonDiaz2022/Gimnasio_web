package com.sringboot.clienteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sringboot.clienteapp.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
