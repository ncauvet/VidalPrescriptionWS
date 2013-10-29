
package com.vidal.merlin.wsclient.redundantInteraction;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.redundantInteraction package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.redundantInteraction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Molecule }
     * 
     */
    public Molecule createMolecule() {
        return new Molecule();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfRedundantInteractionCouple }
     * 
     */
    public ArrayOfRedundantInteractionCouple createArrayOfRedundantInteractionCouple() {
        return new ArrayOfRedundantInteractionCouple();
    }

    /**
     * Create an instance of {@link ArrayOfRedundantInteractionCommonNameGroupCouple }
     * 
     */
    public ArrayOfRedundantInteractionCommonNameGroupCouple createArrayOfRedundantInteractionCommonNameGroupCouple() {
        return new ArrayOfRedundantInteractionCommonNameGroupCouple();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link RedundantInteractionCommonNameGroupCouple }
     * 
     */
    public RedundantInteractionCommonNameGroupCouple createRedundantInteractionCommonNameGroupCouple() {
        return new RedundantInteractionCommonNameGroupCouple();
    }

    /**
     * Create an instance of {@link SearchRedundantInteractionByCommonNameGroupIdsResponse }
     * 
     */
    public SearchRedundantInteractionByCommonNameGroupIdsResponse createSearchRedundantInteractionByCommonNameGroupIdsResponse() {
        return new SearchRedundantInteractionByCommonNameGroupIdsResponse();
    }

    /**
     * Create an instance of {@link CommonNameGroup }
     * 
     */
    public CommonNameGroup createCommonNameGroup() {
        return new CommonNameGroup();
    }

    /**
     * Create an instance of {@link RedundantInteractionCouple }
     * 
     */
    public RedundantInteractionCouple createRedundantInteractionCouple() {
        return new RedundantInteractionCouple();
    }

    /**
     * Create an instance of {@link SearchRedundantInteractionResponse }
     * 
     */
    public SearchRedundantInteractionResponse createSearchRedundantInteractionResponse() {
        return new SearchRedundantInteractionResponse();
    }

    /**
     * Create an instance of {@link SearchRedundantInteractionByCommonNameGroupIds }
     * 
     */
    public SearchRedundantInteractionByCommonNameGroupIds createSearchRedundantInteractionByCommonNameGroupIds() {
        return new SearchRedundantInteractionByCommonNameGroupIds();
    }

    /**
     * Create an instance of {@link SearchRedundantInteraction }
     * 
     */
    public SearchRedundantInteraction createSearchRedundantInteraction() {
        return new SearchRedundantInteraction();
    }

    /**
     * Create an instance of {@link SearchRedundantInteractionByProductIds }
     * 
     */
    public SearchRedundantInteractionByProductIds createSearchRedundantInteractionByProductIds() {
        return new SearchRedundantInteractionByProductIds();
    }

    /**
     * Create an instance of {@link SearchRedundantInteractionByProductIdsResponse }
     * 
     */
    public SearchRedundantInteractionByProductIdsResponse createSearchRedundantInteractionByProductIdsResponse() {
        return new SearchRedundantInteractionByProductIdsResponse();
    }

}
