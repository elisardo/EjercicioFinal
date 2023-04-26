package com.informatica2.examen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.informatica2.examen.model.Contacto;

@Repository
@Transactional
public class ContactoDAOImpl implements ContactoDAO{

	private SessionFactory sessionFactory;
	
	@Autowired
	public ContactoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	


	@Override
	public Contacto getContacto(String email) {
		return (Contacto) this.getCurrentSession().createQuery("FROM Contacto WHERE email = '"+email+"'").uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contacto> getContactos() {
		// TODO Auto-generated method stub
		return (List<Contacto>)this.getCurrentSession().createQuery("FROM Contacto").list();
	}

	@Override
	public void crearContacto(Contacto contacto) {
		this.getCurrentSession().save(contacto);
		
	}

}
