
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.vidal.merlin.wsclient.prescriptionAnalysis;

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
                      serviceName = "DrugPrescriptionAnalysisService",
                      portName = "DrugPrescriptionAnalysisServiceHttpPort",
                      targetNamespace = "urn:Vidal",
                      wsdlLocation = "http://localhost:8011/merlin-service/services/DrugPrescriptionAnalysisService?wsdl",
                      endpointInterface = "com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService")
                      
public class DrugPrescriptionAnalysisServiceImpl implements DrugPrescriptionAnalysisService {

    private static final Logger LOG = Logger.getLogger(DrugPrescriptionAnalysisServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#patientFromObjToJson(javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)com.vidal.merlin.wsclient.prescriptionAnalysis.Gender  gender ,)java.lang.Integer  weight ,)java.lang.Integer  height ,)java.lang.Integer  weeksOfAmenorrhea ,)com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding  breastFeeding ,)java.lang.Integer  creatin ,)com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  allergyIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  moleculeIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  pathologyCim10IdList )*
     */
    public java.lang.String patientFromObjToJson(javax.xml.datatype.XMLGregorianCalendar dateOfBirth,com.vidal.merlin.wsclient.prescriptionAnalysis.Gender gender,java.lang.Integer weight,java.lang.Integer height,java.lang.Integer weeksOfAmenorrhea,com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding breastFeeding,java.lang.Integer creatin,com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt allergyIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt moleculeIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt pathologyCim10IdList) { 
        LOG.info("Executing operation patientFromObjToJson");
        System.out.println(dateOfBirth);
        System.out.println(gender);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(weeksOfAmenorrhea);
        System.out.println(breastFeeding);
        System.out.println(creatin);
        System.out.println(hepaticInsufficiency);
        System.out.println(allergyIdList);
        System.out.println(moleculeIdList);
        System.out.println(pathologyCim10IdList);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getAlertsWithoutAlertTypes(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertType  withoutAlertTypes )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis getAlertsWithoutAlertTypes(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertType withoutAlertTypes) { 
        LOG.info("Executing operation getAlertsWithoutAlertTypes");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        System.out.println(withoutAlertTypes);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getAlertsAsHTML(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList )*
     */
    public java.lang.String getAlertsAsHTML(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList) { 
        LOG.info("Executing operation getAlertsAsHTML");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#prescriptionLineInActivePrincipleDosesFromObjToJson(java.lang.Double  dose ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DoseUnit  doseUnit ,)com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  indicationIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  routeIdList ,)java.lang.Integer  drugId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType  drugType ,)java.lang.Integer  duration ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType  durationType )*
     */
    public java.lang.String prescriptionLineInActivePrincipleDosesFromObjToJson(java.lang.Double dose,com.vidal.merlin.wsclient.prescriptionAnalysis.DoseUnit doseUnit,com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt indicationIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt routeIdList,java.lang.Integer drugId,com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType drugType,java.lang.Integer duration,com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType durationType) { 
        LOG.info("Executing operation prescriptionLineInActivePrincipleDosesFromObjToJson");
        System.out.println(dose);
        System.out.println(doseUnit);
        System.out.println(frequencyType);
        System.out.println(indicationIdList);
        System.out.println(routeIdList);
        System.out.println(drugId);
        System.out.println(drugType);
        System.out.println(duration);
        System.out.println(durationType);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#prescriptionLineFromObjToJsonUsingDrugCodes(java.lang.Double  dose ,)java.lang.Integer  unitId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  indicationIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  routeIdList ,)java.lang.String  drugCode ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DrugCodeType  drugCodeType ,)java.lang.Integer  duration ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType  durationType )*
     */
    public java.lang.String prescriptionLineFromObjToJsonUsingDrugCodes(java.lang.Double dose,java.lang.Integer unitId,com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt indicationIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt routeIdList,java.lang.String drugCode,com.vidal.merlin.wsclient.prescriptionAnalysis.DrugCodeType drugCodeType,java.lang.Integer duration,com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType durationType) { 
        LOG.info("Executing operation prescriptionLineFromObjToJsonUsingDrugCodes");
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(frequencyType);
        System.out.println(indicationIdList);
        System.out.println(routeIdList);
        System.out.println(drugCode);
        System.out.println(drugCodeType);
        System.out.println(duration);
        System.out.println(durationType);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#prescriptionLineFromObjToJson(java.lang.Double  dose ,)java.lang.Integer  unitId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  indicationIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  routeIdList ,)java.lang.Integer  drugId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType  drugType )*
     */
    public java.lang.String prescriptionLineFromObjToJson(java.lang.Double dose,java.lang.Integer unitId,com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt indicationIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt routeIdList,java.lang.Integer drugId,com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType drugType) { 
        LOG.info("Executing operation prescriptionLineFromObjToJson");
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(frequencyType);
        System.out.println(indicationIdList);
        System.out.println(routeIdList);
        System.out.println(drugId);
        System.out.println(drugType);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#searchRecosByPrescriptions(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfCodedReco searchRecosByPrescriptions(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList) { 
        LOG.info("Executing operation searchRecosByPrescriptions");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfCodedReco _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getPrescriptionCostAnalysis(com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLines )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionCostAnalysis getPrescriptionCostAnalysis(com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLines) { 
        LOG.info("Executing operation getPrescriptionCostAnalysis");
        System.out.println(prescriptionLines);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionCostAnalysis _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#prescriptionLineInDosesFromObjToJson(java.lang.Double  dose ,)java.lang.Integer  unitId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType  frequencyType ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  indicationIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  routeIdList ,)java.lang.Integer  drugId ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType  drugType ,)java.lang.Integer  duration ,)com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType  durationType )*
     */
    public java.lang.String prescriptionLineInDosesFromObjToJson(java.lang.Double dose,java.lang.Integer unitId,com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType frequencyType,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt indicationIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt routeIdList,java.lang.Integer drugId,com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType drugType,java.lang.Integer duration,com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType durationType) { 
        LOG.info("Executing operation prescriptionLineInDosesFromObjToJson");
        System.out.println(dose);
        System.out.println(unitId);
        System.out.println(frequencyType);
        System.out.println(indicationIdList);
        System.out.println(routeIdList);
        System.out.println(drugId);
        System.out.println(drugType);
        System.out.println(duration);
        System.out.println(durationType);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getAlerts(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis getAlerts(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList) { 
        LOG.info("Executing operation getAlerts");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#patientFromObjToJsonUsingPathologyCodes(javax.xml.datatype.XMLGregorianCalendar  dateOfBirth ,)com.vidal.merlin.wsclient.prescriptionAnalysis.Gender  gender ,)java.lang.Double  weight ,)java.lang.Double  height ,)java.lang.Integer  weeksOfAmenorrhea ,)com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding  breastFeeding ,)java.lang.Integer  creatin ,)com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency  hepaticInsufficiency ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  allergyIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt  moleculeIdList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  pathologyCodes )*
     */
    public java.lang.String patientFromObjToJsonUsingPathologyCodes(javax.xml.datatype.XMLGregorianCalendar dateOfBirth,com.vidal.merlin.wsclient.prescriptionAnalysis.Gender gender,java.lang.Double weight,java.lang.Double height,java.lang.Integer weeksOfAmenorrhea,com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding breastFeeding,java.lang.Integer creatin,com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency hepaticInsufficiency,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt allergyIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt moleculeIdList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString pathologyCodes) { 
        LOG.info("Executing operation patientFromObjToJsonUsingPathologyCodes");
        System.out.println(dateOfBirth);
        System.out.println(gender);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(weeksOfAmenorrhea);
        System.out.println(breastFeeding);
        System.out.println(creatin);
        System.out.println(hepaticInsufficiency);
        System.out.println(allergyIdList);
        System.out.println(moleculeIdList);
        System.out.println(pathologyCodes);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getSummarizedAlert(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfDrugSummarizedAlertCouple getSummarizedAlert(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList) { 
        LOG.info("Executing operation getSummarizedAlert");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfDrugSummarizedAlertCouple _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.vidal.merlin.wsclient.prescriptionAnalysis.DrugPrescriptionAnalysisService#getAlertsFull(java.lang.String  patient ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString  prescriptionLineList ,)com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertOutput  alertOutputList )*
     */
    public com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysisFull getAlertsFull(java.lang.String patient,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString prescriptionLineList,com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertOutput alertOutputList) { 
        LOG.info("Executing operation getAlertsFull");
        System.out.println(patient);
        System.out.println(prescriptionLineList);
        System.out.println(alertOutputList);
        try {
            com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysisFull _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
