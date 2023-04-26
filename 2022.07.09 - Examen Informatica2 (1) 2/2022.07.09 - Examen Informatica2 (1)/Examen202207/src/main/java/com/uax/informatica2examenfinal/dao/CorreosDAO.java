package com.uax.informatica2examenfinal.dao;

import java.util.List;

import com.uax.informatica2examenfinal.model.Correos;

public interface CorreosDAO {
	public void addCorreo(Correos correo);
	public Correos getCorreoByUser(String username);
	public List<Correos> getCorreos();
}
