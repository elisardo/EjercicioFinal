package com.informatica2.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica2.examen.dao.ContactoDAO;
import com.informatica2.examen.model.Contacto;




@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDAO comentarioDAO;
	
	@Override
	public void crearContacto(Contacto contacto) {
		comentarioDAO.crearContacto(contacto);
		
	}

	@Override
	public Contacto getContacto(String email) {
		// TODO Auto-generated method stub
		return comentarioDAO.getContacto(email);
	}

	@Override
	public List<Contacto> getContactos() {
		// TODO Auto-generated method stub
		return comentarioDAO.getContactos();
	}

}
