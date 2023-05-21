package com.sringboot.clienteapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.sringboot.clienteapp.models.entity.Instrumento;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer> {

}

