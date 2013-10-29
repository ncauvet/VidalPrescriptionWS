package com.vidal.merlin.prescriptionWS;

import com.vidal.merlin.wsclient.allergy.AllergyService;
import com.vidal.merlin.wsclient.allergy.AllergyService_Service;
import com.vidal.merlin.wsclient.allergy.ArrayOfAllergy;
import com.vidal.merlin.wsclient.cim10.ArrayOfCim10;
import com.vidal.merlin.wsclient.cim10.Cim10Service;
import com.vidal.merlin.wsclient.cim10.Cim10Service_Service;
import com.vidal.merlin.wsclient.document.Document;
import com.vidal.merlin.wsclient.document.DocumentService;
import com.vidal.merlin.wsclient.document.DocumentService_Service;
import com.vidal.merlin.wsclient.molecule.ArrayOfMolecule;
import com.vidal.merlin.wsclient.molecule.MoleculeService;
import com.vidal.merlin.wsclient.molecule.MoleculeService_Service;
import com.vidal.merlin.wsclient.posology.ArrayOfPosologyUnit;
import com.vidal.merlin.wsclient.posology.PosologyService;
import com.vidal.merlin.wsclient.posology.PosologyService_Service;
import com.vidal.merlin.wsclient.posology.PosologyUnit;
import com.vidal.merlin.wsclient.prescriptionAnalysis.*;
import com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfInt;
import com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString;
import com.vidal.merlin.wsclient.product.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{

    /**
     * @param args
     */
    private static ProductService_Service productService = new ProductService_Service();
    private static ProductService productClient = productService.getProductServiceHttpPort();

    private static PosologyService_Service posologyService = new PosologyService_Service();
    private static PosologyService posologyClient = posologyService.getPosologyServiceHttpPort();

    private static DocumentService_Service documentService = new DocumentService_Service();
    private static DocumentService documentClient = documentService.getDocumentServiceHttpPort();

    private static DrugPrescriptionAnalysisService_Service drugPrescriptionService = new DrugPrescriptionAnalysisService_Service();
    private static DrugPrescriptionAnalysisService drugPrescriptionClient = drugPrescriptionService.getDrugPrescriptionAnalysisServiceHttpPort();

    private static MoleculeService_Service moleculeService = new MoleculeService_Service();
    private static MoleculeService moleculeClient = moleculeService.getMoleculeServiceHttpPort();

    private static AllergyService_Service allergyService = new AllergyService_Service();
    private static AllergyService allergyClient = allergyService.getAllergyServiceHttpPort();

    private static Cim10Service_Service cim10Service = new Cim10Service_Service();
    private static Cim10Service cim10client = cim10Service.getCim10ServiceHttpPort();


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //-	Serching Drugs. In your case maybe you've stock the drugs in your formulary or directly into your databse as a referential
        //- Different Types of Drugs are available and can be securisable : Product, Package, CommonNameGroup (DCI), UCD
        String term = "zyrtec";
        searchProductByName(term);



        //-	Create a patient: only DateOfBirth and sex are mandatory for the other parameters you can use null or -1 value. Don't use 0 is a real value.
        String patient = createPatient();

        System.out.println("Patient : "+patient);

        com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString ordo = new com.vidal.merlin.wsclient.prescriptionAnalysis.ArrayOfString();


        //add zyrtec to the prescription
        ordo.getString().add(buildPrescriptionLine(3533, DrugType.PRODUCT));
        //add sintrom
        ordo.getString().add(buildPrescriptionLine(15070,DrugType.PRODUCT));
        //add aspegic into the prescription
        ordo.getString().add(buildPrescriptionLine(1525,DrugType.PRODUCT));


        //the getAlertsFull api allowed you to get the prescription securisation into different format :
        //THE FULL FORMAT : STRUCTURED ALERT
        //THE HTML FORMAT : BASIC HTML PAGE DESIGNED BY VIDAL RECAPITULATING ALL THE ALERT AND A PRESCRIPTION ANALYSE
        //THE SUMMARIZED : return the heighest warning level for a kind of alert (ContraIndication, Posology, Allergy ...)
        ArrayOfAlertOutput alertOutPuts = new ArrayOfAlertOutput();
        alertOutPuts.getAlertOutput().add(AlertOutput.ALERTS);
        alertOutPuts.getAlertOutput().add(AlertOutput.HTML);
        alertOutPuts.getAlertOutput().add(AlertOutput.SUMMARIZED);
        PrescriptionAnalysisFull analysis = drugPrescriptionClient.getAlertsFull(patient,ordo,alertOutPuts);

        //TODO : play with stured Alerts
        //PrescriptionAnalysis structuredAnalysis = analysis.getPrescriptionAnalysis();

        //The summarized Alert result
        ArrayOfDrugSummarizedAlertCouple alerts =  analysis.getDrugSummarizedAlertCouple();
        for (DrugSummarizedAlertCouple couple : alerts.getDrugSummarizedAlertCouple()) {
            //les drugs sont renvoyées dans l'ordre exact des lignes de prescriptions en entrées
            System.out.println("Alertes pour le produit : "+couple.getSummarizedDrug().getName());
            SummarizedAlert summaAlert = couple.getSummarizedAlert();
            System.out.println("ALLERGIES : "+summaAlert.getAllergiesAlert());
            System.out.println("Contre-indications : "+summaAlert.getContraIndicationsAlert());
            System.out.println("IAM : "+summaAlert.getInteractionsAlert());
            System.out.println("interactions PhysicoChimiques : "+summaAlert.getPhysicoChemicalAlert());
            System.out.println("Posologie : "+summaAlert.getPosologyAlert());
            System.out.println("Precautions : "+summaAlert.getPrecautionsAlert());
            System.out.println("Redondance de substance : "+summaAlert.getRedundantInteractionsAlert());

        }

        //The HTMl views
        openHTMLFile(analysis.getHtmlAnalysis());

        System.out.println("***************END OF ANALYSE******************");
    }


    private static void openHTMLFile(String analyseHTML) {
        try {
            Date date = new Date();
            File tmp = new File("analyse"+date.getTime()+".html");
            FileWriter fw = null;
            try {
                fw = new FileWriter(tmp);
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            BufferedWriter out = new BufferedWriter(fw);
            out.write(analyseHTML);
            out.close();

            if(Desktop.isDesktopSupported()){
                if(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
                    Desktop dt = Desktop.getDesktop();
                    try {
                        dt.open(tmp);
                    } catch (Exception e) {
                        System.out.println("action navigation non supportée...");
                    }
                }
            }
        } catch (IOException e) {
        }
    }


    private static String createPatient() {

        String result="";

        //EPP parameters :Patient Physiological parameters
        GregorianCalendar c = new GregorianCalendar();
        c.set(1969, 4, 9);//9 mai 1969;
        try {

            XMLGregorianCalendar dateOfBirth;

            dateOfBirth = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);


            Gender gender = Gender.FEMALE;//mandatory you can't put null
            Integer weight = 65;//65kg not mandatory can be null  or -1
            Integer height = 165;//165cm not mandatory can be null or -1
            Integer weeksOfAmenorrhea = 0;//not mandatory can be null or -1
            Breastfeeding breastFeeding = Breastfeeding.NONE;//not mandatory can be null
            Integer creatin = null;  //not mandatory
            HepaticInsufficiency hepaticInsufficiency = null;



         //Allergies parameters
            //Set an Allergy to you patient : maybe you've already stock the allergy as a referentiel in your application using AllergyService.getFull
            ArrayOfAllergy allergies = allergyClient.searchByName("céphalosporine");
            ArrayOfInt allergyIdList = new ArrayOfInt();
            //select one of the result in the list...
            allergyIdList.getInt().add(13);//hypersensibilité aux céphalosporine


            //SET an Molecule as an patient's allergy : As the allergy referential molecule can be used to describe an allergy for your patient example : lactose///
            ArrayOfMolecule molecules = moleculeClient.searchOnlySecuredMoleculeByName("acide acétylsalicylique");
            //select one of the result in the list...
            ArrayOfInt moleculeIdList = new ArrayOfInt();
            moleculeIdList.getInt().add(20);//acide acétylsalicylique

         //pathologies history:  pathologies is based on the ICD10 classification. you may stock this one as a references in your application
            //search Cim10Byname :
            ArrayOfCim10 cims = cim10client.searchByName("apnée du sommeil");
            //select one of the result in the list...
            ArrayOfInt pathologyCim10IdList = new ArrayOfInt();
            pathologyCim10IdList.getInt().add(3085);//apnéee du sommeil

            //as a result th patientFromObjToJson transform each of the patient parameters into a simple string usefull to use in the securisation API
            result = drugPrescriptionClient.patientFromObjToJson(dateOfBirth, gender, weight, height, weeksOfAmenorrhea, breastFeeding, creatin, hepaticInsufficiency, allergyIdList, moleculeIdList, pathologyCim10IdList);
        }

        catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }


    private static void searchProductByName(String term) {
        ArrayOfProductType types = new ArrayOfProductType();
        types.getProductType().add(ProductType.VIDAL);//permet de rechercher dans les médicamments
        types.getProductType().add(ProductType.ACCESSORY);//permet de rechercher dans les DM
        types.getProductType().add(ProductType.HOMEOPATHIC);//permet de rechercher dans les produits homéopatiques
        types.getProductType().add(ProductType.DIETETIC);//permet de rechercher dans les produits d'hygiènes et cosmétiques
        types.getProductType().add(ProductType.NON_PHARMACEUTICAL);//recherche dans la para-pharmacie
        types.getProductType().add(ProductType.BALNEOLOGY);//eau et stations thermales ...

        ArrayOfMarketStatus marketStatuses = new ArrayOfMarketStatus();
        //préciser si vous voulez rechercher dans les médicamets supprimés
        //médicalments disponibles :
        marketStatuses.getMarketStatus().add(MarketStatus.AVAILABLE);
        marketStatuses.getMarketStatus().add(MarketStatus.NEW);
        //médicaments supprimés :
        marketStatuses.getMarketStatus().add(MarketStatus.DELETED);
        marketStatuses.getMarketStatus().add(MarketStatus.DELETED_ONEYEAR);
        marketStatuses.getMarketStatus().add(MarketStatus.PHARMACO);//:supprimés pour pharmacovigilance
        marketStatuses.getMarketStatus().add(MarketStatus.PHARMACO_ONEYEAR);


        //les résultats sont ici sous forme paginée, vous devez préciser la page que vous voulez et le nombre de résultats que vous voulez obtenir

        ArrayOfAggregate aggregates = new ArrayOfAggregate();
        aggregates.getAggregate().add(Aggregate.GALENIC);

        aggregates.getAggregate().add(Aggregate.UNIT);

        PagedResultProductFull result =  productClient.getAllProductFull(term,marketStatuses,ProductApiFilter.ALL,types,aggregates,1,25);
        System.out.println("La recherche renvoie : "+ result.getRowCount()+" éléments");
        System.out.println("Page "+result.getPageNumber()+ " = "+(result.getPageSize() * result.getPageNumber() + " / " + result.getRowCount()));
        for (ProductFull productFull : result.getResult().getProductFull()) {
            Product product = productFull.getProduct();
            System.out.println("Id de la spécialité : "+product.getId());
            System.out.println("Nom : "+product.getName());
            System.out.println("prix approximatif minimum de l'ucd : "+product.getMinUcdRangePrice());
            System.out.println("Remboursement Secu : " + product.getRefundingRateValue());

            ArrayOfGalenicForm galenics = productFull.getGalenic().getGalenicForms();
            for (GalenicForm form : galenics.getGalenicForm()){
                System.out.println("Gelenic Form : "+form.getName());
            }

           // productFull.get
            System.out.println("Récupération des unités de prescription de :  ZYRTEC 10 mg/ml sol buv :");
            getPrescriptionUnits(product.getId());
        }



        //Récupération de la monograhie :
        Document mono = documentClient.getMonoForProductId(3533);
        System.out.println("le document se trouve à l'url :" +mono.getUrlAsString());
        openHtmlDocument(mono.getUrlAsString());
    }


    private static void openHtmlDocument(String path) {
        if(Desktop.isDesktopSupported()){
            if(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
                Desktop dt = Desktop.getDesktop();
                try {
                    dt.browse(new URI(path));
                } catch (Exception e) {
                    System.out.println("action navigation non supportée...");
                }
            }
        }
    }


    private static ArrayOfPosologyUnit getPrescriptionUnits(int id) {
        ArrayOfPosologyUnit units = posologyClient.searchPosologyUnitByProductId(id);
        for (PosologyUnit unit : units.getPosologyUnit()) {
            System.out.println("ID: " + unit.getId());
            System.out.println("Name: " + unit.getName());
        }
        return units;
    }

    private static String buildPrescriptionLine(Integer drugId,DrugType drugType) {
        String result="";

        //these parameters are needed just for Posology checking
        PosologyFrequencyType frequencyType = PosologyFrequencyType.PER_24_HOURS;
        //recuperation des unites de prescriptions:

        ArrayOfPosologyUnit units = getPrescriptionUnits(drugId);
        //choose one of the units
        Integer unitId= units.getPosologyUnit().get(0).getId();
        Double dose=12.0;
        //recupération des voies d'administrations, vet attribut peut ête ignoré
        ArrayOfInt routeIdList=null;
        ArrayOfInt indicationIdList=null;
        Integer duration=50;
        DurationType durationType=DurationType.DAY;

        result = drugPrescriptionClient.prescriptionLineInDosesFromObjToJson(dose, unitId, frequencyType, indicationIdList, routeIdList, drugId, drugType, duration, durationType);

        return result;
    }
}
