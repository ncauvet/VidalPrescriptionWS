
/*
 * 
 */

package com.vidal.merlin.wsclient.asmr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:21 CET 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "AsmrService", 
                  wsdlLocation = "http://localhost:8011/merlin-service/services/AsmrService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class AsmrService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn:Vidal", "AsmrService");
    public final static QName AsmrServiceHttpPort = new QName("urn:Vidal", "AsmrServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8011/merlin-service/services/AsmrService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8011/merlin-service/services/AsmrService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AsmrService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AsmrService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AsmrService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns AsmrService
     */
    @WebEndpoint(name = "AsmrServiceHttpPort")
    public AsmrService getAsmrServiceHttpPort() {
        return super.getPort(AsmrServiceHttpPort, AsmrService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsmrService
     */
    @WebEndpoint(name = "AsmrServiceHttpPort")
    public AsmrService getAsmrServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(AsmrServiceHttpPort, AsmrService.class, features);
    }

}
