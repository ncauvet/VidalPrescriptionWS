
package com.vidal.merlin.wsclient.company;

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
 * Mon Oct 28 23:24:23 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class CompanyService_CompanyServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "CompanyService");

    private CompanyService_CompanyServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CompanyService_Service.WSDL_LOCATION;
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
      
        CompanyService_Service ss = new CompanyService_Service(wsdlURL, SERVICE_NAME);
        CompanyService port = ss.getCompanyServiceHttpPort();  
        
        {
        System.out.println("Invoking getAllCompanies...");
        java.lang.Integer _getAllCompanies_pageNumber = null;
        java.lang.Integer _getAllCompanies_pageSize = null;
        com.vidal.merlin.wsclient.company.PagedResultCompany _getAllCompanies__return = port.getAllCompanies(_getAllCompanies_pageNumber, _getAllCompanies_pageSize);
        System.out.println("getAllCompanies.result=" + _getAllCompanies__return);


        }
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.company.Company _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.company.ArrayOfCompany _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchByPackId...");
        java.lang.Integer _searchByPackId_packId = null;
        com.vidal.merlin.wsclient.company.ArrayOfCompanyCompanyTypeCouple _searchByPackId__return = port.searchByPackId(_searchByPackId_packId);
        System.out.println("searchByPackId.result=" + _searchByPackId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_companyId = null;
        com.vidal.merlin.wsclient.company.Company _searchById__return = port.searchById(_searchById_companyId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchByPackageId...");
        java.lang.Integer _searchByPackageId_packageId = null;
        com.vidal.merlin.wsclient.company.ArrayOfCompanyCompanyTypeCouple _searchByPackageId__return = port.searchByPackageId(_searchByPackageId_packageId);
        System.out.println("searchByPackageId.result=" + _searchByPackageId__return);


        }

        System.exit(0);
    }

}