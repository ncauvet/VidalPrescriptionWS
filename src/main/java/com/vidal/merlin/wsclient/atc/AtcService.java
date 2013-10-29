package com.vidal.merlin.wsclient.atc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:22 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "atcService")
@XmlSeeAlso({ObjectFactory.class})
public interface AtcService {

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCode", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByCode")
    @ResponseWrapper(localName = "searchByCodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByCodeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByCode(
        @WebParam(name = "code", targetNamespace = "urn:Vidal")
        java.lang.String code
    );

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getChildren", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetChildren")
    @ResponseWrapper(localName = "getChildrenResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetChildrenResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc getChildren(
        @WebParam(name = "atcId", targetNamespace = "urn:Vidal")
        java.lang.Integer atcId
    );

    @WebResult(name = "atc", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getRootNode", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetRootNode")
    @ResponseWrapper(localName = "getRootNodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetRootNodeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.Atc getRootNode();

    @WebResult(name = "atc", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.Atc searchById(
        @WebParam(name = "atcId", targetNamespace = "urn:Vidal")
        java.lang.Integer atcId
    );

    @WebResult(name = "pagedResultAtc", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllAtcs", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetAllAtcs")
    @ResponseWrapper(localName = "getAllAtcsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetAllAtcsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.PagedResultAtc getAllAtcs(
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebResult(name = "atc", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getParent", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetParent")
    @ResponseWrapper(localName = "getParentResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.GetParentResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.Atc getParent(
        @WebParam(name = "atcId", targetNamespace = "urn:Vidal")
        java.lang.Integer atcId
    );

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );

    @WebResult(name = "atcList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "findByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.FindByProductId")
    @ResponseWrapper(localName = "findByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.atc.FindByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc findByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );
}
