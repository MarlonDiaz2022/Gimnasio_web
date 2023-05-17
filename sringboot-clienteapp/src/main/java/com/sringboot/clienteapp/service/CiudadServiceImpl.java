package com.sringboot.clienteapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sringboot.clienteapp.models.entity.Ciudad;
import com.sringboot.clienteapp.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements ICiudadservice {

	@Autowired
	private CiudadRepository ciudadR;
	
	@Override
	public List<Ciudad> listaciudades() {
		
		
		return (List<Ciudad>)ciudadR.findAll();
	}

}
