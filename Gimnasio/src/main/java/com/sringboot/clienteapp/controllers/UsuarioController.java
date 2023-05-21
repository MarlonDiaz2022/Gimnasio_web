package com.sringboot.clienteapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sringboot.clienteapp.models.entity.Cliente;

import lombok.Data;

@RequestMapping("/views/cliente")
@Controller
@Data
public class UsuarioController {
	
	
	
	
@GetMapping("/registro")
public String resgistro() {
	
	return"views/resgistro";
}

@GetMapping("/perfil")
public String perfil() {
	
	return"views/perfil";
}
	
/*
 * @PostMapping("/registro") public String registrar(Model model) {
 * 
 * Cliente cliente = Cliente();
 * 
 * model.addAttribute("titulo", "registro de cliente");
 * model.addAttribute("cliente", cliente); //model.addAttribute("ciudad",
 * listaciudades);
 * 
 * return "/views/registro";
 * 
 * }
 */

@PostMapping("/guardar")
public String guardar(@ModelAttribute Cliente cliente) {

	//clienteservice.guardar(cliente);

	System.out.println("se ha guardado con exito");

	return "redirect:/views/perfil";

}





private Cliente Cliente() {
	// TODO Auto-generated method stub
	return null;
}
	

}
