
package com.vidal.merlin.wsclient.sideEffect;

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
 * Mon Oct 28 23:24:32 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class SideEffectService_SideEffectServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "SideEffectService");

    private SideEffectService_SideEffectServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SideEffectService_Service.WSDL_LOCATION;
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
      
        SideEffectService_Service ss = new SideEffectService_Service(wsdlURL, SERVICE_NAME);
        SideEffectService port = ss.getSideEffectServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.sideEffect.ArrayOfProductSideEffect _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.sideEffect.ArrayOfSideEffect _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchApparatusBySideEffectId...");
        java.lang.Integer _searchApparatusBySideEffectId_sideEffectId = null;
        com.vidal.merlin.wsclient.sideEffect.Apparatus _searchApparatusBySideEffectId__return = port.searchApparatusBySideEffectId(_searchApparatusBySideEffectId_sideEffectId);
        System.out.println("searchApparatusBySideEffectId.result=" + _searchApparatusBySideEffectId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_sideEffectId = null;
        com.vidal.merlin.wsclient.sideEffect.SideEffect _searchById__return = port.searchById(_searchById_sideEffectId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchByCommonNameGroupIds...");
        com.vidal.merlin.wsclient.sideEffect.ArrayOfInt _searchByCommonNameGroupIds_commonNameGroupIds = null;
        com.vidal.merlin.wsclient.sideEffect.ArrayOfCommonNameGroupSideEffect _searchByCommonNameGroupIds__return = port.searchByCommonNameGroupIds(_searchByCommonNameGroupIds_commonNameGroupIds);
        System.out.println("searchByCommonNameGroupIds.result=" + _searchByCommonNameGroupIds__return);


        }
        {
        System.out.println("Invoking searchApparatusBySideEffectName...");
        java.lang.String _searchApparatusBySideEffectName_name = "";
        com.vidal.merlin.wsclient.sideEffect.ArrayOfApparatus _searchApparatusBySideEffectName__return = port.searchApparatusBySideEffectName(_searchApparatusBySideEffectName_name);
        System.out.println("searchApparatusBySideEffectName.result=" + _searchApparatusBySideEffectName__return);


        }
        {
        System.out.println("Invoking searchApparatusByProductId...");
        java.lang.Integer _searchApparatusByProductId_productId = null;
        com.vidal.merlin.wsclient.sideEffect.ArrayOfApparatus _searchApparatusByProductId__return = port.searchApparatusByProductId(_searchApparatusByProductId_productId);
        System.out.println("searchApparatusByProductId.result=" + _searchApparatusByProductId__return);


        }

        System.exit(0);
    }

}