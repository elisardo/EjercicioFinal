package es.informatica.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HolaWSImpl implements HolaWS {

	private String mensaje = new String ("Hola estudiante, ");
	@WebMethod
	public String decirHola(String nombre) {
		// TODO Auto-generated method stub
		return mensaje + nombre;
	}

}
