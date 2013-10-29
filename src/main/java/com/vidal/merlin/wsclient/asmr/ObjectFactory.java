
package com.vidal.merlin.wsclient.asmr;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.asmr package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.asmr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAsmr }
     * 
     */
    public ArrayOfAsmr createArrayOfAsmr() {
        return new ArrayOfAsmr();
    }

    /**
     * Create an instance of {@link SearchBySmrIdResponse }
     * 
     */
    public SearchBySmrIdResponse createSearchBySmrIdResponse() {
        return new SearchBySmrIdResponse();
    }

    /**
     * Create an instance of {@link SearchBySmrId }
     * 
     */
    public SearchBySmrId createSearchBySmrId() {
        return new SearchBySmrId();
    }

    /**
     * Create an instance of {@link Asmr }
     * 
     */
    public Asmr createAsmr() {
        return new Asmr();
    }

}
