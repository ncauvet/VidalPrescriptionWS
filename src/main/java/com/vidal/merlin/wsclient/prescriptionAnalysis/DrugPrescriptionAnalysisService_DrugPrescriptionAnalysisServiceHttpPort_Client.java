
package com.vidal.merlin.wsclient.prescriptionAnalysis;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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

public final class DrugPrescriptionAnalysisService_DrugPrescriptionAnalysisServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "DrugPrescriptionAnalysisService");

    private DrugPrescriptionAnalysisService_DrugPrescriptionAnalysisServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = DrugPrescriptionAnalysisService_Service.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DrugPrescriptionAnalysisService_Service ss = new DrugPrescriptionAnalysisService_Service(wsdlURL, SERVICE_NAME);
        DrugPrescriptionAnalysisService port = ss.getDrugPrescriptionAnalysisServiceHttpPort();  
        
        {
        System.out.println("Invoking patientFromObjToJson...");
        javax.xml.datatype.XMLGregorianCalendar _patientFromObjToJson_dateOfBirth = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.Gender _patientFromObjToJson_gender = null;
        java.lang.Integer _patientFromObjToJson_weight = null;
        java.lang.Integer _patientFromObjToJson_height = null;
        java.lang.Integer _patientFromObjToJson_weeksOfAmenorrhea = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding _patientFromObjToJson_breastFeeding = null;
        java.lang.Integer _patientFromObjToJson_creatin = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency _patientFromObjToJson_hepaticInsufficiency = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _patientFromObjToJson_allergyIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _patientFromObjToJson_moleculeIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _patientFromObjToJson_pathologyCim10IdList = null;
        java.lang.String _patientFromObjToJson__return = port.patientFromObjToJson(_patientFromObjToJson_dateOfBirth, _patientFromObjToJson_gender, _patientFromObjToJson_weight, _patientFromObjToJson_height, _patientFromObjToJson_weeksOfAmenorrhea, _patientFromObjToJson_breastFeeding, _patientFromObjToJson_creatin, _patientFromObjToJson_hepaticInsufficiency, _patientFromObjToJson_allergyIdList, _patientFromObjToJson_moleculeIdList, _patientFromObjToJson_pathologyCim10IdList);
        System.out.println("patientFromObjToJson.result=" + _patientFromObjToJson__return);


        }
        {
        System.out.println("Invoking getAlertsWithoutAlertTypes...");
        java.lang.String _getAlertsWithoutAlertTypes_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getAlertsWithoutAlertTypes_prescriptionLineList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertType _getAlertsWithoutAlertTypes_withoutAlertTypes = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis _getAlertsWithoutAlertTypes__return = port.getAlertsWithoutAlertTypes(_getAlertsWithoutAlertTypes_patient, _getAlertsWithoutAlertTypes_prescriptionLineList, _getAlertsWithoutAlertTypes_withoutAlertTypes);
        System.out.println("getAlertsWithoutAlertTypes.result=" + _getAlertsWithoutAlertTypes__return);


        }
        {
        System.out.println("Invoking getAlertsAsHTML...");
        java.lang.String _getAlertsAsHTML_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getAlertsAsHTML_prescriptionLineList = null;
        java.lang.String _getAlertsAsHTML__return = port.getAlertsAsHTML(_getAlertsAsHTML_patient, _getAlertsAsHTML_prescriptionLineList);
        System.out.println("getAlertsAsHTML.result=" + _getAlertsAsHTML__return);


        }
        {
        System.out.println("Invoking prescriptionLineInActivePrincipleDosesFromObjToJson...");
        java.lang.Double _prescriptionLineInActivePrincipleDosesFromObjToJson_dose = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DoseUnit _prescriptionLineInActivePrincipleDosesFromObjToJson_doseUnit = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType _prescriptionLineInActivePrincipleDosesFromObjToJson_frequencyType = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineInActivePrincipleDosesFromObjToJson_indicationIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineInActivePrincipleDosesFromObjToJson_routeIdList = null;
        java.lang.Integer _prescriptionLineInActivePrincipleDosesFromObjToJson_drugId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType _prescriptionLineInActivePrincipleDosesFromObjToJson_drugType = null;
        java.lang.Integer _prescriptionLineInActivePrincipleDosesFromObjToJson_duration = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType _prescriptionLineInActivePrincipleDosesFromObjToJson_durationType = null;
        java.lang.String _prescriptionLineInActivePrincipleDosesFromObjToJson__return = port.prescriptionLineInActivePrincipleDosesFromObjToJson(_prescriptionLineInActivePrincipleDosesFromObjToJson_dose, _prescriptionLineInActivePrincipleDosesFromObjToJson_doseUnit, _prescriptionLineInActivePrincipleDosesFromObjToJson_frequencyType, _prescriptionLineInActivePrincipleDosesFromObjToJson_indicationIdList, _prescriptionLineInActivePrincipleDosesFromObjToJson_routeIdList, _prescriptionLineInActivePrincipleDosesFromObjToJson_drugId, _prescriptionLineInActivePrincipleDosesFromObjToJson_drugType, _prescriptionLineInActivePrincipleDosesFromObjToJson_duration, _prescriptionLineInActivePrincipleDosesFromObjToJson_durationType);
        System.out.println("prescriptionLineInActivePrincipleDosesFromObjToJson.result=" + _prescriptionLineInActivePrincipleDosesFromObjToJson__return);


        }
        {
        System.out.println("Invoking prescriptionLineFromObjToJsonUsingDrugCodes...");
        java.lang.Double _prescriptionLineFromObjToJsonUsingDrugCodes_dose = null;
        java.lang.Integer _prescriptionLineFromObjToJsonUsingDrugCodes_unitId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType _prescriptionLineFromObjToJsonUsingDrugCodes_frequencyType = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineFromObjToJsonUsingDrugCodes_indicationIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineFromObjToJsonUsingDrugCodes_routeIdList = null;
        java.lang.String _prescriptionLineFromObjToJsonUsingDrugCodes_drugCode = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.DrugCodeType _prescriptionLineFromObjToJsonUsingDrugCodes_drugCodeType = null;
        java.lang.Integer _prescriptionLineFromObjToJsonUsingDrugCodes_duration = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType _prescriptionLineFromObjToJsonUsingDrugCodes_durationType = null;
        java.lang.String _prescriptionLineFromObjToJsonUsingDrugCodes__return = port.prescriptionLineFromObjToJsonUsingDrugCodes(_prescriptionLineFromObjToJsonUsingDrugCodes_dose, _prescriptionLineFromObjToJsonUsingDrugCodes_unitId, _prescriptionLineFromObjToJsonUsingDrugCodes_frequencyType, _prescriptionLineFromObjToJsonUsingDrugCodes_indicationIdList, _prescriptionLineFromObjToJsonUsingDrugCodes_routeIdList, _prescriptionLineFromObjToJsonUsingDrugCodes_drugCode, _prescriptionLineFromObjToJsonUsingDrugCodes_drugCodeType, _prescriptionLineFromObjToJsonUsingDrugCodes_duration, _prescriptionLineFromObjToJsonUsingDrugCodes_durationType);
        System.out.println("prescriptionLineFromObjToJsonUsingDrugCodes.result=" + _prescriptionLineFromObjToJsonUsingDrugCodes__return);


        }
        {
        System.out.println("Invoking prescriptionLineFromObjToJson...");
        java.lang.Double _prescriptionLineFromObjToJson_dose = null;
        java.lang.Integer _prescriptionLineFromObjToJson_unitId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType _prescriptionLineFromObjToJson_frequencyType = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineFromObjToJson_indicationIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineFromObjToJson_routeIdList = null;
        java.lang.Integer _prescriptionLineFromObjToJson_drugId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType _prescriptionLineFromObjToJson_drugType = null;
        java.lang.String _prescriptionLineFromObjToJson__return = port.prescriptionLineFromObjToJson(_prescriptionLineFromObjToJson_dose, _prescriptionLineFromObjToJson_unitId, _prescriptionLineFromObjToJson_frequencyType, _prescriptionLineFromObjToJson_indicationIdList, _prescriptionLineFromObjToJson_routeIdList, _prescriptionLineFromObjToJson_drugId, _prescriptionLineFromObjToJson_drugType);
        System.out.println("prescriptionLineFromObjToJson.result=" + _prescriptionLineFromObjToJson__return);


        }
        {
        System.out.println("Invoking searchRecosByPrescriptions...");
        java.lang.String _searchRecosByPrescriptions_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _searchRecosByPrescriptions_prescriptionLineList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfCodedReco _searchRecosByPrescriptions__return = port.searchRecosByPrescriptions(_searchRecosByPrescriptions_patient, _searchRecosByPrescriptions_prescriptionLineList);
        System.out.println("searchRecosByPrescriptions.result=" + _searchRecosByPrescriptions__return);


        }
        {
        System.out.println("Invoking getPrescriptionCostAnalysis...");
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getPrescriptionCostAnalysis_prescriptionLines = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionCostAnalysis _getPrescriptionCostAnalysis__return = port.getPrescriptionCostAnalysis(_getPrescriptionCostAnalysis_prescriptionLines);
        System.out.println("getPrescriptionCostAnalysis.result=" + _getPrescriptionCostAnalysis__return);


        }
        {
        System.out.println("Invoking prescriptionLineInDosesFromObjToJson...");
        java.lang.Double _prescriptionLineInDosesFromObjToJson_dose = null;
        java.lang.Integer _prescriptionLineInDosesFromObjToJson_unitId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PosologyFrequencyType _prescriptionLineInDosesFromObjToJson_frequencyType = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineInDosesFromObjToJson_indicationIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _prescriptionLineInDosesFromObjToJson_routeIdList = null;
        java.lang.Integer _prescriptionLineInDosesFromObjToJson_drugId = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DrugType _prescriptionLineInDosesFromObjToJson_drugType = null;
        java.lang.Integer _prescriptionLineInDosesFromObjToJson_duration = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.DurationType _prescriptionLineInDosesFromObjToJson_durationType = null;
        java.lang.String _prescriptionLineInDosesFromObjToJson__return = port.prescriptionLineInDosesFromObjToJson(_prescriptionLineInDosesFromObjToJson_dose, _prescriptionLineInDosesFromObjToJson_unitId, _prescriptionLineInDosesFromObjToJson_frequencyType, _prescriptionLineInDosesFromObjToJson_indicationIdList, _prescriptionLineInDosesFromObjToJson_routeIdList, _prescriptionLineInDosesFromObjToJson_drugId, _prescriptionLineInDosesFromObjToJson_drugType, _prescriptionLineInDosesFromObjToJson_duration, _prescriptionLineInDosesFromObjToJson_durationType);
        System.out.println("prescriptionLineInDosesFromObjToJson.result=" + _prescriptionLineInDosesFromObjToJson__return);


        }
        {
        System.out.println("Invoking getAlerts...");
        java.lang.String _getAlerts_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getAlerts_prescriptionLineList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysis _getAlerts__return = port.getAlerts(_getAlerts_patient, _getAlerts_prescriptionLineList);
        System.out.println("getAlerts.result=" + _getAlerts__return);


        }
        {
        System.out.println("Invoking patientFromObjToJsonUsingPathologyCodes...");
        javax.xml.datatype.XMLGregorianCalendar _patientFromObjToJsonUsingPathologyCodes_dateOfBirth = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.Gender _patientFromObjToJsonUsingPathologyCodes_gender = null;
        java.lang.Double _patientFromObjToJsonUsingPathologyCodes_weight = null;
        java.lang.Double _patientFromObjToJsonUsingPathologyCodes_height = null;
        java.lang.Integer _patientFromObjToJsonUsingPathologyCodes_weeksOfAmenorrhea = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.Breastfeeding _patientFromObjToJsonUsingPathologyCodes_breastFeeding = null;
        java.lang.Integer _patientFromObjToJsonUsingPathologyCodes_creatin = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.HepaticInsufficiency _patientFromObjToJsonUsingPathologyCodes_hepaticInsufficiency = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _patientFromObjToJsonUsingPathologyCodes_allergyIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt _patientFromObjToJsonUsingPathologyCodes_moleculeIdList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _patientFromObjToJsonUsingPathologyCodes_pathologyCodes = null;
        java.lang.String _patientFromObjToJsonUsingPathologyCodes__return = port.patientFromObjToJsonUsingPathologyCodes(_patientFromObjToJsonUsingPathologyCodes_dateOfBirth, _patientFromObjToJsonUsingPathologyCodes_gender, _patientFromObjToJsonUsingPathologyCodes_weight, _patientFromObjToJsonUsingPathologyCodes_height, _patientFromObjToJsonUsingPathologyCodes_weeksOfAmenorrhea, _patientFromObjToJsonUsingPathologyCodes_breastFeeding, _patientFromObjToJsonUsingPathologyCodes_creatin, _patientFromObjToJsonUsingPathologyCodes_hepaticInsufficiency, _patientFromObjToJsonUsingPathologyCodes_allergyIdList, _patientFromObjToJsonUsingPathologyCodes_moleculeIdList, _patientFromObjToJsonUsingPathologyCodes_pathologyCodes);
        System.out.println("patientFromObjToJsonUsingPathologyCodes.result=" + _patientFromObjToJsonUsingPathologyCodes__return);


        }
        {
        System.out.println("Invoking getSummarizedAlert...");
        java.lang.String _getSummarizedAlert_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getSummarizedAlert_prescriptionLineList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfDrugSummarizedAlertCouple _getSummarizedAlert__return = port.getSummarizedAlert(_getSummarizedAlert_patient, _getSummarizedAlert_prescriptionLineList);
        System.out.println("getSummarizedAlert.result=" + _getSummarizedAlert__return);


        }
        {
        System.out.println("Invoking getAlertsFull...");
        java.lang.String _getAlertsFull_patient = "";
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString _getAlertsFull_prescriptionLineList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfAlertOutput _getAlertsFull_alertOutputList = null;
        com.vidal.merlin.wsclient.prescriptionAnalysis.PrescriptionAnalysisFull _getAlertsFull__return = port.getAlertsFull(_getAlertsFull_patient, _getAlertsFull_prescriptionLineList, _getAlertsFull_alertOutputList);
        System.out.println("getAlertsFull.result=" + _getAlertsFull__return);


        }

        System.exit(0);
    }

}