package com.vidal.merlin.wsclient.ucd;

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
 
@WebService(targetNamespace = "urn:Vidal", name = "ucdService")
@XmlSeeAlso({ObjectFactory.class})
public interface UcdService {

    @WebResult(name = "ucd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCode", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCode")
    @ResponseWrapper(localName = "searchByCodeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCodeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.Ucd searchByCode(
        @WebParam(name = "code", targetNamespace = "urn:Vidal")
        java.lang.String code
    );

    @WebResult(name = "ucdIndicatorsList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchUcdIndicatorsByUcdIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchUcdIndicatorsByUcdIds")
    @ResponseWrapper(localName = "searchUcdIndicatorsByUcdIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchUcdIndicatorsByUcdIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcdIndicators searchUcdIndicatorsByUcdIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfInt ucdIds
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByProductId")
    @ResponseWrapper(localName = "searchByProductIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByProductIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByProductId(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByNameResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCodes", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCodes")
    @ResponseWrapper(localName = "searchByCodesResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCodesResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByCodes(
        @WebParam(name = "codes", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfString codes
    );

    @WebResult(name = "ucd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByPackId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByPackId")
    @ResponseWrapper(localName = "searchByPackIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByPackIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.Ucd searchByPackId(
        @WebParam(name = "packId", targetNamespace = "urn:Vidal")
        java.lang.Integer packId
    );

    @WebResult(name = "pagedResultUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByNameWithPagedResult", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByNameWithPagedResult")
    @ResponseWrapper(localName = "searchByNameWithPagedResultResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByNameWithPagedResultResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.PagedResultUcd searchByNameWithPagedResult(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebResult(name = "ucd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.Ucd searchById(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        java.lang.Integer ucdId
    );

    @WebResult(name = "ProductRangeUcdCoupleList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByProductRangeIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByProductRangeIds")
    @ResponseWrapper(localName = "searchByProductRangeIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByProductRangeIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfProductRangeUcdCouple searchByProductRangeIds(
        @WebParam(name = "productRangeIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfInt productRangeIds
    );

    @WebResult(name = "ucdFullList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcdFullByIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcdFullByIds")
    @ResponseWrapper(localName = "getAllUcdFullByIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcdFullByIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcdFull getAllUcdFullByIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfInt ucdIds,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfAggregate aggregates
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCompanyIdAndType", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCompanyIdAndType")
    @ResponseWrapper(localName = "searchByCompanyIdAndTypeResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCompanyIdAndTypeResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByCompanyIdAndType(
        @WebParam(name = "companyId", targetNamespace = "urn:Vidal")
        java.lang.Integer companyId,
        @WebParam(name = "type", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.CompanyType type
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchNewlyAvailableUcds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchNewlyAvailableUcds")
    @ResponseWrapper(localName = "searchNewlyAvailableUcdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchNewlyAvailableUcdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchNewlyAvailableUcds();

    @WebResult(name = "pagedResultUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcds")
    @ResponseWrapper(localName = "getAllUcdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.PagedResultUcd getAllUcds(
        @WebParam(name = "ucdApiFilter", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.UcdApiFilter ucdApiFilter,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByIds")
    @ResponseWrapper(localName = "searchByIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfInt ucdIds
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCompanyId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCompanyId")
    @ResponseWrapper(localName = "searchByCompanyIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCompanyIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByCompanyId(
        @WebParam(name = "companyId", targetNamespace = "urn:Vidal")
        java.lang.Integer companyId
    );

    @WebResult(name = "pagedResultFullUcd", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getAllUcdFull", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcdFull")
    @ResponseWrapper(localName = "getAllUcdFullResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetAllUcdFullResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.PagedResultUcdFull getAllUcdFull(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "ucdApiFilter", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.UcdApiFilter ucdApiFilter,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfAggregate aggregates,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebResult(name = "ucdList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.SearchByCommonNameGroupIdResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcd searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );

    @WebResult(name = "ucdPosologyUnitsAndItemsConcentrationsList", targetNamespace = "urn:Vidal")
    @RequestWrapper(localName = "getUcdsPosologyUnitsAndItemsConcentrationsByUcdIds", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetUcdsPosologyUnitsAndItemsConcentrationsByUcdIds")
    @ResponseWrapper(localName = "getUcdsPosologyUnitsAndItemsConcentrationsByUcdIdsResponse", targetNamespace = "urn:Vidal", className = "com.vidal.merlin.wsclient.ucd.GetUcdsPosologyUnitsAndItemsConcentrationsByUcdIdsResponse")
    @WebMethod
    public com.vidal.merlin.wsclient.ucd.ArrayOfUcdPosologyUnitsAndItemsConcentrations getUcdsPosologyUnitsAndItemsConcentrationsByUcdIds(
        @WebParam(name = "ucdIds", targetNamespace = "urn:Vidal")
        com.vidal.merlin.wsclient.ucd.ArrayOfInt ucdIds
    );
}
