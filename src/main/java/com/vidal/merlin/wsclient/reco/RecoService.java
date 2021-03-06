package com.vidal.merlin.wsclient.reco;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:31 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "recoService")
@XmlSeeAlso({ObjectFactory.class})
public interface RecoService {

    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfReco searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "recoDomainList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchDomainByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchDomainByName")
    @ResponseWrapper(localName = "searchDomainByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchDomainByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfRecoDomain searchDomainByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "recoDomain", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchDomainById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchDomainById")
    @ResponseWrapper(localName = "searchDomainByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchDomainByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.RecoDomain searchDomainById(
        @WebParam(name = "recoDomainId", targetNamespace = "urn:Vidal")
        java.lang.Integer recoDomainId
    );

    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllRecosByProductIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllRecosByProductIds")
    @ResponseWrapper(localName = "searchAllRecosByProductIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllRecosByProductIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfReco searchAllRecosByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.reco.ArrayOfInt productIds
    );

    @WebResult(name = "reco", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.Reco searchById(
        @WebParam(name = "recoId", targetNamespace = "urn:Vidal")
        java.lang.Integer recoId
    );

    @WebResult(name = "recoDomainList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllDomains", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllDomains")
    @ResponseWrapper(localName = "searchAllDomainsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllDomainsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfRecoDomain searchAllDomains();

    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIndicationGroupIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByIndicationGroupIds")
    @ResponseWrapper(localName = "searchByIndicationGroupIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByIndicationGroupIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfReco searchByIndicationGroupIds(
        @WebParam(name = "indicationGroupIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.reco.ArrayOfInt indicationGroupIds
    );

    @WebResult(name = "recoUrl", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getRecoUrl", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.GetRecoUrl")
    @ResponseWrapper(localName = "getRecoUrlResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.GetRecoUrlResponse")
    @WebMethod
    public java.lang.String getRecoUrl(
        @WebParam(name = "recoId", targetNamespace = "urn:Vidal")
        java.lang.Integer recoId
    );

    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchAllRecos", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllRecos")
    @ResponseWrapper(localName = "searchAllRecosResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchAllRecosResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfReco searchAllRecos();

    @WebResult(name = "recoList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByDomainIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByDomainIds")
    @ResponseWrapper(localName = "searchByDomainIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.reco.SearchByDomainIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.reco.ArrayOfReco searchByDomainIds(
        @WebParam(name = "recoDomainIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.reco.ArrayOfInt recoDomainIds
    );
}
