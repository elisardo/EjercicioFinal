package es.informatica.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface ="es.informatica.ws.HolaWS")
public interface HolaWS {
	@WebMethod String decirHola(String nombre);
}
