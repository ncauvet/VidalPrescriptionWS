package com.vidal.merlin.wsclient.apparatusService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:21 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "apparatusService")
@XmlSeeAlso({ObjectFactory.class})
public interface ApparatusService {

    @WebResult(name = "apparatusList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchBySideEffectName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchBySideEffectName")
    @ResponseWrapper(localName = "searchBySideEffectNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchBySideEffectNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.apparatusService.ArrayOfApparatus searchBySideEffectName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "apparatusList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.apparatusService.ArrayOfApparatus searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "apparatus", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.apparatusService.Apparatus searchById(
        @WebParam(name = "apparatusId", targetNamespace = "urn:Vidal")
        java.lang.Integer apparatusId
    );

    @WebResult(name = "apparatus", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchBySideEffectId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchBySideEffectId")
    @ResponseWrapper(localName = "searchBySideEffectIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.apparatusService.SearchBySideEffectIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.apparatusService.Apparatus searchBySideEffectId(
        @WebParam(name = "sideEffectId", targetNamespace = "urn:Vidal")
        java.lang.Integer sideEffectId
    );
}