
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.precaution;

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
 * Mon Oct 28 23:24:30 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "PrecautionService",
                      portName = "PrecautionServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/PrecautionService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.precaution.PrecautionService")
                      
public class PrecautionServiceImpl implements PrecautionService {

    private static final Logger LOG = Logger.getLogger(PrecautionServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution searchByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByCommonNameGroupIdsAndEpp(com.vidal.merlin.wsclient.precaution.ArrayOfInt  commonNameGroupIds ,)javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)java.lang.Integer  weight ,)com.vidal.merlin.wsclient.precaution.Breastfeeding  breastfeeding ,)java.lang.Integer  weeksOfAmenorrhoea ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.precaution.Gender  gender )*
     */
    public com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList searchByCommonNameGroupIdsAndEpp(com.vidal.merlin.wsclient.precaution.ArrayOfInt commonNameGroupIds,javax.xml.datatype.XMLGregorianCalendar dateOfBirth,java.lang.Integer weight,com.vidal.merlin.wsclient.precaution.Breastfeeding breastfeeding,java.lang.Integer weeksOfAmenorrhoea,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.precaution.Gender gender) { 
        LOG.info("Executing operation searchByCommonNameGroupIdsAndEpp");
        System.out.println(commonNameGroupIds);
        System.out.println(dateOfBirth);
        System.out.println(weight);
        System.out.println(breastfeeding);
        System.out.println(weeksOfAmenorrhoea);
        System.out.println(creatinClearance);
        System.out.println(gender);
        try {
            com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByName(java.lang.String  name )*
     */
    public com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution searchByName(java.lang.String name) { 
        LOG.info("Executing operation searchByName");
        System.out.println(name);
        try {
            com.vidal.merlin.wsclient.precaution.ArrayOfPrecaution _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByCommonNameGroupIdAndCim10Ids(java.lang.Integer  commonNameGroupId ,)com.vidal.merlin.wsclient.precaution.ArrayOfInt  cim10Ids )*
     */
    public com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List searchByCommonNameGroupIdAndCim10Ids(java.lang.Integer commonNameGroupId,com.vidal.merlin.wsclient.precaution.ArrayOfInt cim10Ids) { 
        LOG.info("Executing operation searchByCommonNameGroupIdAndCim10Ids");
        System.out.println(commonNameGroupId);
        System.out.println(cim10Ids);
        try {
            com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByCommonNameGroupIdAndEpp(java.lang.Integer  commonNameGroupId ,)javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)java.lang.Integer  weight ,)com.vidal.merlin.wsclient.precaution.Breastfeeding  breastfeeding ,)java.lang.Integer  weeksOfAmenorrhoea ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.precaution.Gender  gender )*
     */
    public com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList searchByCommonNameGroupIdAndEpp(java.lang.Integer commonNameGroupId,javax.xml.datatype.XMLGregorianCalendar dateOfBirth,java.lang.Integer weight,com.vidal.merlin.wsclient.precaution.Breastfeeding breastfeeding,java.lang.Integer weeksOfAmenorrhoea,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.precaution.Gender gender) { 
        LOG.info("Executing operation searchByCommonNameGroupIdAndEpp");
        System.out.println(commonNameGroupId);
        System.out.println(dateOfBirth);
        System.out.println(weight);
        System.out.println(breastfeeding);
        System.out.println(weeksOfAmenorrhoea);
        System.out.println(creatinClearance);
        System.out.println(gender);
        try {
            com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionEppList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByCommonNameGroupIdAndCim10IdsWithChildren(java.lang.Integer  commonNameGroupId ,)com.vidal.merlin.wsclient.precaution.ArrayOfInt  cim10Ids )*
     */
    public com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List searchByCommonNameGroupIdAndCim10IdsWithChildren(java.lang.Integer commonNameGroupId,com.vidal.merlin.wsclient.precaution.ArrayOfInt cim10Ids) { 
        LOG.info("Executing operation searchByCommonNameGroupIdAndCim10IdsWithChildren");
        System.out.println(commonNameGroupId);
        System.out.println(cim10Ids);
        try {
            com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionCim10List _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchPrecautionCim10CoupleAndChildrenByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt  productIds ,)com.vidal.merlin.wsclient.precaution.ArrayOfInt  cim10Ids )*
     */
    public com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple searchPrecautionCim10CoupleAndChildrenByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt productIds,com.vidal.merlin.wsclient.precaution.ArrayOfInt cim10Ids) { 
        LOG.info("Executing operation searchPrecautionCim10CoupleAndChildrenByIds");
        System.out.println(productIds);
        System.out.println(cim10Ids);
        try {
            com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByProductIdsAndEpp(com.vidal.merlin.wsclient.precaution.ArrayOfInt  productIds ,)javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)java.lang.Integer  weight ,)com.vidal.merlin.wsclient.precaution.Breastfeeding  breastfeeding ,)java.lang.Integer  weeksOfAmenorrhoea ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.precaution.Gender  gender )*
     */
    public com.vidal.merlin.wsclient.precaution.ProductPrecautionEppList searchByProductIdsAndEpp(com.vidal.merlin.wsclient.precaution.ArrayOfInt productIds,javax.xml.datatype.XMLGregorianCalendar dateOfBirth,java.lang.Integer weight,com.vidal.merlin.wsclient.precaution.Breastfeeding breastfeeding,java.lang.Integer weeksOfAmenorrhoea,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.precaution.Gender gender) { 
        LOG.info("Executing operation searchByProductIdsAndEpp");
        System.out.println(productIds);
        System.out.println(dateOfBirth);
        System.out.println(weight);
        System.out.println(breastfeeding);
        System.out.println(weeksOfAmenorrhoea);
        System.out.println(creatinClearance);
        System.out.println(gender);
        try {
            com.vidal.merlin.wsclient.precaution.ProductPrecautionEppList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchById(java.lang.Integer  id )*
     */
    public com.vidal.merlin.wsclient.precaution.Precaution searchById(java.lang.Integer id) { 
        LOG.info("Executing operation searchById");
        System.out.println(id);
        try {
            com.vidal.merlin.wsclient.precaution.Precaution _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchPrecautionEPPCoupleByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt  productIds ,)javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)java.lang.Integer  weight ,)com.vidal.merlin.wsclient.precaution.Breastfeeding  breastfeeding ,)java.lang.Integer  weeksOfAmenorrhoea ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.precaution.Gender  gender )*
     */
    public com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionEPPCouple searchPrecautionEPPCoupleByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt productIds,javax.xml.datatype.XMLGregorianCalendar dateOfBirth,java.lang.Integer weight,com.vidal.merlin.wsclient.precaution.Breastfeeding breastfeeding,java.lang.Integer weeksOfAmenorrhoea,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.precaution.Gender gender) { 
        LOG.info("Executing operation searchPrecautionEPPCoupleByIds");
        System.out.println(productIds);
        System.out.println(dateOfBirth);
        System.out.println(weight);
        System.out.println(breastfeeding);
        System.out.println(weeksOfAmenorrhoea);
        System.out.println(creatinClearance);
        System.out.println(gender);
        try {
            com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionEPPCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchPrecautionCim10CoupleByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt  productIds ,)com.vidal.merlin.wsclient.precaution.ArrayOfInt  cim10Ids )*
     */
    public com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple searchPrecautionCim10CoupleByIds(com.vidal.merlin.wsclient.precaution.ArrayOfInt productIds,com.vidal.merlin.wsclient.precaution.ArrayOfInt cim10Ids) { 
        LOG.info("Executing operation searchPrecautionCim10CoupleByIds");
        System.out.println(productIds);
        System.out.println(cim10Ids);
        try {
            com.vidal.merlin.wsclient.precaution.ArrayOfPrecautionCim10Couple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.precaution.PrecautionService#searchByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionList searchByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.precaution.CommonNameGroupPrecautionList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}