package com.sringboot.clienteapp.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ciudad")
@Data
public class Ciudad implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String nombre;

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + "]";
	}

}
