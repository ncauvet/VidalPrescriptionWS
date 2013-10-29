package com.vidal.merlin.wsclient.foodInteraction;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:26 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "foodInteractionService")
@XmlSeeAlso({ObjectFactory.class})
public interface FoodInteractionService {

    @WebResult(name = "foodInteractionCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "foodInteractionList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteraction searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "foodInteraction", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.foodInteraction.FoodInteraction searchById(
        @WebParam(name = "foodInteractionId", targetNamespace = "urn:Vidal")
        java.lang.Integer foodInteractionId
    );

    @WebResult(name = "foodInteraction", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchOneByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchOneByName")
    @ResponseWrapper(localName = "searchOneByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchOneByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.foodInteraction.FoodInteraction searchOneByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "foodInteractionCommentCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.foodInteraction.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );
}