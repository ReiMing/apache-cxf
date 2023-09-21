
package wlsdtest2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wlsdtest2 package. 
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

    private final static QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");
    private final static QName _String_QNAME = new QName("http://WebXml.com.cn/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wlsdtest2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEnCnTwoWayTranslator }
     * 
     */
    public GetEnCnTwoWayTranslator createGetEnCnTwoWayTranslator() {
        return new GetEnCnTwoWayTranslator();
    }

    /**
     * Create an instance of {@link GetEnCnTwoWayTranslatorResponse }
     * 
     */
    public GetEnCnTwoWayTranslatorResponse createGetEnCnTwoWayTranslatorResponse() {
        return new GetEnCnTwoWayTranslatorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link HelloWebXml }
     * 
     */
    public HelloWebXml createHelloWebXml() {
        return new HelloWebXml();
    }

    /**
     * Create an instance of {@link HelloWebXmlResponse }
     * 
     */
    public HelloWebXmlResponse createHelloWebXmlResponse() {
        return new HelloWebXmlResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}