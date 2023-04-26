package com.uax.plantilla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uax.plantilla.model.Contacto;
import com.uax.plantilla.dao.ContactoDAO;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDAO contactoDao;
	
	
	
	
	@Override
	public void addContacto(Contacto contacto) {
		contactoDao.addContacto(contacto);

	}

	@Override
	public List<Contacto> getContactos() {
		// TODO Auto-generated method stub
		return contactoDao.getContactos();
	}

	@Override
	public Contacto getContactoByName(String name) {
		return contactoDao.getContactoByName(name);
	}

}
