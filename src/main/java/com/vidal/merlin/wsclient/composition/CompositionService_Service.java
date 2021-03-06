
/*
 * 
 */

package com.vidal.merlin.wsclient.composition;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:24 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "CompositionService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/CompositionService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class CompositionService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "CompositionService");
    public final static QName CompositionServiceHttpPort = new QName("urn:Vidal", "CompositionServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/CompositionService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/CompositionService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CompositionService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CompositionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompositionService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns CompositionService
     */
    @WebEndpoint(name = "CompositionServiceHttpPort")
    public CompositionService getCompositionServiceHttpPort() {
        return super.getPort(CompositionServiceHttpPort, CompositionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompositionService
     */
    @WebEndpoint(name = "CompositionServiceHttpPort")
    public CompositionService getCompositionServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(CompositionServiceHttpPort, CompositionService.class, features);
    }

}
