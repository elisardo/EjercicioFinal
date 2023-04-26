package com.uax.plantilla.service;

import java.util.List;

import com.uax.plantilla.model.Contacto;

public interface ContactoService {
	public void addContacto(Contacto contacto);
	public List<Contacto> getContactos();
	public Contacto getContactoByName(String name);
}
