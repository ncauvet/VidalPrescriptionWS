
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.warning;

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
                      serviceName = "WarningService",
                      portName = "WarningServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/WarningService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.warning.WarningService")
                      
public class WarningServiceImpl implements WarningService {

    private static final Logger LOG = Logger.getLogger(WarningServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.warning.WarningService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.warning.ArrayOfWarningCommentCouple searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.warning.ArrayOfWarningCommentCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.warning.WarningService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.warning.ArrayOfWarning searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.warning.ArrayOfWarning _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.warning.WarningService#searchById(java.lang.Integer  warningId )*
     */
    public com.vidal.merlin.wsclient.warning.Warning searchById(java.lang.Integer warningId) { 
        LOG.info("Executing operation searchById");
        System.out.println(warningId);
        try {
            com.vidal.merlin.wsclient.warning.Warning _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.warning.WarningService#searchByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.warning.CommonNameGroupWarningList searchByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.warning.CommonNameGroupWarningList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}