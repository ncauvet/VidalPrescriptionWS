
package com.vidal.merlin.wsclient.pack;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:29 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class PackService_PackServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "PackService");

    private PackService_PackServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = PackService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        PackService_Service ss = new PackService_Service(wsdlURL, SERVICE_NAME);
        PackService port = ss.getPackServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByTypedCodes...");
        com.vidal.merlin.wsclient.pack.SearchPackCode _searchByTypedCodes_searchPackCode = null;
        com.vidal.merlin.wsclient.pack.ArrayOfString _searchByTypedCodes_codes = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByTypedCodes__return = port.searchByTypedCodes(_searchByTypedCodes_searchPackCode, _searchByTypedCodes_codes);
        System.out.println("searchByTypedCodes.result=" + _searchByTypedCodes__return);


        }
        {
        System.out.println("Invoking getRefundingRate...");
        java.lang.Integer _getRefundingRate_packId = null;
        java.lang.Integer _getRefundingRate_indicationId = null;
        java.lang.String _getRefundingRate__return = port.getRefundingRate(_getRefundingRate_packId, _getRefundingRate_indicationId);
        System.out.println("getRefundingRate.result=" + _getRefundingRate__return);


        }
        {
        System.out.println("Invoking searchByLpprIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchByLpprIds_lpprIds = null;
        java.lang.Integer _searchByLpprIds_pageNumber = null;
        java.lang.Integer _searchByLpprIds_pageSize = null;
        com.vidal.merlin.wsclient.pack.PagedResultPackLpprCouple _searchByLpprIds__return = port.searchByLpprIds(_searchByLpprIds_lpprIds, _searchByLpprIds_pageNumber, _searchByLpprIds_pageSize);
        System.out.println("searchByLpprIds.result=" + _searchByLpprIds__return);


        }
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchByCodes...");
        com.vidal.merlin.wsclient.pack.ArrayOfString _searchByCodes_cips = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByCodes__return = port.searchByCodes(_searchByCodes_cips);
        System.out.println("searchByCodes.result=" + _searchByCodes__return);


        }
        {
        System.out.println("Invoking searchByIndicationIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchByIndicationIds_indicationIds = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByIndicationIds__return = port.searchByIndicationIds(_searchByIndicationIds_indicationIds);
        System.out.println("searchByIndicationIds.result=" + _searchByIndicationIds__return);


        }
        {
        System.out.println("Invoking searchByNameWithPagedResult...");
        java.lang.String _searchByNameWithPagedResult_name = "";
        com.vidal.merlin.wsclient.pack.ArrayOfProductType _searchByNameWithPagedResult_types = null;
        com.vidal.merlin.wsclient.pack.ArrayOfMarketStatus _searchByNameWithPagedResult_marketStatuses = null;
        java.lang.Integer _searchByNameWithPagedResult_pageNumber = null;
        java.lang.Integer _searchByNameWithPagedResult_pageSize = null;
        com.vidal.merlin.wsclient.pack.PagedResultPack _searchByNameWithPagedResult__return = port.searchByNameWithPagedResult(_searchByNameWithPagedResult_name, _searchByNameWithPagedResult_types, _searchByNameWithPagedResult_marketStatuses, _searchByNameWithPagedResult_pageNumber, _searchByNameWithPagedResult_pageSize);
        System.out.println("searchByNameWithPagedResult.result=" + _searchByNameWithPagedResult__return);


        }
        {
        System.out.println("Invoking searchNewlyAvailablePacks...");
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchNewlyAvailablePacks__return = port.searchNewlyAvailablePacks();
        System.out.println("searchNewlyAvailablePacks.result=" + _searchNewlyAvailablePacks__return);


        }
        {
        System.out.println("Invoking searchByEphmraId...");
        java.lang.Integer _searchByEphmraId_ephmraId = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByEphmraId__return = port.searchByEphmraId(_searchByEphmraId_ephmraId);
        System.out.println("searchByEphmraId.result=" + _searchByEphmraId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_packId = null;
        com.vidal.merlin.wsclient.pack.Pack _searchById__return = port.searchById(_searchById_packId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchByProductRangeIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchByProductRangeIds_productRangeIds = null;
        com.vidal.merlin.wsclient.pack.ArrayOfProductRangePackCouple _searchByProductRangeIds__return = port.searchByProductRangeIds(_searchByProductRangeIds_productRangeIds);
        System.out.println("searchByProductRangeIds.result=" + _searchByProductRangeIds__return);


        }
        {
        System.out.println("Invoking getAllPackages...");
        com.vidal.merlin.wsclient.pack.PackApiFilter _getAllPackages_packApiFilter = null;
        com.vidal.merlin.wsclient.pack.ArrayOfProductType _getAllPackages_types = null;
        com.vidal.merlin.wsclient.pack.ArrayOfMarketStatus _getAllPackages_marketStatuses = null;
        java.lang.Integer _getAllPackages_pageNumber = null;
        java.lang.Integer _getAllPackages_pageSize = null;
        com.vidal.merlin.wsclient.pack.PagedResultPack _getAllPackages__return = port.getAllPackages(_getAllPackages_packApiFilter, _getAllPackages_types, _getAllPackages_marketStatuses, _getAllPackages_pageNumber, _getAllPackages_pageSize);
        System.out.println("getAllPackages.result=" + _getAllPackages__return);


        }
        {
        System.out.println("Invoking searchPackIndicatorsByPackIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchPackIndicatorsByPackIds_packIds = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPackIndicators _searchPackIndicatorsByPackIds__return = port.searchPackIndicatorsByPackIds(_searchPackIndicatorsByPackIds_packIds);
        System.out.println("searchPackIndicatorsByPackIds.result=" + _searchPackIndicatorsByPackIds__return);


        }
        {
        System.out.println("Invoking searchByNameTypesAndMarketStatuses...");
        java.lang.String _searchByNameTypesAndMarketStatuses_name = "";
        com.vidal.merlin.wsclient.pack.ArrayOfProductType _searchByNameTypesAndMarketStatuses_types = null;
        com.vidal.merlin.wsclient.pack.ArrayOfMarketStatus _searchByNameTypesAndMarketStatuses_marketStatuses = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByNameTypesAndMarketStatuses__return = port.searchByNameTypesAndMarketStatuses(_searchByNameTypesAndMarketStatuses_name, _searchByNameTypesAndMarketStatuses_types, _searchByNameTypesAndMarketStatuses_marketStatuses);
        System.out.println("searchByNameTypesAndMarketStatuses.result=" + _searchByNameTypesAndMarketStatuses__return);


        }
        {
        System.out.println("Invoking searchByIndicationId...");
        java.lang.Integer _searchByIndicationId_indicationId = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByIndicationId__return = port.searchByIndicationId(_searchByIndicationId_indicationId);
        System.out.println("searchByIndicationId.result=" + _searchByIndicationId__return);


        }
        {
        System.out.println("Invoking searchRefundingRateByIndicationId...");
        java.lang.Integer _searchRefundingRateByIndicationId_packId = null;
        java.lang.Integer _searchRefundingRateByIndicationId_indicationId = null;
        java.lang.String _searchRefundingRateByIndicationId__return = port.searchRefundingRateByIndicationId(_searchRefundingRateByIndicationId_packId, _searchRefundingRateByIndicationId_indicationId);
        System.out.println("searchRefundingRateByIndicationId.result=" + _searchRefundingRateByIndicationId__return);


        }
        {
        System.out.println("Invoking searchByCip...");
        java.lang.String _searchByCip_cip = "";
        com.vidal.merlin.wsclient.pack.Pack _searchByCip__return = port.searchByCip(_searchByCip_cip);
        System.out.println("searchByCip.result=" + _searchByCip__return);


        }
        {
        System.out.println("Invoking getReimbursementSchedule...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _getReimbursementSchedule_packIds = null;
        com.vidal.merlin.wsclient.pack.ReimbursementScheduleFilter _getReimbursementSchedule_reimbursementScheduleFilter = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPackageReimbursementCouple _getReimbursementSchedule__return = port.getReimbursementSchedule(_getReimbursementSchedule_packIds, _getReimbursementSchedule_reimbursementScheduleFilter);
        System.out.println("getReimbursementSchedule.result=" + _getReimbursementSchedule__return);


        }
        {
        System.out.println("Invoking searchByProductIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchByProductIds_productIds = null;
        java.lang.Integer _searchByProductIds_pageNumber = null;
        java.lang.Integer _searchByProductIds_pageSize = null;
        com.vidal.merlin.wsclient.pack.PagedResultPack _searchByProductIds__return = port.searchByProductIds(_searchByProductIds_productIds, _searchByProductIds_pageNumber, _searchByProductIds_pageSize);
        System.out.println("searchByProductIds.result=" + _searchByProductIds__return);


        }
        {
        System.out.println("Invoking searchByCompanyIdAndType...");
        java.lang.Integer _searchByCompanyIdAndType_companyId = null;
        com.vidal.merlin.wsclient.pack.CompanyType _searchByCompanyIdAndType_type = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByCompanyIdAndType__return = port.searchByCompanyIdAndType(_searchByCompanyIdAndType_companyId, _searchByCompanyIdAndType_type);
        System.out.println("searchByCompanyIdAndType.result=" + _searchByCompanyIdAndType__return);


        }
        {
        System.out.println("Invoking searchByIds...");
        com.vidal.merlin.wsclient.pack.ArrayOfInt _searchByIds_packageIds = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByIds__return = port.searchByIds(_searchByIds_packageIds);
        System.out.println("searchByIds.result=" + _searchByIds__return);


        }
        {
        System.out.println("Invoking searchByCompanyId...");
        java.lang.Integer _searchByCompanyId_companyId = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByCompanyId__return = port.searchByCompanyId(_searchByCompanyId_companyId);
        System.out.println("searchByCompanyId.result=" + _searchByCompanyId__return);


        }
        {
        System.out.println("Invoking searchByUcdId...");
        java.lang.Integer _searchByUcdId_ucdId = null;
        com.vidal.merlin.wsclient.pack.ArrayOfPack _searchByUcdId__return = port.searchByUcdId(_searchByUcdId_ucdId);
        System.out.println("searchByUcdId.result=" + _searchByUcdId__return);


        }

        System.exit(0);
    }

}
