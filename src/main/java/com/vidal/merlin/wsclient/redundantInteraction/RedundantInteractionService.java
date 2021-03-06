package com.vidal.merlin.wsclient.redundantInteraction;

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
 
@WebService(targetNamespace = "urn:Vidal", name = "redundantInteractionService")
@XmlSeeAlso({ObjectFactory.class})
public interface RedundantInteractionService {

    @WebResult(name = "redundantInteractionCommonNameGroupCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchRedundantInteractionByCommonNameGroupIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteractionByCommonNameGroupIds")
    @ResponseWrapper(localName = "searchRedundantInteractionByCommonNameGroupIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteractionByCommonNameGroupIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.redundantInteraction.ArrayOfRedundantInteractionCommonNameGroupCouple searchRedundantInteractionByCommonNameGroupIds(
        @WebParam(name = "commonNameGroupIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.redundantInteraction.ArrayOfInt commonNameGroupIds
    );

    @WebResult(name = "redundantInteractionCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchRedundantInteraction", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteraction")
    @ResponseWrapper(localName = "searchRedundantInteractionResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteractionResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.redundantInteraction.ArrayOfRedundantInteractionCouple searchRedundantInteraction(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.redundantInteraction.ArrayOfInt productIds
    );

    @WebResult(name = "redundantInteractionCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchRedundantInteractionByProductIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteractionByProductIds")
    @ResponseWrapper(localName = "searchRedundantInteractionByProductIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.redundantInteraction.SearchRedundantInteractionByProductIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.redundantInteraction.ArrayOfRedundantInteractionCouple searchRedundantInteractionByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.redundantInteraction.ArrayOfInt productIds
    );
}
