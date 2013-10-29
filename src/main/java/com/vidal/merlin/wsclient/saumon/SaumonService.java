package com.vidal.merlin.wsclient.saumon;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:32 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "saumonService")
@XmlSeeAlso({ObjectFactory.class})
public interface SaumonService {

    @WebResult(name = "saumonList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.ArrayOfSaumon searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "saumonList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.ArrayOfSaumon searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "saumonList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getChildren", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetChildren")
    @ResponseWrapper(localName = "getChildrenResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetChildrenResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.ArrayOfSaumon getChildren(
        @WebParam(name = "saumonId", targetNamespace = "urn:Vidal")
        java.lang.Integer saumonId
    );

    @WebResult(name = "saumon", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getRootNode", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetRootNode")
    @ResponseWrapper(localName = "getRootNodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetRootNodeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.Saumon getRootNode();

    @WebResult(name = "saumon", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.Saumon searchById(
        @WebParam(name = "saumonId", targetNamespace = "urn:Vidal")
        java.lang.Integer saumonId
    );

    @WebResult(name = "saumon", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getParent", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetParent")
    @ResponseWrapper(localName = "getParentResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.saumon.GetParentResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.saumon.Saumon getParent(
        @WebParam(name = "saumonId", targetNamespace = "urn:Vidal")
        java.lang.Integer saumonId
    );
}