package com.sringboot.clienteapp.controller;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sringboot.clienteapp.models.entity.Ciudad;
import com.sringboot.clienteapp.models.entity.Cliente;
import com.sringboot.clienteapp.service.ClienteServiceImpl;
import com.sringboot.clienteapp.service.ICiudadservice;
import com.sringboot.clienteapp.service.IClienteService;

import lombok.Data;

@Controller
@RequestMapping("/views/clientes")
@Data
public class ClienteController {

	@Autowired
	private ClienteServiceImpl clienteservice;

	@Autowired
	private ICiudadservice ciudadservice;

	private Ciudad ciudad;

	@GetMapping("/")
	public String listar(Model model) {

		List<Cliente> listadocliente = clienteservice.listar();

		model.addAttribute("titulo", "lista de clientes");
		model.addAttribute("cliente", listadocliente);

		return "views/cliente/listar";
	}

	@GetMapping("/create")
	public String crear(Model model) {

		Cliente cliente = new Cliente();

		List<Ciudad> listaciudades = ciudadservice.listaciudades();

		model.addAttribute("titulo", "formulario nuevo cliente");
		model.addAttribute("cliente", cliente);
		model.addAttribute("ciudad", listaciudades);

		return "views/cliente/crear";
	}

	@PostMapping("/save")
	public String guardar(@ModelAttribute Cliente cliente) {

		clienteservice.guardar(cliente);

		System.out.println("se ha guardado con exito");

		return "redirect:/views/clientes/";

	}
	
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") Integer idcliente, Model model) {

		Cliente cliente = clienteservice.buscarid(idcliente);
             
		List<Ciudad> listaciudades = ciudadservice.listaciudades();

		model.addAttribute("titulo", "editar cliente");
		model.addAttribute("cliente", cliente);
		model.addAttribute("ciudad", listaciudades);

		return "views/cliente/crear";
	}
	

	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") Integer idcliente) {

		clienteservice.eliminar(idcliente);
		
		
		System.out.println("se ha eliminado con exito");
		
		return "redirect:/views/clientes/";
	}
	
	
	

}
