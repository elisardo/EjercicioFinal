package com.informatica2.examen.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.informatica2.examen.dao.ComentarioDAO;
import com.informatica2.examen.model.Comentario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ComentarioDAO comentarioDAO;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		//PREGUNTA 4d
		
		return "index";
	}
	

	//PREGUNTA 4a
	//PREGUNTA 4b
	//PREGUNTA 4c
	
	
}
