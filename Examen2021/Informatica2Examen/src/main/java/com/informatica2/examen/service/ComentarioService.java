package com.informatica2.examen.service;

import java.util.List;

import com.informatica2.examen.model.Comentario;

public interface ComentarioService {

	public void crearComentario(Comentario contacto);
	public Comentario getComentario(String email);
	public List<Comentario> getComentarios();
}
