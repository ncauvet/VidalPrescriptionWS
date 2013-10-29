
/*
 * 
 */

package com.vidal.merlin.wsclient.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:33 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "UtilitiesService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/UtilitiesService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class UtilitiesService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "UtilitiesService");
    public final static QName UtilitiesServiceHttpPort = new QName("urn:Vidal", "UtilitiesServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/UtilitiesService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/UtilitiesService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public UtilitiesService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UtilitiesService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilitiesService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns UtilitiesService
     */
    @WebEndpoint(name = "UtilitiesServiceHttpPort")
    public UtilitiesService getUtilitiesServiceHttpPort() {
        return super.getPort(UtilitiesServiceHttpPort, UtilitiesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilitiesService
     */
    @WebEndpoint(name = "UtilitiesServiceHttpPort")
    public UtilitiesService getUtilitiesServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(UtilitiesServiceHttpPort, UtilitiesService.class, features);
    }

}