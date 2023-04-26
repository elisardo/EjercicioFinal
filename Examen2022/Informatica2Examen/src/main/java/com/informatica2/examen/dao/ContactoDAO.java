package com.informatica2.examen.dao;

import java.util.List;

import com.informatica2.examen.model.Contacto;

public interface ContactoDAO {
	public void crearContacto(Contacto contacto);
	public Contacto getContacto(String email);
	public List<Contacto> getContactos();
}
