package es.informatica.endpoint;
import javax.xml.ws.Endpoint;
import es.informatica.ws.HolaWSImpl;
 
//Endpoint publisher
public class HolaWSPublisher{ 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hola", new HolaWSImpl());
	   System.out.println("Servidor encendido...");
    }
}
