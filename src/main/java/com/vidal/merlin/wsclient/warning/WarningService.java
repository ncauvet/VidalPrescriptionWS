package com.vidal.merlin.wsclient.warning;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:33 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "warningService")
@XmlSeeAlso({ObjectFactory.class})
public interface WarningService {

    @WebResult(name = "warningCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.warning.ArrayOfWarningCommentCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "warningList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.warning.ArrayOfWarning searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "warning", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.warning.Warning searchById(
        @WebParam(name = "warningId", targetNamespace = "urn:Vidal")
        java.lang.Integer warningId
    );

    @WebResult(name = "warningList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.warning.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.warning.CommonNameGroupWarningList searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );
}
