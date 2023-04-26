package com.uax.plantilla.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.uax.plantilla.model.Contacto;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ContactoDAOImpl implements ContactoDAO {
	private final SessionFactory sessionFactory;
	
	public ContactoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	public Session getCurrentSession() {
		
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public void addContacto(Contacto contacto) {
		this.getCurrentSession().persist(contacto);

	}

	@Override
	public List<Contacto> getContactos() {
		
		
		return (List<Contacto>)this.getCurrentSession().createQuery("FROM Contacto").list();
	}

	@Override
	public Contacto getContactoByName(String name) {
	
		return (Contacto)this.getCurrentSession().createQuery("FROM Contacto WHERE name = "+name).uniqueResult();
	}

}
