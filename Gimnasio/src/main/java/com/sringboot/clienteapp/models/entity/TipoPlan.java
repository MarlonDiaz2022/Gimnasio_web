package com.sringboot.clienteapp.models.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoPlan {
	
@Id	
private int id;
private String nombre;
private String precio;




}