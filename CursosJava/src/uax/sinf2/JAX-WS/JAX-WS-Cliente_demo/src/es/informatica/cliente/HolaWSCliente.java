package es.informatica.cliente;


import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import es.informatica.cliente.HolaWSImplService;






public class HolaWSCliente{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/hola?wsdl");
       QName qname = new QName("http://ws.informatica.es/", "HolaWSImplService");
       QName qport = new QName("http://ws.informatica.es/", "HolaWSImplPort");
       Service service = Service.create(url, qname);

       HolaWSImpl hola = service.getPort(qport,HolaWSImpl.class);

       

       HolaWSImplService helloService = new HolaWSImplService();
	   HolaWSImpl hello = helloService.getHolaWSImplPort();

		System.out.println(hello.decirHola("aday"));

	}
}