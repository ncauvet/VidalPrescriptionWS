package com.vidal.merlin.wsclient.ald;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:20 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "aldService")
@XmlSeeAlso({ObjectFactory.class})
public interface AldService {

    @WebResult(name = "productAldAtcListCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ald.SearchByProductIds")
    @ResponseWrapper(localName = "searchByProductIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ald.SearchByProductIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ald.ArrayOfProductAldAtcListCouple searchByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ald.ArrayOfInt productIds
    );
}
