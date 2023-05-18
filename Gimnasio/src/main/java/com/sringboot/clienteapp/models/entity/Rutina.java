package com.sringboot.clienteapp.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rutina {
	
@Id	
private int id;
private String nombre;
private String intensidad;
private String tipo;

//llave foranea
private int plan;


}
