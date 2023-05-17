package com.sringboot.clienteapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.sringboot.clienteapp.models.entity.Ciudad;

public interface CiudadRepository extends CrudRepository<Ciudad, Integer> {

}
