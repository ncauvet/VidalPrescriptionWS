package com.vidal.merlin.wsclient.galenicForm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:27 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "galenicFormService")
@XmlSeeAlso({ObjectFactory.class})
public interface GalenicFormService {

    @WebResult(name = "pagedResultGalenicForm", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllGalenicForms", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.GetAllGalenicForms")
    @ResponseWrapper(localName = "getAllGalenicFormsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.GetAllGalenicFormsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.galenicForm.PagedResultGalenicForm getAllGalenicForms(
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebResult(name = "galenicFormList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "galenicFormList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.SearchByIds")
    @ResponseWrapper(localName = "searchByIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.galenicForm.SearchByIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm searchByIds(
        @WebParam(name = "galenicFormIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.galenicForm.ArrayOfInt galenicFormIds
    );
}
