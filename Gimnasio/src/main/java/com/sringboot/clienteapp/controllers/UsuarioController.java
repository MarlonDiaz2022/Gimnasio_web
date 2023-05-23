package com.sringboot.clienteapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sringboot.clienteapp.models.entity.Cliente;
import com.sringboot.clienteapp.service.ClienteServiceImpl;

import lombok.Data;

@RequestMapping("/views/cliente")
@Controller
@Data
public class UsuarioController {

	@Autowired
	private ClienteServiceImpl clienteservice;

	@GetMapping("/registro")
	public String registro(Model model) {

		Cliente cliente = new Cliente();

		model.addAttribute("titulo", "registro de cliente");
		model.addAttribute("cliente", cliente);

		return "views/registro";
	}

	@GetMapping("/perfil")
	public String perfil() {

		return "views/perfil";
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Cliente cliente) {

		clienteservice.guardar(cliente);

		System.out.println("se ha guardado con exito");

		return "/views/perfil";

	}

	private Cliente Cliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
