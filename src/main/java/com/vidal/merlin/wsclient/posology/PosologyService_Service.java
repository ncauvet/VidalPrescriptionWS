
/*
 * 
 */

package com.vidal.merlin.wsclient.posology;

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


@WebServiceClient(name = "PosologyService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/PosologyService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class PosologyService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "PosologyService");
    public final static QName PosologyServiceHttpPort = new QName("urn:Vidal", "PosologyServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/PosologyService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/PosologyService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PosologyService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PosologyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PosologyService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns PosologyService
     */
    @WebEndpoint(name = "PosologyServiceHttpPort")
    public PosologyService getPosologyServiceHttpPort() {
        return super.getPort(PosologyServiceHttpPort, PosologyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PosologyService
     */
    @WebEndpoint(name = "PosologyServiceHttpPort")
    public PosologyService getPosologyServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(PosologyServiceHttpPort, PosologyService.class, features);
    }

}
