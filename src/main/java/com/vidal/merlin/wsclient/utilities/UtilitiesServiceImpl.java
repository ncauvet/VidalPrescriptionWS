
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.utilities;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Mon Oct 28 23:24:33 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "UtilitiesService",
                      portName = "UtilitiesServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/UtilitiesService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.utilities.UtilitiesService")
                      
public class UtilitiesServiceImpl implements UtilitiesService {

    private static final Logger LOG = Logger.getLogger(UtilitiesServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.utilities.UtilitiesService#getCompositeIdsFromHMKContraIndication(java.lang.String  hmkCiId )*
     */
    public com.vidal.merlin.wsclient.utilities.ArrayOfCompositeId getCompositeIdsFromHMKContraIndication(java.lang.String hmkCiId) { 
        LOG.info("Executing operation getCompositeIdsFromHMKContraIndication");
        System.out.println(hmkCiId);
        try {
            com.vidal.merlin.wsclient.utilities.ArrayOfCompositeId _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.utilities.UtilitiesService#getCompositeIdFromHMK(com.vidal.merlin.wsclient.utilities.ArrayOfString  hmkIds )*
     */
    public com.vidal.merlin.wsclient.utilities.String2CompositeIdMap getCompositeIdFromHMK(com.vidal.merlin.wsclient.utilities.ArrayOfString hmkIds) { 
        LOG.info("Executing operation getCompositeIdFromHMK");
        System.out.println(hmkIds);
        try {
            com.vidal.merlin.wsclient.utilities.String2CompositeIdMap _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
