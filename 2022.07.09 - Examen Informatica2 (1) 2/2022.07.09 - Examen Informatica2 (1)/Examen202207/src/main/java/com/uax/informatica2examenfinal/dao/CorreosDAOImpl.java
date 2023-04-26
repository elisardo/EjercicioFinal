package com.uax.informatica2examenfinal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uax.informatica2examenfinal.model.Correos;

@Repository
@Transactional
public class CorreosDAOImpl implements CorreosDAO {
	
	private SessionFactory sessionFactory;
	 
	@Autowired
	public CorreosDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addCorreo(Correos correo) {
		
			this.getCurrentSession().save(correo);
		
		 
		
	}

	
	@Override
	public Correos getCorreoByUser(String username) {
		// TODO Auto-generated method stub
		return (Correos) this.getCurrentSession().createQuery("FROM Correos WHERE username = '" + username + "'").uniqueResult();
	}

	@Override
	public List<Correos> getCorreos() {
		// TODO Auto-generated method stub
		return ((List<Correos>)this.getCurrentSession().createQuery("FROM Correos").list());
	}
	
}
