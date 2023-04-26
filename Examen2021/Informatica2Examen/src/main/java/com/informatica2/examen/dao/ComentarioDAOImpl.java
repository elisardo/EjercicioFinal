package com.informatica2.examen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.informatica2.examen.model.Comentario;

@Repository
@Transactional
public class ComentarioDAOImpl implements ComentarioDAO{

	private SessionFactory sessionFactory;
	
	@Autowired
	public ComentarioDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void crearComentario(Comentario comentario) {
		this.getCurrentSession().save(comentario);
		
	}

	@Override
	public Comentario getComentario(String email) {
		return (Comentario) this.getCurrentSession().createQuery("FROM Comentario WHERE email = '"+email+"'").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> getComentarios() {
		// TODO Auto-generated method stub
		return (List<Comentario>)this.getCurrentSession().createQuery("FROM Comentario").list();
	}

}
