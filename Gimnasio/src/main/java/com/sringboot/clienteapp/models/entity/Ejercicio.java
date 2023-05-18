package com.sringboot.clienteapp.models.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ejercicio{
	
@Id	
private int id;
private String nombre;
private int tipo;
private String instructivo;


//llave foranea
private int rutina;



}