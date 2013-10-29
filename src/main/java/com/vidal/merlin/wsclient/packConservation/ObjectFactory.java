
package com.vidal.merlin.wsclient.packConservation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.packConservation package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.packConservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfConservationCaution }
     * 
     */
    public ArrayOfConservationCaution createArrayOfConservationCaution() {
        return new ArrayOfConservationCaution();
    }

    /**
     * Create an instance of {@link SearchByPackId }
     * 
     */
    public SearchByPackId createSearchByPackId() {
        return new SearchByPackId();
    }

    /**
     * Create an instance of {@link ArrayOfPackageConservation }
     * 
     */
    public ArrayOfPackageConservation createArrayOfPackageConservation() {
        return new ArrayOfPackageConservation();
    }

    /**
     * Create an instance of {@link ConservationCaution }
     * 
     */
    public ConservationCaution createConservationCaution() {
        return new ConservationCaution();
    }

    /**
     * Create an instance of {@link SearchByPackIdResponse }
     * 
     */
    public SearchByPackIdResponse createSearchByPackIdResponse() {
        return new SearchByPackIdResponse();
    }

    /**
     * Create an instance of {@link PackageConservation }
     * 
     */
    public PackageConservation createPackageConservation() {
        return new PackageConservation();
    }

}
