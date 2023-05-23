package com.sringboot.clienteapp.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="cliente")
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private String apellido;
private String genero;
private String documento;
private String contraseña;
@Column(name="id_plan")
private Integer idPlan;



}
