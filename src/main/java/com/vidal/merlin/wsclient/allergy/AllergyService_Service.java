
/*
 * 
 */

package com.vidal.merlin.wsclient.allergy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:20 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "AllergyService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/AllergyService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class AllergyService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "AllergyService");
    public final static QName AllergyServiceHttpPort = new QName("urn:Vidal", "AllergyServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/AllergyService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/AllergyService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AllergyService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AllergyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AllergyService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns AllergyService
     */
    @WebEndpoint(name = "AllergyServiceHttpPort")
    public AllergyService getAllergyServiceHttpPort() {
        return super.getPort(AllergyServiceHttpPort, AllergyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AllergyService
     */
    @WebEndpoint(name = "AllergyServiceHttpPort")
    public AllergyService getAllergyServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(AllergyServiceHttpPort, AllergyService.class, features);
    }

}
