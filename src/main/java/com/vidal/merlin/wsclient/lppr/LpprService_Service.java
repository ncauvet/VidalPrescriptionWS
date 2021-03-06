
/*
 * 
 */

package com.vidal.merlin.wsclient.lppr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:28 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "LpprService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/LpprService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class LpprService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "LpprService");
    public final static QName LpprServiceHttpPort = new QName("urn:Vidal", "LpprServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/LpprService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/LpprService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public LpprService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LpprService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LpprService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns LpprService
     */
    @WebEndpoint(name = "LpprServiceHttpPort")
    public LpprService getLpprServiceHttpPort() {
        return super.getPort(LpprServiceHttpPort, LpprService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LpprService
     */
    @WebEndpoint(name = "LpprServiceHttpPort")
    public LpprService getLpprServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(LpprServiceHttpPort, LpprService.class, features);
    }

}
