package com.vidal.merlin.wsclient.surveillance;

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
 
@WebService(targetNamespace = "urn:Vidal", name = "surveillanceService")
@XmlSeeAlso({ObjectFactory.class})
public interface SurveillanceService {

    @WebResult(name = "surveillanceCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.surveillance.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.surveillance.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.surveillance.ArrayOfSurveillanceCommentCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "surveillanceCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.surveillance.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.surveillance.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.surveillance.ArrayOfSurveillanceCommentCouple searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );
}
