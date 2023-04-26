package com.informatica2.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatica2.examen.dao.ComentarioDAO;
import com.informatica2.examen.model.Comentario;




@Service
public class ComentarioServiceImpl implements ComentarioService {

	@Autowired
	private ComentarioDAO comentarioDAO;
	
	@Override
	public void crearComentario(Comentario contacto) {
		comentarioDAO.crearComentario(contacto);
		
	}

	@Override
	public Comentario getComentario(String email) {
		// TODO Auto-generated method stub
		return comentarioDAO.getComentario(email);
	}

	@Override
	public List<Comentario> getComentarios() {
		// TODO Auto-generated method stub
		return comentarioDAO.getComentarios();
	}

}
