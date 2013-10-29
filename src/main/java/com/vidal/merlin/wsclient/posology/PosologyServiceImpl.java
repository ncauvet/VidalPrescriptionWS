
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.posology;

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
 * Mon Oct 28 23:24:29 CET 2013
 * Generated source version: 2.2.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "PosologyService",
                      portName = "PosologyServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/PosologyService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.posology.PosologyService")
                      
public class PosologyServiceImpl implements PosologyService {

    private static final Logger LOG = Logger.getLogger(PosologyServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchPosologyUnitByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfPosologyUnit searchPosologyUnitByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchPosologyUnitByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfPosologyUnit _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#getAllUnits(java.lang.Integer  pageNumber ,)java.lang.Integer  pageSize )*
     */
    public com.vidal.merlin.wsclient.posology.PagedResultUnit getAllUnits(java.lang.Integer pageNumber,java.lang.Integer pageSize) { 
        LOG.info("Executing operation getAllUnits");
        System.out.println(pageNumber);
        System.out.println(pageSize);
        try {
            com.vidal.merlin.wsclient.posology.PagedResultUnit _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkDailyActivePrincipleDoseByProductId(java.lang.Integer  productId ,)java.lang.Double  dose ,)com.vidal.merlin.wsclient.posology.DoseUnit  doseUnit ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.PosologyAlerts checkDailyActivePrincipleDoseByProductId(java.lang.Integer productId,java.lang.Double dose,com.vidal.merlin.wsclient.posology.DoseUnit doseUnit,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkDailyActivePrincipleDoseByProductId");
        System.out.println(productId);
        System.out.println(dose);
        System.out.println(doseUnit);
        System.out.println(frequencyType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.PosologyAlerts _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchPosologyUnitByUcdId(java.lang.Integer  ucdId )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfPosologyUnit searchPosologyUnitByUcdId(java.lang.Integer ucdId) { 
        LOG.info("Executing operation searchPosologyUnitByUcdId");
        System.out.println(ucdId);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfPosologyUnit _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkActivePrincipleDoseForProductIdIndicationIdsRouteIds(java.lang.Integer  productId ,)java.lang.Double  dose ,)com.vidal.merlin.wsclient.posology.DoseUnit  doseUnit ,)java.lang.Boolean  administrationDividedPerTimeUnit ,)java.lang.Double  frequency ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)java.lang.Integer  frequencyTypeDetail ,)java.lang.Integer  durationValue ,)com.vidal.merlin.wsclient.posology.DurationType  durationType ,)java.lang.Integer  secondDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  secondDurationType ,)java.lang.Integer  thirdDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  thirdDurationType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfPosologyAlert checkActivePrincipleDoseForProductIdIndicationIdsRouteIds(java.lang.Integer productId,java.lang.Double dose,com.vidal.merlin.wsclient.posology.DoseUnit doseUnit,java.lang.Boolean administrationDividedPerTimeUnit,java.lang.Double frequency,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,java.lang.Integer frequencyTypeDetail,java.lang.Integer durationValue,com.vidal.merlin.wsclient.posology.DurationType durationType,java.lang.Integer secondDurationValue,com.vidal.merlin.wsclient.posology.DurationType secondDurationType,java.lang.Integer thirdDurationValue,com.vidal.merlin.wsclient.posology.DurationType thirdDurationType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkActivePrincipleDoseForProductIdIndicationIdsRouteIds");
        System.out.println(productId);
        System.out.println(dose);
        System.out.println(doseUnit);
        System.out.println(administrationDividedPerTimeUnit);
        System.out.println(frequency);
        System.out.println(frequencyType);
        System.out.println(frequencyTypeDetail);
        System.out.println(durationValue);
        System.out.println(durationType);
        System.out.println(secondDurationValue);
        System.out.println(secondDurationType);
        System.out.println(thirdDurationValue);
        System.out.println(thirdDurationType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfPosologyAlert _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchDoseUnitByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfDoseUnit searchDoseUnitByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchDoseUnitByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfDoseUnit _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#getAmmPosologyByProductId(java.lang.Integer  productId )*
     */
    public java.lang.String getAmmPosologyByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation getAmmPosologyByProductId");
        System.out.println(productId);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkDailyDoseByProductId(java.lang.Integer  productId ,)java.lang.Double  dose ,)java.lang.Integer  unitId ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.PosologyAlerts checkDailyDoseByProductId(java.lang.Integer productId,java.lang.Double dose,java.lang.Integer unitId,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkDailyDoseByProductId");
        System.out.println(productId);
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(frequencyType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.PosologyAlerts _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchPosologyRouteByProductId(java.lang.Integer  productId ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)java.lang.Float  age ,)java.lang.Float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfRoute searchPosologyRouteByProductId(java.lang.Integer productId,com.vidal.merlin.wsclient.posology.Gender gender,java.lang.Float age,java.lang.Float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds) { 
        LOG.info("Executing operation searchPosologyRouteByProductId");
        System.out.println(productId);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfRoute _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkNumberOfDoseForCommonNameGroupIdIndicationIdsRouteIds(java.lang.Integer  commonNameGroupId ,)java.lang.Double  dose ,)java.lang.Integer  unitId ,)java.lang.Boolean  administrationDividedPerTimeUnit ,)java.lang.Double  frequency ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)java.lang.Integer  frequencyTypeDetail ,)java.lang.Integer  durationValue ,)com.vidal.merlin.wsclient.posology.DurationType  durationType ,)java.lang.Integer  secondDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  secondDurationType ,)java.lang.Integer  thirdDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  thirdDurationType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyAlertList checkNumberOfDoseForCommonNameGroupIdIndicationIdsRouteIds(java.lang.Integer commonNameGroupId,java.lang.Double dose,java.lang.Integer unitId,java.lang.Boolean administrationDividedPerTimeUnit,java.lang.Double frequency,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,java.lang.Integer frequencyTypeDetail,java.lang.Integer durationValue,com.vidal.merlin.wsclient.posology.DurationType durationType,java.lang.Integer secondDurationValue,com.vidal.merlin.wsclient.posology.DurationType secondDurationType,java.lang.Integer thirdDurationValue,com.vidal.merlin.wsclient.posology.DurationType thirdDurationType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkNumberOfDoseForCommonNameGroupIdIndicationIdsRouteIds");
        System.out.println(commonNameGroupId);
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(administrationDividedPerTimeUnit);
        System.out.println(frequency);
        System.out.println(frequencyType);
        System.out.println(frequencyTypeDetail);
        System.out.println(durationValue);
        System.out.println(durationType);
        System.out.println(secondDurationValue);
        System.out.println(secondDurationType);
        System.out.println(thirdDurationValue);
        System.out.println(thirdDurationType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyAlertList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchActivePrincipleDosesByProductId(java.lang.Integer  productId ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfActivePrincipleDoses searchActivePrincipleDosesByProductId(java.lang.Integer productId,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation searchActivePrincipleDosesByProductId");
        System.out.println(productId);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfActivePrincipleDoses _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchPosologyUnitByCommonNameGroupId(java.lang.Integer  commonNameGroupId )*
     */
    public com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyUnitList searchPosologyUnitByCommonNameGroupId(java.lang.Integer commonNameGroupId) { 
        LOG.info("Executing operation searchPosologyUnitByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        try {
            com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyUnitList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkActivePrincipleDoseForCommonNameGroupIdIndicationIdsRouteIds(java.lang.Integer  commonNameGroupId ,)java.lang.Double  dose ,)com.vidal.merlin.wsclient.posology.DoseUnit  doseUnit ,)java.lang.Boolean  administrationDividedPerTimeUnit ,)java.lang.Double  frequency ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)java.lang.Integer  frequencyTypeDetail ,)java.lang.Integer  durationValue ,)com.vidal.merlin.wsclient.posology.DurationType  durationType ,)java.lang.Integer  secondDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  secondDurationType ,)java.lang.Integer  thirdDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  thirdDurationType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyAlertList checkActivePrincipleDoseForCommonNameGroupIdIndicationIdsRouteIds(java.lang.Integer commonNameGroupId,java.lang.Double dose,com.vidal.merlin.wsclient.posology.DoseUnit doseUnit,java.lang.Boolean administrationDividedPerTimeUnit,java.lang.Double frequency,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,java.lang.Integer frequencyTypeDetail,java.lang.Integer durationValue,com.vidal.merlin.wsclient.posology.DurationType durationType,java.lang.Integer secondDurationValue,com.vidal.merlin.wsclient.posology.DurationType secondDurationType,java.lang.Integer thirdDurationValue,com.vidal.merlin.wsclient.posology.DurationType thirdDurationType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkActivePrincipleDoseForCommonNameGroupIdIndicationIdsRouteIds");
        System.out.println(commonNameGroupId);
        System.out.println(dose);
        System.out.println(doseUnit);
        System.out.println(administrationDividedPerTimeUnit);
        System.out.println(frequency);
        System.out.println(frequencyType);
        System.out.println(frequencyTypeDetail);
        System.out.println(durationValue);
        System.out.println(durationType);
        System.out.println(secondDurationValue);
        System.out.println(secondDurationType);
        System.out.println(thirdDurationValue);
        System.out.println(thirdDurationType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyAlertList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkNumberOfDoseForProductIdIndicationIdsRouteIds(java.lang.Integer  productId ,)java.lang.Double  dose ,)java.lang.Integer  unitId ,)java.lang.Boolean  administrationDividedPerTimeUnit ,)java.lang.Double  frequency ,)com.vidal.merlin.wsclient.posology.PosologyFrequencyType  frequencyType ,)java.lang.Integer  frequencyTypeDetail ,)java.lang.Integer  durationValue ,)com.vidal.merlin.wsclient.posology.DurationType  durationType ,)java.lang.Integer  secondDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  secondDurationType ,)java.lang.Integer  thirdDurationValue ,)com.vidal.merlin.wsclient.posology.DurationType  thirdDurationType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfPosologyAlert checkNumberOfDoseForProductIdIndicationIdsRouteIds(java.lang.Integer productId,java.lang.Double dose,java.lang.Integer unitId,java.lang.Boolean administrationDividedPerTimeUnit,java.lang.Double frequency,com.vidal.merlin.wsclient.posology.PosologyFrequencyType frequencyType,java.lang.Integer frequencyTypeDetail,java.lang.Integer durationValue,com.vidal.merlin.wsclient.posology.DurationType durationType,java.lang.Integer secondDurationValue,com.vidal.merlin.wsclient.posology.DurationType secondDurationType,java.lang.Integer thirdDurationValue,com.vidal.merlin.wsclient.posology.DurationType thirdDurationType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkNumberOfDoseForProductIdIndicationIdsRouteIds");
        System.out.println(productId);
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(administrationDividedPerTimeUnit);
        System.out.println(frequency);
        System.out.println(frequencyType);
        System.out.println(frequencyTypeDetail);
        System.out.println(durationValue);
        System.out.println(durationType);
        System.out.println(secondDurationValue);
        System.out.println(secondDurationType);
        System.out.println(thirdDurationValue);
        System.out.println(thirdDurationType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfPosologyAlert _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchPosologyRouteByCommonNameGroupId(java.lang.Integer  commonNameGroupId ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)java.lang.Float  age ,)java.lang.Float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds )*
     */
    public com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyRouteList searchPosologyRouteByCommonNameGroupId(java.lang.Integer commonNameGroupId,com.vidal.merlin.wsclient.posology.Gender gender,java.lang.Float age,java.lang.Float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds) { 
        LOG.info("Executing operation searchPosologyRouteByCommonNameGroupId");
        System.out.println(commonNameGroupId);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        try {
            com.vidal.merlin.wsclient.posology.CommonNameGroupPosologyRouteList _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchDoseUnitByProductId(java.lang.Integer  productId )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfDoseUnit searchDoseUnitByProductId(java.lang.Integer productId) { 
        LOG.info("Executing operation searchDoseUnitByProductId");
        System.out.println(productId);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfDoseUnit _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#searchDosesByProductId(java.lang.Integer  productId ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.ArrayOfNumberOfDoses searchDosesByProductId(java.lang.Integer productId,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation searchDosesByProductId");
        System.out.println(productId);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.ArrayOfNumberOfDoses _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.posology.PosologyService#checkTreatmentDurationByProductId(java.lang.Integer  productId ,)java.lang.Integer  durationValue ,)com.vidal.merlin.wsclient.posology.DurationType  durationType ,)com.vidal.merlin.wsclient.posology.Gender  gender ,)float  age ,)float  weight ,)java.lang.Integer  height ,)java.lang.Integer  creatinClearance ,)com.vidal.merlin.wsclient.posology.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  indicationIds ,)com.vidal.merlin.wsclient.posology.ArrayOfInt  routeIds )*
     */
    public com.vidal.merlin.wsclient.posology.PosologyAlerts checkTreatmentDurationByProductId(java.lang.Integer productId,java.lang.Integer durationValue,com.vidal.merlin.wsclient.posology.DurationType durationType,com.vidal.merlin.wsclient.posology.Gender gender,float age,float weight,java.lang.Integer height,java.lang.Integer creatinClearance,com.vidal.merlin.wsclient.posology.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.posology.ArrayOfInt indicationIds,com.vidal.merlin.wsclient.posology.ArrayOfInt routeIds) { 
        LOG.info("Executing operation checkTreatmentDurationByProductId");
        System.out.println(productId);
        System.out.println(durationValue);
        System.out.println(durationType);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(creatinClearance);
        System.out.println(hepaticInsufficiency);
        System.out.println(indicationIds);
        System.out.println(routeIds);
        try {
            com.vidal.merlin.wsclient.posology.PosologyAlerts _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
