package com.uax.informatica2examenfinal.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.uax.informatica2examenfinal.model.Correos;
import com.uax.informatica2examenfinal.util.EmailValidator;
import com.uax.informatica2examenfinal.service.CorreosService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Autowired
	private CorreosService correosService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = { "/", "/index.html" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
	
		return "index";
	}
	
	
	
	@RequestMapping(value = { "/correos" }, method = RequestMethod.GET)
	public String mensajesGet(Model model) {
		//PREGUNTA 5D
		return null;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	// PREGUNTA 5A
	// PREGUNTA 5B
	
	public String mensajePost(){
		
		return null;
	}
}
