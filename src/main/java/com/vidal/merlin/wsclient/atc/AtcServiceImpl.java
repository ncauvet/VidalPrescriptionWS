
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.atc;

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
 * Mon Oct 28 23:24:22 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "AtcService",
                      portName = "AtcServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/AtcService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.atc.AtcService")
                      
public class AtcServiceImpl implements AtcService {

    private static final Logger LOG = Logger.getLogger(AtcServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#searchByCode(java.lang.String  code )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByCode(java.lang.String code) { 
        LOG.info("Executing operation searchByCode");
        System.out.println(code);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#getChildren(java.lang.Integer  atcId )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc getChildren(java.lang.Integer atcId) { 
        LOG.info("Executing operation getChildren");
        System.out.println(atcId);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#getRootNode(*
     */
    public com.vidal.merlin.wsclient.atc.Atc getRootNode() { 
        LOG.info("Executing operation getRootNode");
        try {
            com.vidal.merlin.wsclient.atc.Atc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#searchById(java.lang.Integer  atcId )*
     */
    public com.vidal.merlin.wsclient.atc.Atc searchById(java.lang.Integer atcId) { 
        LOG.info("Executing operation searchById");
        System.out.println(atcId);
        try {
            com.vidal.merlin.wsclient.atc.Atc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#getAllAtcs(java.lang.Integer  pageNumber ,)java.lang.Integer  pageSize )*
     */
    public com.vidal.merlin.wsclient.atc.PagedResultAtc getAllAtcs(java.lang.Integer pageNumber,java.lang.Integer pageSize) { 
        LOG.info("Executing operation getAllAtcs");
        System.out.println(pageNumber);
        System.out.println(pageSize);
        try {
            com.vidal.merlin.wsclient.atc.PagedResultAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#getParent(java.lang.Integer  atcId )*
     */
    public com.vidal.merlin.wsclient.atc.Atc getParent(java.lang.Integer atcId) { 
        LOG.info("Executing operation getParent");
        System.out.println(atcId);
        try {
            com.vidal.merlin.wsclient.atc.Atc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#searchByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc searchByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.atc.AtcService#findByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.atc.ArrayOfAtc findByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation findByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.atc.ArrayOfAtc _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
