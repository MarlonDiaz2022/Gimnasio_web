package com.sringboot.clienteapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sringboot.clienteapp.models.entity.Cliente;
import com.sringboot.clienteapp.repository.ClienteRepository;

public class ClienteServiceImpl implements IClienteservice{

	@Autowired
	private ClienteRepository clienteRepository; 

	@Override
	public Cliente guardar(Cliente cliente) {
	
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
	
		clienteRepository.deleteById(id);
	}

	@Override
	public void editar(int id) {
		
		clienteRepository.findById(id).orElse(null);
		
	}

}
