package com.uax.plantilla.dao;

import java.util.List;

import org.hibernate.Session;

import com.uax.plantilla.model.Contacto;

public interface ContactoDAO {
	
	public Session getCurrentSession();
	public void addContacto(Contacto contacto);
	public List<Contacto> getContactos();
	public Contacto getContactoByName(String name);

}
