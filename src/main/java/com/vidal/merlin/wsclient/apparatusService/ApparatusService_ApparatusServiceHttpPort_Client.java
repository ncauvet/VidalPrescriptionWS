
package com.vidal.merlin.wsclient.apparatusService;

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
 * Mon Oct 28 23:24:21 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class ApparatusService_ApparatusServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "ApparatusService");

    private ApparatusService_ApparatusServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ApparatusService_Service.WSDL_LOCATION;
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
      
        ApparatusService_Service ss = new ApparatusService_Service(wsdlURL, SERVICE_NAME);
        ApparatusService port = ss.getApparatusServiceHttpPort();  
        
        {
        System.out.println("Invoking searchBySideEffectName...");
        java.lang.String _searchBySideEffectName_name = "";
        com.vidal.merlin.wsclient.apparatusService.ArrayOfApparatus _searchBySideEffectName__return = port.searchBySideEffectName(_searchBySideEffectName_name);
        System.out.println("searchBySideEffectName.result=" + _searchBySideEffectName__return);


        }
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.apparatusService.ArrayOfApparatus _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_apparatusId = null;
        com.vidal.merlin.wsclient.apparatusService.Apparatus _searchById__return = port.searchById(_searchById_apparatusId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchBySideEffectId...");
        java.lang.Integer _searchBySideEffectId_sideEffectId = null;
        com.vidal.merlin.wsclient.apparatusService.Apparatus _searchBySideEffectId__return = port.searchBySideEffectId(_searchBySideEffectId_sideEffectId);
        System.out.println("searchBySideEffectId.result=" + _searchBySideEffectId__return);


        }

        System.exit(0);
    }

}
