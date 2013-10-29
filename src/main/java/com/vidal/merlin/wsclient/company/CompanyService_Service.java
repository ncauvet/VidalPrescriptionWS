
/*
 * 
 */

package com.vidal.merlin.wsclient.company;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:23 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "CompanyService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/CompanyService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class CompanyService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "CompanyService");
    public final static QName CompanyServiceHttpPort = new QName("urn:Vidal", "CompanyServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/CompanyService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/CompanyService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CompanyService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CompanyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompanyService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns CompanyService
     */
    @WebEndpoint(name = "CompanyServiceHttpPort")
    public CompanyService getCompanyServiceHttpPort() {
        return super.getPort(CompanyServiceHttpPort, CompanyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompanyService
     */
    @WebEndpoint(name = "CompanyServiceHttpPort")
    public CompanyService getCompanyServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(CompanyServiceHttpPort, CompanyService.class, features);
    }

}