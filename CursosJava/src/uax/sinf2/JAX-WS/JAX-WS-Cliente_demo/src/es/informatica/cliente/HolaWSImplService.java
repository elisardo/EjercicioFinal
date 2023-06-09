
package es.informatica.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HolaWSImplService", targetNamespace = "http://ws.informatica.es/", wsdlLocation = "file:/Users/aguerra/Documents/workspace-sts-3.9.0/JAX-WS-Cliente_demo/src/hola.wsdl")
public class HolaWSImplService
    extends Service
{

    private final static URL HOLAWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HOLAWSIMPLSERVICE_EXCEPTION;
    private final static QName HOLAWSIMPLSERVICE_QNAME = new QName("http://ws.informatica.es/", "HolaWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/aguerra/Documents/workspace-sts-3.9.0/JAX-WS-Cliente_demo/src/hola.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOLAWSIMPLSERVICE_WSDL_LOCATION = url;
        HOLAWSIMPLSERVICE_EXCEPTION = e;
    }

    public HolaWSImplService() {
        super(__getWsdlLocation(), HOLAWSIMPLSERVICE_QNAME);
    }

    public HolaWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOLAWSIMPLSERVICE_QNAME, features);
    }

    public HolaWSImplService(URL wsdlLocation) {
        super(wsdlLocation, HOLAWSIMPLSERVICE_QNAME);
    }

    public HolaWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOLAWSIMPLSERVICE_QNAME, features);
    }

    public HolaWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HolaWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HolaWSImpl
     */
    @WebEndpoint(name = "HolaWSImplPort")
    public HolaWSImpl getHolaWSImplPort() {
        return super.getPort(new QName("http://ws.informatica.es/", "HolaWSImplPort"), HolaWSImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HolaWSImpl
     */
    @WebEndpoint(name = "HolaWSImplPort")
    public HolaWSImpl getHolaWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.informatica.es/", "HolaWSImplPort"), HolaWSImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOLAWSIMPLSERVICE_EXCEPTION!= null) {
            throw HOLAWSIMPLSERVICE_EXCEPTION;
        }
        return HOLAWSIMPLSERVICE_WSDL_LOCATION;
    }

}
