
package com.vidal.merlin.wsclient.ald;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.ald package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.ald
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AldAtc }
     * 
     */
    public AldAtc createAldAtc() {
        return new AldAtc();
    }

    /**
     * Create an instance of {@link Atc }
     * 
     */
    public Atc createAtc() {
        return new Atc();
    }

    /**
     * Create an instance of {@link ArrayOfAldAtc }
     * 
     */
    public ArrayOfAldAtc createArrayOfAldAtc() {
        return new ArrayOfAldAtc();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ProductAldAtcListCouple }
     * 
     */
    public ProductAldAtcListCouple createProductAldAtcListCouple() {
        return new ProductAldAtcListCouple();
    }

    /**
     * Create an instance of {@link ArrayOfProductAldAtcListCouple }
     * 
     */
    public ArrayOfProductAldAtcListCouple createArrayOfProductAldAtcListCouple() {
        return new ArrayOfProductAldAtcListCouple();
    }

    /**
     * Create an instance of {@link SearchByProductIds }
     * 
     */
    public SearchByProductIds createSearchByProductIds() {
        return new SearchByProductIds();
    }

    /**
     * Create an instance of {@link Ald }
     * 
     */
    public Ald createAld() {
        return new Ald();
    }

    /**
     * Create an instance of {@link SearchByProductIdsResponse }
     * 
     */
    public SearchByProductIdsResponse createSearchByProductIdsResponse() {
        return new SearchByProductIdsResponse();
    }

}
