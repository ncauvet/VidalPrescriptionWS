
/*
 * 
 */

package com.vidal.merlin.wsclient.surveillance;

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


@WebServiceClient(name = "SurveillanceService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/SurveillanceService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class SurveillanceService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "SurveillanceService");
    public final static QName SurveillanceServiceHttpPort = new QName("urn:Vidal", "SurveillanceServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/SurveillanceService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/SurveillanceService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SurveillanceService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SurveillanceService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SurveillanceService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns SurveillanceService
     */
    @WebEndpoint(name = "SurveillanceServiceHttpPort")
    public SurveillanceService getSurveillanceServiceHttpPort() {
        return super.getPort(SurveillanceServiceHttpPort, SurveillanceService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SurveillanceService
     */
    @WebEndpoint(name = "SurveillanceServiceHttpPort")
    public SurveillanceService getSurveillanceServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(SurveillanceServiceHttpPort, SurveillanceService.class, features);
    }

}
