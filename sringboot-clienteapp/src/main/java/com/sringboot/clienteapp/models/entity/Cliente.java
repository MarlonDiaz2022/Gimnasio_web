package com.sringboot.clienteapp.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="cliente")
@Data
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String nombre;	
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name="ciudad_id")
	private Ciudad ciudad_id;
	
	
	
	
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad_id=" + ciudad_id + "]";
	}
	
	
	
	
}
