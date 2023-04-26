package com.uax.plantilla.controller;

import java.util.List;
import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.plantilla.model.Contacto;
import com.uax.plantilla.service.ContactoService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ContactoService contactoService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/", "/index.html" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		List<Contacto> lista = contactoService.getContactos();
		
		for(Contacto c: lista) {
			System.out.println("Nombre -->"+c.getName());
			System.out.println("Email -->"+c.getEmail());
		}	
			
		return "index";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/form" }, method = RequestMethod.POST)
	public String form(@RequestParam("name")String name, @RequestParam("email")String email ) {
	
		Contacto contacto = new Contacto();
		contacto.setEmail(email);
		contacto.setName(name);
		
		contactoService.addContacto(contacto);
		
		
		
		return "index";
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/blog", "/blog.html" }, method = RequestMethod.GET)
	public String blog(Locale locale, Model model) {
		
		return "blog";
	}
	

}
