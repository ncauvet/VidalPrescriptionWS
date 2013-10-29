package com.vidal.merlin.wsclient.asmr;

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
 
@WebService(targetNamespace = "urn:Vidal", name = "asmrService")
@XmlSeeAlso({ObjectFactory.class})
public interface AsmrService {

    @WebResult(name = "asmrList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchBySmrId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.asmr.SearchBySmrId")
    @ResponseWrapper(localName = "searchBySmrIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.asmr.SearchBySmrIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.asmr.ArrayOfAsmr searchBySmrId(
        @WebParam(name = "smrId", targetNamespace = "urn:Vidal")
        java.lang.Integer smrId
    );
}
