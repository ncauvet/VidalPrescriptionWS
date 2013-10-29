
package com.vidal.merlin.wsclient.product;

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
 * Mon Oct 28 23:24:31 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class ProductService_ProductServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "ProductService");

    private ProductService_ProductServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ProductService_Service.WSDL_LOCATION;
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
      
        ProductService_Service ss = new ProductService_Service(wsdlURL, SERVICE_NAME);
        ProductService port = ss.getProductServiceHttpPort();  
        
        {
        System.out.println("Invoking searchWithoutInteractionsByVidalId...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchWithoutInteractionsByVidalId_productIds = null;
        java.lang.Integer _searchWithoutInteractionsByVidalId_vidalId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchWithoutInteractionsByVidalId__return = port.searchWithoutInteractionsByVidalId(_searchWithoutInteractionsByVidalId_productIds, _searchWithoutInteractionsByVidalId_vidalId);
        System.out.println("searchWithoutInteractionsByVidalId.result=" + _searchWithoutInteractionsByVidalId__return);


        }
        {
        System.out.println("Invoking searchByDrugInteractionClassId...");
        java.lang.Integer _searchByDrugInteractionClassId_drugInteractionClassId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByDrugInteractionClassId__return = port.searchByDrugInteractionClassId(_searchByDrugInteractionClassId_drugInteractionClassId);
        System.out.println("searchByDrugInteractionClassId.result=" + _searchByDrugInteractionClassId__return);


        }
        {
        System.out.println("Invoking getProductFullByIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _getProductFullByIds_productIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfAggregate _getProductFullByIds_aggregates = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductFull _getProductFullByIds__return = port.getProductFullByIds(_getProductFullByIds_productIds, _getProductFullByIds_aggregates);
        System.out.println("getProductFullByIds.result=" + _getProductFullByIds__return);


        }
        {
        System.out.println("Invoking searchByMoleculeIdAndType...");
        java.lang.Integer _searchByMoleculeIdAndType_moleculeId = null;
        com.vidal.merlin.wsclient.product.SubstanceType _searchByMoleculeIdAndType_substanceType = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByMoleculeIdAndType__return = port.searchByMoleculeIdAndType(_searchByMoleculeIdAndType_moleculeId, _searchByMoleculeIdAndType_substanceType);
        System.out.println("searchByMoleculeIdAndType.result=" + _searchByMoleculeIdAndType__return);


        }
        {
        System.out.println("Invoking getGalenicForm...");
        java.lang.Integer _getGalenicForm_productId = null;
        com.vidal.merlin.wsclient.product.GalenicForm _getGalenicForm__return = port.getGalenicForm(_getGalenicForm_productId);
        System.out.println("getGalenicForm.result=" + _getGalenicForm__return);


        }
        {
        System.out.println("Invoking searchByMoleculeId...");
        java.lang.Integer _searchByMoleculeId_moleculeId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByMoleculeId__return = port.searchByMoleculeId(_searchByMoleculeId_moleculeId);
        System.out.println("searchByMoleculeId.result=" + _searchByMoleculeId__return);


        }
        {
        System.out.println("Invoking getAllProductFull...");
        java.lang.String _getAllProductFull_name = "";
        com.vidal.merlin.wsclient.product.ArrayOfMarketStatus _getAllProductFull_marketStatuses = null;
        com.vidal.merlin.wsclient.product.ProductApiFilter _getAllProductFull_productApiFilter = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductType _getAllProductFull_types = null;
        com.vidal.merlin.wsclient.product.ArrayOfAggregate _getAllProductFull_aggregates = null;
        java.lang.Integer _getAllProductFull_pageNumber = null;
        java.lang.Integer _getAllProductFull_pageSize = null;
        com.vidal.merlin.wsclient.product.PagedResultProductFull _getAllProductFull__return = port.getAllProductFull(_getAllProductFull_name, _getAllProductFull_marketStatuses, _getAllProductFull_productApiFilter, _getAllProductFull_types, _getAllProductFull_aggregates, _getAllProductFull_pageNumber, _getAllProductFull_pageSize);
        System.out.println("getAllProductFull.result=" + _getAllProductFull__return);


        }
        {
        System.out.println("Invoking searchByCodes...");
        com.vidal.merlin.wsclient.product.ArrayOfString _searchByCodes_cis = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByCodes__return = port.searchByCodes(_searchByCodes_cis);
        System.out.println("searchByCodes.result=" + _searchByCodes__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchByPrecautionId...");
        java.lang.Integer _searchByPrecautionId_precautionId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByPrecautionId__return = port.searchByPrecautionId(_searchByPrecautionId_precautionId);
        System.out.println("searchByPrecautionId.result=" + _searchByPrecautionId__return);


        }
        {
        System.out.println("Invoking searchByPackId...");
        java.lang.Integer _searchByPackId_packId = null;
        com.vidal.merlin.wsclient.product.Product _searchByPackId__return = port.searchByPackId(_searchByPackId_packId);
        System.out.println("searchByPackId.result=" + _searchByPackId__return);


        }
        {
        System.out.println("Invoking getRoute...");
        java.lang.Integer _getRoute_productId = null;
        com.vidal.merlin.wsclient.product.ArrayOfRoute _getRoute__return = port.getRoute(_getRoute_productId);
        System.out.println("getRoute.result=" + _getRoute__return);


        }
        {
        System.out.println("Invoking searchProductsByUcdId...");
        java.lang.Integer _searchProductsByUcdId_ucdId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchProductsByUcdId__return = port.searchProductsByUcdId(_searchProductsByUcdId_ucdId);
        System.out.println("searchProductsByUcdId.result=" + _searchProductsByUcdId__return);


        }
        {
        System.out.println("Invoking searchBySaumonIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchBySaumonIds_saumonIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchBySaumonIds__return = port.searchBySaumonIds(_searchBySaumonIds_saumonIds);
        System.out.println("searchBySaumonIds.result=" + _searchBySaumonIds__return);


        }
        {
        System.out.println("Invoking searchWithoutInteractionsByIndicationId...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchWithoutInteractionsByIndicationId_productIds = null;
        java.lang.Integer _searchWithoutInteractionsByIndicationId_indicationId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchWithoutInteractionsByIndicationId__return = port.searchWithoutInteractionsByIndicationId(_searchWithoutInteractionsByIndicationId_productIds, _searchWithoutInteractionsByIndicationId_indicationId);
        System.out.println("searchWithoutInteractionsByIndicationId.result=" + _searchWithoutInteractionsByIndicationId__return);


        }
        {
        System.out.println("Invoking searchProductIndicatorsByProductIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchProductIndicatorsByProductIds_productIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductIndicators _searchProductIndicatorsByProductIds__return = port.searchProductIndicatorsByProductIds(_searchProductIndicatorsByProductIds_productIds);
        System.out.println("searchProductIndicatorsByProductIds.result=" + _searchProductIndicatorsByProductIds__return);


        }
        {
        System.out.println("Invoking searchBySaumonId...");
        java.lang.Integer _searchBySaumonId_saumonId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchBySaumonId__return = port.searchBySaumonId(_searchBySaumonId_saumonId);
        System.out.println("searchBySaumonId.result=" + _searchBySaumonId__return);


        }
        {
        System.out.println("Invoking searchNewlyAvailableProducts...");
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchNewlyAvailableProducts__return = port.searchNewlyAvailableProducts();
        System.out.println("searchNewlyAvailableProducts.result=" + _searchNewlyAvailableProducts__return);


        }
        {
        System.out.println("Invoking searchProductRoutesCouplesByProductIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchProductRoutesCouplesByProductIds_productIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductRouteListCouple _searchProductRoutesCouplesByProductIds__return = port.searchProductRoutesCouplesByProductIds(_searchProductRoutesCouplesByProductIds_productIds);
        System.out.println("searchProductRoutesCouplesByProductIds.result=" + _searchProductRoutesCouplesByProductIds__return);


        }
        {
        System.out.println("Invoking searchByIndicationGroupId...");
        java.lang.Integer _searchByIndicationGroupId_indicationGroupId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByIndicationGroupId__return = port.searchByIndicationGroupId(_searchByIndicationGroupId_indicationGroupId);
        System.out.println("searchByIndicationGroupId.result=" + _searchByIndicationGroupId__return);


        }
        {
        System.out.println("Invoking searchByNameWithPagedResult...");
        java.lang.String _searchByNameWithPagedResult_name = "";
        com.vidal.merlin.wsclient.product.ArrayOfProductType _searchByNameWithPagedResult_types = null;
        com.vidal.merlin.wsclient.product.ArrayOfMarketStatus _searchByNameWithPagedResult_marketStatuses = null;
        java.lang.Integer _searchByNameWithPagedResult_pageNumber = null;
        java.lang.Integer _searchByNameWithPagedResult_pageSize = null;
        com.vidal.merlin.wsclient.product.PagedResultProduct _searchByNameWithPagedResult__return = port.searchByNameWithPagedResult(_searchByNameWithPagedResult_name, _searchByNameWithPagedResult_types, _searchByNameWithPagedResult_marketStatuses, _searchByNameWithPagedResult_pageNumber, _searchByNameWithPagedResult_pageSize);
        System.out.println("searchByNameWithPagedResult.result=" + _searchByNameWithPagedResult__return);


        }
        {
        System.out.println("Invoking hasCommonNameGroupSafetyAlert...");
        java.lang.Integer _hasCommonNameGroupSafetyAlert_productId = null;
        com.vidal.merlin.wsclient.product.SafetyAlertStatus _hasCommonNameGroupSafetyAlert__return = port.hasCommonNameGroupSafetyAlert(_hasCommonNameGroupSafetyAlert_productId);
        System.out.println("hasCommonNameGroupSafetyAlert.result=" + _hasCommonNameGroupSafetyAlert__return);


        }
        {
        System.out.println("Invoking getAsmr...");
        java.lang.Integer _getAsmr_productId = null;
        com.vidal.merlin.wsclient.product.ArrayOfAsmr _getAsmr__return = port.getAsmr(_getAsmr_productId);
        System.out.println("getAsmr.result=" + _getAsmr__return);


        }
        {
        System.out.println("Invoking searchByContraIndicationId...");
        java.lang.Integer _searchByContraIndicationId_contraIndicationId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByContraIndicationId__return = port.searchByContraIndicationId(_searchByContraIndicationId_contraIndicationId);
        System.out.println("searchByContraIndicationId.result=" + _searchByContraIndicationId__return);


        }
        {
        System.out.println("Invoking searchByEphmraId...");
        java.lang.Integer _searchByEphmraId_ephmraId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByEphmraId__return = port.searchByEphmraId(_searchByEphmraId_ephmraId);
        System.out.println("searchByEphmraId.result=" + _searchByEphmraId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_productId = null;
        com.vidal.merlin.wsclient.product.Product _searchById__return = port.searchById(_searchById_productId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchByNameAndType...");
        java.lang.String _searchByNameAndType_name = "";
        com.vidal.merlin.wsclient.product.ProductType _searchByNameAndType_type = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByNameAndType__return = port.searchByNameAndType(_searchByNameAndType_name, _searchByNameAndType_type);
        System.out.println("searchByNameAndType.result=" + _searchByNameAndType__return);


        }
        {
        System.out.println("Invoking getSmr...");
        java.lang.Integer _getSmr_productId = null;
        com.vidal.merlin.wsclient.product.ArrayOfSmr _getSmr__return = port.getSmr(_getSmr_productId);
        System.out.println("getSmr.result=" + _getSmr__return);


        }
        {
        System.out.println("Invoking directSearchByName...");
        java.lang.String _directSearchByName_name = "";
        com.vidal.merlin.wsclient.product.ArrayOfProduct _directSearchByName__return = port.directSearchByName(_directSearchByName_name);
        System.out.println("directSearchByName.result=" + _directSearchByName__return);


        }
        {
        System.out.println("Invoking searchByIndicationsGroupId...");
        java.lang.Integer _searchByIndicationsGroupId_indicationsGroupId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByIndicationsGroupId__return = port.searchByIndicationsGroupId(_searchByIndicationsGroupId_indicationsGroupId);
        System.out.println("searchByIndicationsGroupId.result=" + _searchByIndicationsGroupId__return);


        }
        {
        System.out.println("Invoking searchByGenericGroupId...");
        java.lang.Integer _searchByGenericGroupId_genericGroupId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByGenericGroupId__return = port.searchByGenericGroupId(_searchByGenericGroupId_genericGroupId);
        System.out.println("searchByGenericGroupId.result=" + _searchByGenericGroupId__return);


        }
        {
        System.out.println("Invoking searchByProductRangeIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchByProductRangeIds_productRangeIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductRangeProductCouple _searchByProductRangeIds__return = port.searchByProductRangeIds(_searchByProductRangeIds_productRangeIds);
        System.out.println("searchByProductRangeIds.result=" + _searchByProductRangeIds__return);


        }
        {
        System.out.println("Invoking searchByVidalId...");
        java.lang.Integer _searchByVidalId_vidalId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByVidalId__return = port.searchByVidalId(_searchByVidalId_vidalId);
        System.out.println("searchByVidalId.result=" + _searchByVidalId__return);


        }
        {
        System.out.println("Invoking searchByCis...");
        java.lang.String _searchByCis_cis = "";
        com.vidal.merlin.wsclient.product.Product _searchByCis__return = port.searchByCis(_searchByCis_cis);
        System.out.println("searchByCis.result=" + _searchByCis__return);


        }
        {
        System.out.println("Invoking searchBySempIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchBySempIds_sempIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchBySempIds__return = port.searchBySempIds(_searchBySempIds_sempIds);
        System.out.println("searchBySempIds.result=" + _searchBySempIds__return);


        }
        {
        System.out.println("Invoking searchByIndicationId...");
        java.lang.Integer _searchByIndicationId_indicationId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByIndicationId__return = port.searchByIndicationId(_searchByIndicationId_indicationId);
        System.out.println("searchByIndicationId.result=" + _searchByIndicationId__return);


        }
        {
        System.out.println("Invoking searchByWarningId...");
        java.lang.Integer _searchByWarningId_warningId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByWarningId__return = port.searchByWarningId(_searchByWarningId_warningId);
        System.out.println("searchByWarningId.result=" + _searchByWarningId__return);


        }
        {
        System.out.println("Invoking searchByVidalIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchByVidalIds_vidalIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByVidalIds__return = port.searchByVidalIds(_searchByVidalIds_vidalIds);
        System.out.println("searchByVidalIds.result=" + _searchByVidalIds__return);


        }
        {
        System.out.println("Invoking searchByNameWithTypes...");
        java.lang.String _searchByNameWithTypes_name = "";
        com.vidal.merlin.wsclient.product.ArrayOfProductType _searchByNameWithTypes_types = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByNameWithTypes__return = port.searchByNameWithTypes(_searchByNameWithTypes_name, _searchByNameWithTypes_types);
        System.out.println("searchByNameWithTypes.result=" + _searchByNameWithTypes__return);


        }
        {
        System.out.println("Invoking searchBySideEffectId...");
        java.lang.Integer _searchBySideEffectId_sideEffectId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchBySideEffectId__return = port.searchBySideEffectId(_searchBySideEffectId_sideEffectId);
        System.out.println("searchBySideEffectId.result=" + _searchBySideEffectId__return);


        }
        {
        System.out.println("Invoking searchByAtcIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchByAtcIds_atcIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByAtcIds__return = port.searchByAtcIds(_searchByAtcIds_atcIds);
        System.out.println("searchByAtcIds.result=" + _searchByAtcIds__return);


        }
        {
        System.out.println("Invoking searchByMoleculeIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchByMoleculeIds_moleculeIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfSubstanceType _searchByMoleculeIds_substanceTypes = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByMoleculeIds__return = port.searchByMoleculeIds(_searchByMoleculeIds_moleculeIds, _searchByMoleculeIds_substanceTypes);
        System.out.println("searchByMoleculeIds.result=" + _searchByMoleculeIds__return);


        }
        {
        System.out.println("Invoking searchByIds...");
        com.vidal.merlin.wsclient.product.ArrayOfInt _searchByIds_productIds = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByIds__return = port.searchByIds(_searchByIds_productIds);
        System.out.println("searchByIds.result=" + _searchByIds__return);


        }
        {
        System.out.println("Invoking searchByAtcId...");
        java.lang.Integer _searchByAtcId_atcId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByAtcId__return = port.searchByAtcId(_searchByAtcId_atcId);
        System.out.println("searchByAtcId.result=" + _searchByAtcId__return);


        }
        {
        System.out.println("Invoking searchByCompanyId...");
        java.lang.Integer _searchByCompanyId_companyId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByCompanyId__return = port.searchByCompanyId(_searchByCompanyId_companyId);
        System.out.println("searchByCompanyId.result=" + _searchByCompanyId__return);


        }
        {
        System.out.println("Invoking getAllProducts...");
        com.vidal.merlin.wsclient.product.ProductApiFilter _getAllProducts_productApiFilter = null;
        com.vidal.merlin.wsclient.product.ArrayOfProductType _getAllProducts_types = null;
        com.vidal.merlin.wsclient.product.ArrayOfMarketStatus _getAllProducts_marketStatuses = null;
        java.lang.Integer _getAllProducts_pageNumber = null;
        java.lang.Integer _getAllProducts_pageSize = null;
        com.vidal.merlin.wsclient.product.PagedResultProduct _getAllProducts__return = port.getAllProducts(_getAllProducts_productApiFilter, _getAllProducts_types, _getAllProducts_marketStatuses, _getAllProducts_pageNumber, _getAllProducts_pageSize);
        System.out.println("getAllProducts.result=" + _getAllProducts__return);


        }
        {
        System.out.println("Invoking getPrescriptionMode...");
        java.lang.Integer _getPrescriptionMode_productId = null;
        com.vidal.merlin.wsclient.product.PrescriptionMode _getPrescriptionMode__return = port.getPrescriptionMode(_getPrescriptionMode_productId);
        System.out.println("getPrescriptionMode.result=" + _getPrescriptionMode__return);


        }
        {
        System.out.println("Invoking searchByFoodInteractionId...");
        java.lang.Integer _searchByFoodInteractionId_foodInteractionId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByFoodInteractionId__return = port.searchByFoodInteractionId(_searchByFoodInteractionId_foodInteractionId);
        System.out.println("searchByFoodInteractionId.result=" + _searchByFoodInteractionId__return);


        }
        {
        System.out.println("Invoking searchBySempId...");
        java.lang.Integer _searchBySempId_sempId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchBySempId__return = port.searchBySempId(_searchBySempId_sempId);
        System.out.println("searchBySempId.result=" + _searchBySempId__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupId...");
        java.lang.Integer _searchByCommonNameGroupId_commonNameGroupId = null;
        com.vidal.merlin.wsclient.product.ArrayOfProduct _searchByCommonNameGroupId__return = port.searchByCommonNameGroupId(_searchByCommonNameGroupId_commonNameGroupId);
        System.out.println("searchByCommonNameGroupId.result=" + _searchByCommonNameGroupId__return);


        }
        {
        System.out.println("Invoking searchByUcdId...");
        java.lang.Integer _searchByUcdId_ucdId = null;
        com.vidal.merlin.wsclient.product.Product _searchByUcdId__return = port.searchByUcdId(_searchByUcdId_ucdId);
        System.out.println("searchByUcdId.result=" + _searchByUcdId__return);


        }

        System.exit(0);
    }

}