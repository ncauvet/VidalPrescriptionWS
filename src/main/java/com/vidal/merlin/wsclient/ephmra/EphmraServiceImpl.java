
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.ephmra;

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
 * Mon Oct 28 23:24:26 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "EphmraService",
                      portName = "EphmraServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/EphmraService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.ephmra.EphmraService")
                      
public class EphmraServiceImpl implements EphmraService {

    private static final Logger LOG = Logger.getLogger(EphmraServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#searchByCode(java.lang.String  code )*
     */
    public com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra searchByCode(java.lang.String code) { 
        LOG.info("Executing operation searchByCode");
        System.out.println(code);
        try {
            com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#searchByPackId(java.lang.Integer  packId )*
     */
    public com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra searchByPackId(java.lang.Integer packId) { 
        LOG.info("Executing operation searchByPackId");
        System.out.println(packId);
        try {
            com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#getChildren(java.lang.Integer  ephmraId )*
     */
    public com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra getChildren(java.lang.Integer ephmraId) { 
        LOG.info("Executing operation getChildren");
        System.out.println(ephmraId);
        try {
            com.vidal.merlin.wsclient.ephmra.ArrayOfEphmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#getRootNode(*
     */
    public com.vidal.merlin.wsclient.ephmra.Ephmra getRootNode() { 
        LOG.info("Executing operation getRootNode");
        try {
            com.vidal.merlin.wsclient.ephmra.Ephmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#searchById(java.lang.Integer  ephmraId )*
     */
    public com.vidal.merlin.wsclient.ephmra.Ephmra searchById(java.lang.Integer ephmraId) { 
        LOG.info("Executing operation searchById");
        System.out.println(ephmraId);
        try {
            com.vidal.merlin.wsclient.ephmra.Ephmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.ephmra.EphmraService#getParent(java.lang.Integer  ephmraId )*
     */
    public com.vidal.merlin.wsclient.ephmra.Ephmra getParent(java.lang.Integer ephmraId) { 
        LOG.info("Executing operation getParent");
        System.out.println(ephmraId);
        try {
            com.vidal.merlin.wsclient.ephmra.Ephmra _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
