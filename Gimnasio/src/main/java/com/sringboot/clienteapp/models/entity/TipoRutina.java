package com.sringboot.clienteapp.models.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoRutina {
	
@Id	
private int id;
private String nombre;




}