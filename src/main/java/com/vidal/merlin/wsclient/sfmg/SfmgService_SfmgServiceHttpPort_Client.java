
package com.vidal.merlin.wsclient.sfmg;

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

public final class SfmgService_SfmgServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "SfmgService");

    private SfmgService_SfmgServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = SfmgService_Service.WSDL_LOCATION;
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
      
        SfmgService_Service ss = new SfmgService_Service(wsdlURL, SERVICE_NAME);
        SfmgService port = ss.getSfmgServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByCode...");
        java.lang.String _searchByCode_code = "";
        com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _searchByCode__return = port.searchByCode(_searchByCode_code);
        System.out.println("searchByCode.result=" + _searchByCode__return);


        }
        {
        System.out.println("Invoking getIndicationGroup...");
        java.lang.Integer _getIndicationGroup_sfmgId = null;
        com.vidal.merlin.wsclient.sfmg.ArrayOfIndicationGroup _getIndicationGroup__return = port.getIndicationGroup(_getIndicationGroup_sfmgId);
        System.out.println("getIndicationGroup.result=" + _getIndicationGroup__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchByIndicationGroupId...");
        java.lang.Integer _searchByIndicationGroupId_indicationGroupId = null;
        com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _searchByIndicationGroupId__return = port.searchByIndicationGroupId(_searchByIndicationGroupId_indicationGroupId);
        System.out.println("searchByIndicationGroupId.result=" + _searchByIndicationGroupId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_sfmgId = null;
        com.vidal.merlin.wsclient.sfmg.Sfmg _searchById__return = port.searchById(_searchById_sfmgId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking getContraIndication...");
        java.lang.Integer _getContraIndication_sfmgId = null;
        com.vidal.merlin.wsclient.sfmg.ArrayOfContraIndication _getContraIndication__return = port.getContraIndication(_getContraIndication_sfmgId);
        System.out.println("getContraIndication.result=" + _getContraIndication__return);


        }

        System.exit(0);
    }

}
