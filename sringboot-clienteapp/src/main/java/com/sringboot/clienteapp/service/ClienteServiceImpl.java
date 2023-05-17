package com.sringboot.clienteapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sringboot.clienteapp.models.entity.Cliente;
import com.sringboot.clienteapp.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteRepository clienteRepository; 
	
	@Override
	public List<Cliente> listar() {
		 
		return (List<Cliente>)clienteRepository.findAll();
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarid(int id) {
		
		return clienteRepository.findById(id).orElse(null);
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
