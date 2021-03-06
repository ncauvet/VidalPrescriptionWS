package com.vidal.merlin.wsclient.composition;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:24 CET 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "urn:Vidal", name = "compositionService")
@XmlSeeAlso({ObjectFactory.class})
public interface CompositionService {

    @WebResult(name = "itemCompositionsCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchCompositionsByProduct", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByProduct")
    @ResponseWrapper(localName = "searchCompositionsByProductResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByProductResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.composition.ArrayOfItemCompositionsCouple searchCompositionsByProduct(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId,
        @WebParam(name = "substanceTypes", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.composition.ArrayOfSubstanceType substanceTypes
    );

    @WebResult(name = "commonNameGroupCompositionList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchByCommonNameGroupIds")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchByCommonNameGroupIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.composition.ArrayOfCommonNameGroupComposition searchByCommonNameGroupIds(
        @WebParam(name = "commonNameGroupIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.composition.ArrayOfInt commonNameGroupIds
    );

    @WebResult(name = "itemCompositionsCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchCompositionsByProductIdAndSubstanceType", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByProductIdAndSubstanceType")
    @ResponseWrapper(localName = "searchCompositionsByProductIdAndSubstanceTypeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByProductIdAndSubstanceTypeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.composition.ArrayOfItemCompositionsCouple searchCompositionsByProductIdAndSubstanceType(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId,
        @WebParam(name = "substanceType", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.composition.SubstanceType substanceType
    );

    @WebResult(name = "itemCompositionsCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchCompositionsByUcdIdAndSubstanceTypes", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByUcdIdAndSubstanceTypes")
    @ResponseWrapper(localName = "searchCompositionsByUcdIdAndSubstanceTypesResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.composition.SearchCompositionsByUcdIdAndSubstanceTypesResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.composition.ArrayOfItemCompositionsCouple searchCompositionsByUcdIdAndSubstanceTypes(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        java.lang.Integer ucdId,
        @WebParam(name = "substanceTypes", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.composition.ArrayOfSubstanceType substanceTypes
    );
}
