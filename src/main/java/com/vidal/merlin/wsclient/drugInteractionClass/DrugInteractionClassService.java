package com.vidal.merlin.wsclient.drugInteractionClass;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:25 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "drugInteractionClassService")
@XmlSeeAlso({ObjectFactory.class})
public interface DrugInteractionClassService {

    @WebResult(name = "drugInteractionClassList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllInteractingClassesWithDrugInteractionClassId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchAllInteractingClassesWithDrugInteractionClassId")
    @ResponseWrapper(localName = "searchAllInteractingClassesWithDrugInteractionClassIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchAllInteractingClassesWithDrugInteractionClassIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.ArrayOfDrugInteractionClassSeverityCouple searchAllInteractingClassesWithDrugInteractionClassId(
        @WebParam(name = "drugInteractionClassId", targetNamespace = "urn:Vidal")
        java.lang.Integer drugInteractionClassId
    );

    @WebResult(name = "drugInteractionClassList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByInteractionId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByInteractionId")
    @ResponseWrapper(localName = "searchByInteractionIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByInteractionIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.ArrayOfDrugInteractionClass searchByInteractionId(
        @WebParam(name = "interactionId", targetNamespace = "urn:Vidal")
        java.lang.Integer interactionId
    );

    @WebResult(name = "drugInteractionClassList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.ArrayOfDrugInteractionClass searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "drugInteractionClassList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.ArrayOfDrugInteractionClass searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "drugInteractionClass", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.DrugInteractionClass searchById(
        @WebParam(name = "drugInteractionClassId", targetNamespace = "urn:Vidal")
        java.lang.Integer drugInteractionClassId
    );

    @WebResult(name = "drugInteractionClassList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.drugInteractionClass.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.drugInteractionClass.CommonNameGroupDrugInteractionClassList searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );
}
