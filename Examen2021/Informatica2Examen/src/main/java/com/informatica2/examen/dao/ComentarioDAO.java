package com.informatica2.examen.dao;

import java.util.List;

import com.informatica2.examen.model.Comentario;

public interface ComentarioDAO {
	public void crearComentario(Comentario comentario);
	public Comentario getComentario(String email);
	public List<Comentario> getComentarios();
}
