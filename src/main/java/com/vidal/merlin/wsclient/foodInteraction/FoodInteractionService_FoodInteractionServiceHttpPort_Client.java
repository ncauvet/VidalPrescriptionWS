
package com.vidal.merlin.wsclient.foodInteraction;

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
 * Mon Oct 28 23:24:26 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class FoodInteractionService_FoodInteractionServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "FoodInteractionService");

    private FoodInteractionService_FoodInteractionServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = FoodInteractionService_Service.WSDL_LOCATION;
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
      
        FoodInteractionService_Service ss = new FoodInteractionService_Service(wsdlURL, SERVICE_NAME);
        FoodInteractionService port = ss.getFoodInteractionServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteraction _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_foodInteractionId = null;
        com.vidal.merlin.wsclient.foodInteraction.FoodInteraction _searchById__return = port.searchById(_searchById_foodInteractionId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchOneByName...");
        java.lang.String _searchOneByName_name = "";
        com.vidal.merlin.wsclient.foodInteraction.FoodInteraction _searchOneByName__return = port.searchOneByName(_searchOneByName_name);
        System.out.println("searchOneByName.result=" + _searchOneByName__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupId...");
        java.lang.Integer _searchByCommonNameGroupId_commonNameGroupId = null;
        com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple _searchByCommonNameGroupId__return = port.searchByCommonNameGroupId(_searchByCommonNameGroupId_commonNameGroupId);
        System.out.println("searchByCommonNameGroupId.result=" + _searchByCommonNameGroupId__return);


        }

        System.exit(0);
    }

}
