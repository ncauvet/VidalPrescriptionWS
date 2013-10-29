
package com.vidal.merlin.wsclient.semp;

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

public final class SempService_SempServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "SempService");

    private SempService_SempServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SempService_Service.WSDL_LOCATION;
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
      
        SempService_Service ss = new SempService_Service(wsdlURL, SERVICE_NAME);
        SempService port = ss.getSempServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.semp.ArrayOfSemp _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.semp.ArrayOfSemp _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking getChildren...");
        java.lang.Integer _getChildren_sempId = null;
        com.vidal.merlin.wsclient.semp.ArrayOfSemp _getChildren__return = port.getChildren(_getChildren_sempId);
        System.out.println("getChildren.result=" + _getChildren__return);


        }
        {
        System.out.println("Invoking getRootNode...");
        com.vidal.merlin.wsclient.semp.Semp _getRootNode__return = port.getRootNode();
        System.out.println("getRootNode.result=" + _getRootNode__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_sempId = null;
        com.vidal.merlin.wsclient.semp.Semp _searchById__return = port.searchById(_searchById_sempId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking getParent...");
        java.lang.Integer _getParent_sempId = null;
        com.vidal.merlin.wsclient.semp.Semp _getParent__return = port.getParent(_getParent_sempId);
        System.out.println("getParent.result=" + _getParent__return);


        }

        System.exit(0);
    }

}
