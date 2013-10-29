
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.foodInteraction;

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
                      serviceName = "FoodInteractionService",
                      portName = "FoodInteractionServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/FoodInteractionService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService")
                      
public class FoodInteractionServiceImpl implements FoodInteractionService {

    private static final Logger LOG = Logger.getLogger(FoodInteractionServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteraction searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteraction _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService#searchById(java.lang.Integer  foodInteractionId )*
     */
    public com.vidal.merlin.wsclient.foodInteraction.FoodInteraction searchById(java.lang.Integer foodInteractionId) { 
        LOG.info("Executing operation searchById");
        System.out.println(foodInteractionId);
        try {
            com.vidal.merlin.wsclient.foodInteraction.FoodInteraction _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService#searchOneByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.foodInteraction.FoodInteraction searchOneByName(java.lang.String name) { 
        LOG.info("Executing operation searchOneByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.foodInteraction.FoodInteraction _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.foodInteraction.FoodInteractionService#searchByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple searchByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.foodInteraction.ArrayOfFoodInteractionCommentCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
