package com.sringboot.clienteapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sringboot.clienteapp.models.entity.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	
	
	

}
