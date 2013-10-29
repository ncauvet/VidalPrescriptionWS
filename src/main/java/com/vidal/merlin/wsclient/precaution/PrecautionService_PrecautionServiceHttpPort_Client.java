
package com.vidal.merlin.wsclient.precaution;

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
 * Mon Oct 28 23:24:30 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class PrecautionService_PrecautionServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "PrecautionService");

    private PrecautionService_PrecautionServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = PrecautionService_Service.WSDL_LOCATION;
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
      
        PrecautionService_Service ss = new PrecautionService_Service(wsdlURL, SERVICE_NAME);
        PrecautionService port = ss.getPrecautionServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupIdsAndEpp...");
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchByCommonNameGroupIdsAndEpp_commonNameGroupIds = null;
        javax.xml.datatype.XMLGregorianCalendar _searchByCommonNameGroupIdsAndEpp_dateOfBirth = null;
        java.lang.Integer _searchByCommonNameGroupIdsAndEpp_weight = null;
        com.vidal.merlin.wsclient.precaution.Breastfeeding _searchByCommonNameGroupIdsAndEpp_breastfeeding = null;
        java.lang.Integer _searchByCommonNameGroupIdsAndEpp_weeksOfAmenorrhoea = null;
        java.lang.Integer _searchByCommonNameGroupIdsAndEpp_creatinClearance = null;
        com.vidal.merlin.wsclient.precaution.Gender _searchByCommonNameGroupIdsAndEpp_gender = null;
        com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList _searchByCommonNameGroupIdsAndEpp__return = port.searchByCommonNameGroupIdsAndEpp(_searchByCommonNameGroupIdsAndEpp_commonNameGroupIds, _searchByCommonNameGroupIdsAndEpp_dateOfBirth, _searchByCommonNameGroupIdsAndEpp_weight, _searchByCommonNameGroupIdsAndEpp_breastfeeding, _searchByCommonNameGroupIdsAndEpp_weeksOfAmenorrhoea, _searchByCommonNameGroupIdsAndEpp_creatinClearance, _searchByCommonNameGroupIdsAndEpp_gender);
        System.out.println("searchByCommonNameGroupIdsAndEpp.result=" + _searchByCommonNameGroupIdsAndEpp__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupIdAndCim10Ids...");
        java.lang.Integer _searchByCommonNameGroupIdAndCim10Ids_commonNameGroupId = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchByCommonNameGroupIdAndCim10Ids_cim10Ids = null;
        com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List _searchByCommonNameGroupIdAndCim10Ids__return = port.searchByCommonNameGroupIdAndCim10Ids(_searchByCommonNameGroupIdAndCim10Ids_commonNameGroupId, _searchByCommonNameGroupIdAndCim10Ids_cim10Ids);
        System.out.println("searchByCommonNameGroupIdAndCim10Ids.result=" + _searchByCommonNameGroupIdAndCim10Ids__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupIdAndEpp...");
        java.lang.Integer _searchByCommonNameGroupIdAndEpp_commonNameGroupId = null;
        javax.xml.datatype.XMLGregorianCalendar _searchByCommonNameGroupIdAndEpp_dateOfBirth = null;
        java.lang.Integer _searchByCommonNameGroupIdAndEpp_weight = null;
        com.vidal.merlin.wsclient.precaution.Breastfeeding _searchByCommonNameGroupIdAndEpp_breastfeeding = null;
        java.lang.Integer _searchByCommonNameGroupIdAndEpp_weeksOfAmenorrhoea = null;
        java.lang.Integer _searchByCommonNameGroupIdAndEpp_creatinClearance = null;
        com.vidal.merlin.wsclient.precaution.Gender _searchByCommonNameGroupIdAndEpp_gender = null;
        com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList _searchByCommonNameGroupIdAndEpp__return = port.searchByCommonNameGroupIdAndEpp(_searchByCommonNameGroupIdAndEpp_commonNameGroupId, _searchByCommonNameGroupIdAndEpp_dateOfBirth, _searchByCommonNameGroupIdAndEpp_weight, _searchByCommonNameGroupIdAndEpp_breastfeeding, _searchByCommonNameGroupIdAndEpp_weeksOfAmenorrhoea, _searchByCommonNameGroupIdAndEpp_creatinClearance, _searchByCommonNameGroupIdAndEpp_gender);
        System.out.println("searchByCommonNameGroupIdAndEpp.result=" + _searchByCommonNameGroupIdAndEpp__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupIdAndCim10IdsWithChildren...");
        java.lang.Integer _searchByCommonNameGroupIdAndCim10IdsWithChildren_commonNameGroupId = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchByCommonNameGroupIdAndCim10IdsWithChildren_cim10Ids = null;
        com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List _searchByCommonNameGroupIdAndCim10IdsWithChildren__return = port.searchByCommonNameGroupIdAndCim10IdsWithChildren(_searchByCommonNameGroupIdAndCim10IdsWithChildren_commonNameGroupId, _searchByCommonNameGroupIdAndCim10IdsWithChildren_cim10Ids);
        System.out.println("searchByCommonNameGroupIdAndCim10IdsWithChildren.result=" + _searchByCommonNameGroupIdAndCim10IdsWithChildren__return);


        }
        {
        System.out.println("Invoking searchPrecautionCim10CoupleAndChildrenByIds...");
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchPrecautionCim10CoupleAndChildrenByIds_productIds = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchPrecautionCim10CoupleAndChildrenByIds_cim10Ids = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple _searchPrecautionCim10CoupleAndChildrenByIds__return = port.searchPrecautionCim10CoupleAndChildrenByIds(_searchPrecautionCim10CoupleAndChildrenByIds_productIds, _searchPrecautionCim10CoupleAndChildrenByIds_cim10Ids);
        System.out.println("searchPrecautionCim10CoupleAndChildrenByIds.result=" + _searchPrecautionCim10CoupleAndChildrenByIds__return);


        }
        {
        System.out.println("Invoking searchByProductIdsAndEpp...");
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchByProductIdsAndEpp_productIds = null;
        javax.xml.datatype.XMLGregorianCalendar _searchByProductIdsAndEpp_dateOfBirth = null;
        java.lang.Integer _searchByProductIdsAndEpp_weight = null;
        com.vidal.merlin.wsclient.precaution.Breastfeeding _searchByProductIdsAndEpp_breastfeeding = null;
        java.lang.Integer _searchByProductIdsAndEpp_weeksOfAmenorrhoea = null;
        java.lang.Integer _searchByProductIdsAndEpp_creatinClearance = null;
        com.vidal.merlin.wsclient.precaution.Gender _searchByProductIdsAndEpp_gender = null;
        com.vidal.merlin.wsclient.precaution.ProductPrecautionEppList _searchByProductIdsAndEpp__return = port.searchByProductIdsAndEpp(_searchByProductIdsAndEpp_productIds, _searchByProductIdsAndEpp_dateOfBirth, _searchByProductIdsAndEpp_weight, _searchByProductIdsAndEpp_breastfeeding, _searchByProductIdsAndEpp_weeksOfAmenorrhoea, _searchByProductIdsAndEpp_creatinClearance, _searchByProductIdsAndEpp_gender);
        System.out.println("searchByProductIdsAndEpp.result=" + _searchByProductIdsAndEpp__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_id = null;
        com.vidal.merlin.wsclient.precaution.Precaution _searchById__return = port.searchById(_searchById_id);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchPrecautionEPPCoupleByIds...");
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchPrecautionEPPCoupleByIds_productIds = null;
        javax.xml.datatype.XMLGregorianCalendar _searchPrecautionEPPCoupleByIds_dateOfBirth = null;
        java.lang.Integer _searchPrecautionEPPCoupleByIds_weight = null;
        com.vidal.merlin.wsclient.precaution.Breastfeeding _searchPrecautionEPPCoupleByIds_breastfeeding = null;
        java.lang.Integer _searchPrecautionEPPCoupleByIds_weeksOfAmenorrhoea = null;
        java.lang.Integer _searchPrecautionEPPCoupleByIds_creatinClearance = null;
        com.vidal.merlin.wsclient.precaution.Gender _searchPrecautionEPPCoupleByIds_gender = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionEPPCouple _searchPrecautionEPPCoupleByIds__return = port.searchPrecautionEPPCoupleByIds(_searchPrecautionEPPCoupleByIds_productIds, _searchPrecautionEPPCoupleByIds_dateOfBirth, _searchPrecautionEPPCoupleByIds_weight, _searchPrecautionEPPCoupleByIds_breastfeeding, _searchPrecautionEPPCoupleByIds_weeksOfAmenorrhoea, _searchPrecautionEPPCoupleByIds_creatinClearance, _searchPrecautionEPPCoupleByIds_gender);
        System.out.println("searchPrecautionEPPCoupleByIds.result=" + _searchPrecautionEPPCoupleByIds__return);


        }
        {
        System.out.println("Invoking searchPrecautionCim10CoupleByIds...");
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchPrecautionCim10CoupleByIds_productIds = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfInt _searchPrecautionCim10CoupleByIds_cim10Ids = null;
        com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple _searchPrecautionCim10CoupleByIds__return = port.searchPrecautionCim10CoupleByIds(_searchPrecautionCim10CoupleByIds_productIds, _searchPrecautionCim10CoupleByIds_cim10Ids);
        System.out.println("searchPrecautionCim10CoupleByIds.result=" + _searchPrecautionCim10CoupleByIds__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupId...");
        java.lang.Integer _searchByCommonNameGroupId_commonNameGroupId = null;
        com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionList _searchByCommonNameGroupId__return = port.searchByCommonNameGroupId(_searchByCommonNameGroupId_commonNameGroupId);
        System.out.println("searchByCommonNameGroupId.result=" + _searchByCommonNameGroupId__return);


        }

        System.exit(0);
    }

}
