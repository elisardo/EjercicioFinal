package com.informatica2.examen.service;

import java.util.List;

import com.informatica2.examen.model.Contacto;

public interface ContactoService {

	public void crearContacto(Contacto contacto);
	public Contacto getContacto(String email);
	public List<Contacto> getContactos();
}
