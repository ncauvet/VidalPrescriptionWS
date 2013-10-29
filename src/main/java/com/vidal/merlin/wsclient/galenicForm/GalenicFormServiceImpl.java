
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.galenicForm;

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
 * Mon Oct 28 23:24:27 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "GalenicFormService",
                      portName = "GalenicFormServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/GalenicFormService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.galenicForm.GalenicFormService")
                      
public class GalenicFormServiceImpl implements GalenicFormService {

    private static final Logger LOG = Logger.getLogger(GalenicFormServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.galenicForm.GalenicFormService#getAllGalenicForms(java.lang.Integer  pageNumber ,)java.lang.Integer  pageSize )*
     */
    public com.vidal.merlin.wsclient.galenicForm.PagedResultGalenicForm getAllGalenicForms(java.lang.Integer pageNumber,java.lang.Integer pageSize) { 
        LOG.info("Executing operation getAllGalenicForms");
        System.out.println(pageNumber);
        System.out.println(pageSize);
        try {
            com.vidal.merlin.wsclient.galenicForm.PagedResultGalenicForm _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.galenicForm.GalenicFormService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.galenicForm.GalenicFormService#searchByIds(com.vidal.merlin.wsclient.galenicForm.ArrayOfInt  galenicFormIds )*
     */
    public com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm searchByIds(com.vidal.merlin.wsclient.galenicForm.ArrayOfInt galenicFormIds) { 
        LOG.info("Executing operation searchByIds");
        System.out.println(galenicFormIds);
        try {
            com.vidal.merlin.wsclient.galenicForm.ArrayOfGalenicForm _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}