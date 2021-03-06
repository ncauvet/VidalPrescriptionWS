
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.allergy;

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
 * Mon Oct 28 23:24:20 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "AllergyService",
                      portName = "AllergyServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/AllergyService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.allergy.AllergyService")
                      
public class AllergyServiceImpl implements AllergyService {

    private static final Logger LOG = Logger.getLogger(AllergyServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#getAlertsOnCommonNameGroupActivePrincipleAllergiesClass(com.vidal.merlin.wsclient.allergy.ArrayOfInt  commonNameGroupIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  allergyIds )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfCommonNameGroupAllergyCouple getAlertsOnCommonNameGroupActivePrincipleAllergiesClass(com.vidal.merlin.wsclient.allergy.ArrayOfInt commonNameGroupIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt allergyIds) { 
        LOG.info("Executing operation getAlertsOnCommonNameGroupActivePrincipleAllergiesClass");
        System.out.println(commonNameGroupIds);
        System.out.println(allergyIds);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfCommonNameGroupAllergyCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfAllergy searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfAllergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchByMoleculeId(java.lang.Integer  moleculeId )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfAllergy searchByMoleculeId(java.lang.Integer moleculeId) { 
        LOG.info("Executing operation searchByMoleculeId");
        System.out.println(moleculeId);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfAllergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfAllergy searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfAllergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchCommonNameGroupAllergyClassAlerts(com.vidal.merlin.wsclient.allergy.ArrayOfInt  commonNameGroupIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  allergyIds )*
     */
    public com.vidal.merlin.wsclient.allergy.CommonNameGroupAllergyCouples searchCommonNameGroupAllergyClassAlerts(com.vidal.merlin.wsclient.allergy.ArrayOfInt commonNameGroupIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt allergyIds) { 
        LOG.info("Executing operation searchCommonNameGroupAllergyClassAlerts");
        System.out.println(commonNameGroupIds);
        System.out.println(allergyIds);
        try {
            com.vidal.merlin.wsclient.allergy.CommonNameGroupAllergyCouples _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#getAlertsOnCommonNameGroupActivePrincipleAllergiesMolecules(com.vidal.merlin.wsclient.allergy.ArrayOfInt  commonNameGroupIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  moleculeIds )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfCommonNameGroupMoleculeCouple getAlertsOnCommonNameGroupActivePrincipleAllergiesMolecules(com.vidal.merlin.wsclient.allergy.ArrayOfInt commonNameGroupIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt moleculeIds) { 
        LOG.info("Executing operation getAlertsOnCommonNameGroupActivePrincipleAllergiesMolecules");
        System.out.println(commonNameGroupIds);
        System.out.println(moleculeIds);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfCommonNameGroupMoleculeCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#getAlertsOnAllergiesClass(com.vidal.merlin.wsclient.allergy.ArrayOfInt  productIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  allergyIds )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfProductAllergyCouple getAlertsOnAllergiesClass(com.vidal.merlin.wsclient.allergy.ArrayOfInt productIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt allergyIds) { 
        LOG.info("Executing operation getAlertsOnAllergiesClass");
        System.out.println(productIds);
        System.out.println(allergyIds);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfProductAllergyCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchById(java.lang.Integer  allergyId )*
     */
    public com.vidal.merlin.wsclient.allergy.Allergy searchById(java.lang.Integer allergyId) { 
        LOG.info("Executing operation searchById");
        System.out.println(allergyId);
        try {
            com.vidal.merlin.wsclient.allergy.Allergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#getAllAllergies(java.lang.Integer  pageNumber ,)java.lang.Integer  pageSize )*
     */
    public com.vidal.merlin.wsclient.allergy.PagedResultAllergy getAllAllergies(java.lang.Integer pageNumber,java.lang.Integer pageSize) { 
        LOG.info("Executing operation getAllAllergies");
        System.out.println(pageNumber);
        System.out.println(pageSize);
        try {
            com.vidal.merlin.wsclient.allergy.PagedResultAllergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchCommonNameGroupAllergyMoleculeAlerts(com.vidal.merlin.wsclient.allergy.ArrayOfInt  commonNameGroupIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  moleculeIds )*
     */
    public com.vidal.merlin.wsclient.allergy.CommonNameGroupMoleculeCouples searchCommonNameGroupAllergyMoleculeAlerts(com.vidal.merlin.wsclient.allergy.ArrayOfInt commonNameGroupIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt moleculeIds) { 
        LOG.info("Executing operation searchCommonNameGroupAllergyMoleculeAlerts");
        System.out.println(commonNameGroupIds);
        System.out.println(moleculeIds);
        try {
            com.vidal.merlin.wsclient.allergy.CommonNameGroupMoleculeCouples _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#getAlertsOnAllergiesMolecules(com.vidal.merlin.wsclient.allergy.ArrayOfInt  productIds ,)com.vidal.merlin.wsclient.allergy.ArrayOfInt  moleculeIds )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfProductMoleculeCouple getAlertsOnAllergiesMolecules(com.vidal.merlin.wsclient.allergy.ArrayOfInt productIds,com.vidal.merlin.wsclient.allergy.ArrayOfInt moleculeIds) { 
        LOG.info("Executing operation getAlertsOnAllergiesMolecules");
        System.out.println(productIds);
        System.out.println(moleculeIds);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfProductMoleculeCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.allergy.CommonNameGroupAllergyList searchByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.allergy.CommonNameGroupAllergyList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.allergy.AllergyService#searchLinkedAllergyByAllergyId(java.lang.Integer  allergyId )*
     */
    public com.vidal.merlin.wsclient.allergy.ArrayOfAllergy searchLinkedAllergyByAllergyId(java.lang.Integer allergyId) { 
        LOG.info("Executing operation searchLinkedAllergyByAllergyId");
        System.out.println(allergyId);
        try {
            com.vidal.merlin.wsclient.allergy.ArrayOfAllergy _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
