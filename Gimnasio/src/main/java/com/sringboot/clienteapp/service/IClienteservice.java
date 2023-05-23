package com.sringboot.clienteapp.service;

import java.util.List;

import com.sringboot.clienteapp.models.entity.Cliente;

public interface IClienteservice {

	
	
	public Cliente guardar(Cliente cliente);
	public Cliente buscarid(int id);
	public void eliminar(int id);
	public void editar(int id);
	
	
}
