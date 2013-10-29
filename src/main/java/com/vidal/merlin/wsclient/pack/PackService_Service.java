
/*
 * 
 */

package com.vidal.merlin.wsclient.pack;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:29 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "PackService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/PackService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class PackService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "PackService");
    public final static QName PackServiceHttpPort = new QName("urn:Vidal", "PackServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/PackService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/PackService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PackService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PackService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PackService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns PackService
     */
    @WebEndpoint(name = "PackServiceHttpPort")
    public PackService getPackServiceHttpPort() {
        return super.getPort(PackServiceHttpPort, PackService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PackService
     */
    @WebEndpoint(name = "PackServiceHttpPort")
    public PackService getPackServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(PackServiceHttpPort, PackService.class, features);
    }

}