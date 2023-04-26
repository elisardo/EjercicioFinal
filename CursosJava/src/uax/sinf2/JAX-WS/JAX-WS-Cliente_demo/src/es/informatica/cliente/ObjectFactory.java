
package es.informatica.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.informatica.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DecirHolaResponse_QNAME = new QName("http://ws.informatica.es/", "decirHolaResponse");
    private final static QName _DecirHola_QNAME = new QName("http://ws.informatica.es/", "decirHola");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.informatica.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecirHolaResponse }
     * 
     */
    public DecirHolaResponse createDecirHolaResponse() {
        return new DecirHolaResponse();
    }

    /**
     * Create an instance of {@link DecirHola }
     * 
     */
    public DecirHola createDecirHola() {
        return new DecirHola();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecirHolaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.informatica.es/", name = "decirHolaResponse")
    public JAXBElement<DecirHolaResponse> createDecirHolaResponse(DecirHolaResponse value) {
        return new JAXBElement<DecirHolaResponse>(_DecirHolaResponse_QNAME, DecirHolaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecirHola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.informatica.es/", name = "decirHola")
    public JAXBElement<DecirHola> createDecirHola(DecirHola value) {
        return new JAXBElement<DecirHola>(_DecirHola_QNAME, DecirHola.class, null, value);
    }

}
