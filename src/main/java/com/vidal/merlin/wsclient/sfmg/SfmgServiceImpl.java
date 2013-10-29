
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.sfmg;

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
 * Mon Oct 28 23:24:32 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "SfmgService",
                      portName = "SfmgServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/SfmgService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.sfmg.SfmgService")
                      
public class SfmgServiceImpl implements SfmgService {

    private static final Logger LOG = Logger.getLogger(SfmgServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#searchByCode(java.lang.String  code )*
     */
    public com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg searchByCode(java.lang.String code) { 
        LOG.info("Executing operation searchByCode");
        System.out.println(code);
        try {
            com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#getIndicationGroup(java.lang.Integer  sfmgId )*
     */
    public com.vidal.merlin.wsclient.sfmg.ArrayOfIndicationGroup getIndicationGroup(java.lang.Integer sfmgId) { 
        LOG.info("Executing operation getIndicationGroup");
        System.out.println(sfmgId);
        try {
            com.vidal.merlin.wsclient.sfmg.ArrayOfIndicationGroup _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#searchByIndicationGroupId(java.lang.Integer  indicationGroupId )*
     */
    public com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg searchByIndicationGroupId(java.lang.Integer indicationGroupId) { 
        LOG.info("Executing operation searchByIndicationGroupId");
        System.out.println(indicationGroupId);
        try {
            com.vidal.merlin.wsclient.sfmg.ArrayOfSfmg _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#searchById(java.lang.Integer  sfmgId )*
     */
    public com.vidal.merlin.wsclient.sfmg.Sfmg searchById(java.lang.Integer sfmgId) { 
        LOG.info("Executing operation searchById");
        System.out.println(sfmgId);
        try {
            com.vidal.merlin.wsclient.sfmg.Sfmg _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.sfmg.SfmgService#getContraIndication(java.lang.Integer  sfmgId )*
     */
    public com.vidal.merlin.wsclient.sfmg.ArrayOfContraIndication getContraIndication(java.lang.Integer sfmgId) { 
        LOG.info("Executing operation getContraIndication");
        System.out.println(sfmgId);
        try {
            com.vidal.merlin.wsclient.sfmg.ArrayOfContraIndication _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}