
/*
 * 
 */

package com.vidal.merlin.wsclient.sfmg;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:32 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "SfmgService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/SfmgService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class SfmgService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "SfmgService");
    public final static QName SfmgServiceHttpPort = new QName("urn:Vidal", "SfmgServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/SfmgService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/SfmgService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SfmgService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SfmgService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SfmgService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns SfmgService
     */
    @WebEndpoint(name = "SfmgServiceHttpPort")
    public SfmgService getSfmgServiceHttpPort() {
        return super.getPort(SfmgServiceHttpPort, SfmgService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SfmgService
     */
    @WebEndpoint(name = "SfmgServiceHttpPort")
    public SfmgService getSfmgServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(SfmgServiceHttpPort, SfmgService.class, features);
    }

}