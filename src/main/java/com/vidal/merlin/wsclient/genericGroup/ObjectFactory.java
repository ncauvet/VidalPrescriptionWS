
package com.vidal.merlin.wsclient.genericGroup;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.genericGroup package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.genericGroup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProductGenericGroup }
     * 
     */
    public ArrayOfProductGenericGroup createArrayOfProductGenericGroup() {
        return new ArrayOfProductGenericGroup();
    }

    /**
     * Create an instance of {@link ArrayOfGenericGroup }
     * 
     */
    public ArrayOfGenericGroup createArrayOfGenericGroup() {
        return new ArrayOfGenericGroup();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductGenericGroup }
     * 
     */
    public ProductGenericGroup createProductGenericGroup() {
        return new ProductGenericGroup();
    }

    /**
     * Create an instance of {@link SearchByIdResponse }
     * 
     */
    public SearchByIdResponse createSearchByIdResponse() {
        return new SearchByIdResponse();
    }

    /**
     * Create an instance of {@link SearchById }
     * 
     */
    public SearchById createSearchById() {
        return new SearchById();
    }

    /**
     * Create an instance of {@link SearchByProductIdResponse }
     * 
     */
    public SearchByProductIdResponse createSearchByProductIdResponse() {
        return new SearchByProductIdResponse();
    }

    /**
     * Create an instance of {@link SearchByProductId }
     * 
     */
    public SearchByProductId createSearchByProductId() {
        return new SearchByProductId();
    }

    /**
     * Create an instance of {@link GenericGroup }
     * 
     */
    public GenericGroup createGenericGroup() {
        return new GenericGroup();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

}
