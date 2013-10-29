
package com.vidal.merlin.wsclient.interaction;

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
 * Mon Oct 28 23:24:27 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class InteractionService_InteractionServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "InteractionService");

    private InteractionService_InteractionServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = InteractionService_Service.WSDL_LOCATION;
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
      
        InteractionService_Service ss = new InteractionService_Service(wsdlURL, SERVICE_NAME);
        InteractionService port = ss.getInteractionServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByInteractionId...");
        java.lang.Integer _searchByInteractionId_interactionId = null;
        com.vidal.merlin.wsclient.interaction.Interaction _searchByInteractionId__return = port.searchByInteractionId(_searchByInteractionId_interactionId);
        System.out.println("searchByInteractionId.result=" + _searchByInteractionId__return);


        }
        {
        System.out.println("Invoking searchInteractionCouplesForProductIds...");
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _searchInteractionCouplesForProductIds_productIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _searchInteractionCouplesForProductIds_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionResult _searchInteractionCouplesForProductIds__return = port.searchInteractionCouplesForProductIds(_searchInteractionCouplesForProductIds_productIds, _searchInteractionCouplesForProductIds_severity);
        System.out.println("searchInteractionCouplesForProductIds.result=" + _searchInteractionCouplesForProductIds__return);


        }
        {
        System.out.println("Invoking getInteractionCouplesForCommonNameGroupIds...");
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _getInteractionCouplesForCommonNameGroupIds_commonNameGroupIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _getInteractionCouplesForCommonNameGroupIds_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionCommonNameGroupResult _getInteractionCouplesForCommonNameGroupIds__return = port.getInteractionCouplesForCommonNameGroupIds(_getInteractionCouplesForCommonNameGroupIds_commonNameGroupIds, _getInteractionCouplesForCommonNameGroupIds_severity);
        System.out.println("getInteractionCouplesForCommonNameGroupIds.result=" + _getInteractionCouplesForCommonNameGroupIds__return);


        }
        {
        System.out.println("Invoking searchInteractionCouplesForCommonNameGroupId...");
        java.lang.Integer _searchInteractionCouplesForCommonNameGroupId_commonNameGroupId = null;
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _searchInteractionCouplesForCommonNameGroupId_commonNameGroupIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _searchInteractionCouplesForCommonNameGroupId_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionCommonNameGroupResult _searchInteractionCouplesForCommonNameGroupId__return = port.searchInteractionCouplesForCommonNameGroupId(_searchInteractionCouplesForCommonNameGroupId_commonNameGroupId, _searchInteractionCouplesForCommonNameGroupId_commonNameGroupIds, _searchInteractionCouplesForCommonNameGroupId_severity);
        System.out.println("searchInteractionCouplesForCommonNameGroupId.result=" + _searchInteractionCouplesForCommonNameGroupId__return);


        }
        {
        System.out.println("Invoking searchInteractionCouplesForProductId...");
        java.lang.Integer _searchInteractionCouplesForProductId_productId = null;
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _searchInteractionCouplesForProductId_productIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _searchInteractionCouplesForProductId_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionResult _searchInteractionCouplesForProductId__return = port.searchInteractionCouplesForProductId(_searchInteractionCouplesForProductId_productId, _searchInteractionCouplesForProductId_productIds, _searchInteractionCouplesForProductId_severity);
        System.out.println("searchInteractionCouplesForProductId.result=" + _searchInteractionCouplesForProductId__return);


        }
        {
        System.out.println("Invoking searchInteractionCouplesForCommonNameGroupIds...");
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _searchInteractionCouplesForCommonNameGroupIds_commonNameGroupIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _searchInteractionCouplesForCommonNameGroupIds_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionCommonNameGroupResult _searchInteractionCouplesForCommonNameGroupIds__return = port.searchInteractionCouplesForCommonNameGroupIds(_searchInteractionCouplesForCommonNameGroupIds_commonNameGroupIds, _searchInteractionCouplesForCommonNameGroupIds_severity);
        System.out.println("searchInteractionCouplesForCommonNameGroupIds.result=" + _searchInteractionCouplesForCommonNameGroupIds__return);


        }
        {
        System.out.println("Invoking getInteractionCouplesForOneProductId...");
        java.lang.Integer _getInteractionCouplesForOneProductId_productId = null;
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _getInteractionCouplesForOneProductId_productIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _getInteractionCouplesForOneProductId_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionResult _getInteractionCouplesForOneProductId__return = port.getInteractionCouplesForOneProductId(_getInteractionCouplesForOneProductId_productId, _getInteractionCouplesForOneProductId_productIds, _getInteractionCouplesForOneProductId_severity);
        System.out.println("getInteractionCouplesForOneProductId.result=" + _getInteractionCouplesForOneProductId__return);


        }
        {
        System.out.println("Invoking getInteractionCouplesForProductIds...");
        com.vidal.merlin.wsclient.interaction.ArrayOfInt _getInteractionCouplesForProductIds_productIds = null;
        com.vidal.merlin.wsclient.interaction.InteractionSeverityType _getInteractionCouplesForProductIds_severity = null;
        com.vidal.merlin.wsclient.interaction.InteractionResult _getInteractionCouplesForProductIds__return = port.getInteractionCouplesForProductIds(_getInteractionCouplesForProductIds_productIds, _getInteractionCouplesForProductIds_severity);
        System.out.println("getInteractionCouplesForProductIds.result=" + _getInteractionCouplesForProductIds__return);


        }

        System.exit(0);
    }

}