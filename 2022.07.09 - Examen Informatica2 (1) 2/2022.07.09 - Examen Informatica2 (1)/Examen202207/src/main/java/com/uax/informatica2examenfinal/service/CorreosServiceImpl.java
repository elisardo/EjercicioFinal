package com.uax.informatica2examenfinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uax.informatica2examenfinal.model.Correos;
import com.uax.informatica2examenfinal.dao.CorreosDAO;

@Service
public class CorreosServiceImpl implements CorreosDAO, CorreosService {
	@Autowired
	private CorreosDAO CorreoDao;
	
	@Override
	public void addCorreo(Correos correo) {
		CorreoDao.addCorreo(correo);
	}

	@Override
	public Correos getCorreoByUser(String username) {
		return CorreoDao.getCorreoByUser(username);
	}

	@Override
	public List<Correos> getCorreos() {
		return CorreoDao.getCorreos();
	}

	
}
