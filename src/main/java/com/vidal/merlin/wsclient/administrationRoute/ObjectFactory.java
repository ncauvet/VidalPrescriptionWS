
package com.vidal.merlin.wsclient.administrationRoute;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vidal.merlin.wsclient.administrationRoute package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vidal.merlin.wsclient.administrationRoute
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllRoutes }
     * 
     */
    public GetAllRoutes createGetAllRoutes() {
        return new GetAllRoutes();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfRoute }
     * 
     */
    public ArrayOfRoute createArrayOfRoute() {
        return new ArrayOfRoute();
    }

    /**
     * Create an instance of {@link GetAllRoutesResponse }
     * 
     */
    public GetAllRoutesResponse createGetAllRoutesResponse() {
        return new GetAllRoutesResponse();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link SearchByIds }
     * 
     */
    public SearchByIds createSearchByIds() {
        return new SearchByIds();
    }

    /**
     * Create an instance of {@link PagedResultRoute }
     * 
     */
    public PagedResultRoute createPagedResultRoute() {
        return new PagedResultRoute();
    }

    /**
     * Create an instance of {@link SearchByIdsResponse }
     * 
     */
    public SearchByIdsResponse createSearchByIdsResponse() {
        return new SearchByIdsResponse();
    }

}
