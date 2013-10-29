
package com.vidal.merlin.wsclient.molecule;

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
 * Mon Oct 28 23:24:28 CET 2013
 * Generated source version: 2.2.6
 * 
 */

public final class MoleculeService_MoleculeServiceHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:Vidal", "MoleculeService");

    private MoleculeService_MoleculeServiceHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = MoleculeService_Service.WSDL_LOCATION;
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
      
        MoleculeService_Service ss = new MoleculeService_Service(wsdlURL, SERVICE_NAME);
        MoleculeService port = ss.getMoleculeServiceHttpPort();  
        
        {
        System.out.println("Invoking searchByProductId...");
        java.lang.Integer _searchByProductId_productId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchByProductId__return = port.searchByProductId(_searchByProductId_productId);
        System.out.println("searchByProductId.result=" + _searchByProductId__return);


        }
        {
        System.out.println("Invoking searchByName...");
        java.lang.String _searchByName_name = "";
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchByName__return = port.searchByName(_searchByName_name);
        System.out.println("searchByName.result=" + _searchByName__return);


        }
        {
        System.out.println("Invoking searchActivePrincipleByUcdId...");
        java.lang.Integer _searchActivePrincipleByUcdId_ucdId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchActivePrincipleByUcdId__return = port.searchActivePrincipleByUcdId(_searchActivePrincipleByUcdId_ucdId);
        System.out.println("searchActivePrincipleByUcdId.result=" + _searchActivePrincipleByUcdId__return);


        }
        {
        System.out.println("Invoking searchOnlySecuredMoleculeByName...");
        java.lang.String _searchOnlySecuredMoleculeByName_name = "";
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchOnlySecuredMoleculeByName__return = port.searchOnlySecuredMoleculeByName(_searchOnlySecuredMoleculeByName_name);
        System.out.println("searchOnlySecuredMoleculeByName.result=" + _searchOnlySecuredMoleculeByName__return);


        }
        {
        System.out.println("Invoking getChildrenById...");
        java.lang.Integer _getChildrenById_moleculeId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _getChildrenById__return = port.getChildrenById(_getChildrenById_moleculeId);
        System.out.println("getChildrenById.result=" + _getChildrenById__return);


        }
        {
        System.out.println("Invoking searchActivePrincipleByProductId...");
        java.lang.Integer _searchActivePrincipleByProductId_productId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchActivePrincipleByProductId__return = port.searchActivePrincipleByProductId(_searchActivePrincipleByProductId_productId);
        System.out.println("searchActivePrincipleByProductId.result=" + _searchActivePrincipleByProductId__return);


        }
        {
        System.out.println("Invoking searchById...");
        java.lang.Integer _searchById_moleculeId = null;
        com.vidal.merlin.wsclient.molecule.Molecule _searchById__return = port.searchById(_searchById_moleculeId);
        System.out.println("searchById.result=" + _searchById__return);


        }
        {
        System.out.println("Invoking searchByNameAndRoleWithIndexedVidalWithUsedInComposition...");
        java.lang.String _searchByNameAndRoleWithIndexedVidalWithUsedInComposition_name = "";
        com.vidal.merlin.wsclient.molecule.SubstanceRole _searchByNameAndRoleWithIndexedVidalWithUsedInComposition_role = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchByNameAndRoleWithIndexedVidalWithUsedInComposition__return = port.searchByNameAndRoleWithIndexedVidalWithUsedInComposition(_searchByNameAndRoleWithIndexedVidalWithUsedInComposition_name, _searchByNameAndRoleWithIndexedVidalWithUsedInComposition_role);
        System.out.println("searchByNameAndRoleWithIndexedVidalWithUsedInComposition.result=" + _searchByNameAndRoleWithIndexedVidalWithUsedInComposition__return);


        }
        {
        System.out.println("Invoking searchActivePrincipleByCommonNameGroupId...");
        java.lang.Integer _searchActivePrincipleByCommonNameGroupId_commonNameGroupId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchActivePrincipleByCommonNameGroupId__return = port.searchActivePrincipleByCommonNameGroupId(_searchActivePrincipleByCommonNameGroupId_commonNameGroupId);
        System.out.println("searchActivePrincipleByCommonNameGroupId.result=" + _searchActivePrincipleByCommonNameGroupId__return);


        }
        {
        System.out.println("Invoking getAllMolecules...");
        com.vidal.merlin.wsclient.molecule.SubstanceRole _getAllMolecules_role = null;
        java.lang.Integer _getAllMolecules_pageNumber = null;
        java.lang.Integer _getAllMolecules_pageSize = null;
        com.vidal.merlin.wsclient.molecule.PagedResultMolecule _getAllMolecules__return = port.getAllMolecules(_getAllMolecules_role, _getAllMolecules_pageNumber, _getAllMolecules_pageSize);
        System.out.println("getAllMolecules.result=" + _getAllMolecules__return);


        }
        {
        System.out.println("Invoking searchOnlySecuredMoleculeByIds...");
        com.vidal.merlin.wsclient.molecule.ArrayOfInt _searchOnlySecuredMoleculeByIds_moleculeIds = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchOnlySecuredMoleculeByIds__return = port.searchOnlySecuredMoleculeByIds(_searchOnlySecuredMoleculeByIds_moleculeIds);
        System.out.println("searchOnlySecuredMoleculeByIds.result=" + _searchOnlySecuredMoleculeByIds__return);


        }
        {
        System.out.println("Invoking searchByIds...");
        com.vidal.merlin.wsclient.molecule.ArrayOfInt _searchByIds_moleculeIds = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchByIds__return = port.searchByIds(_searchByIds_moleculeIds);
        System.out.println("searchByIds.result=" + _searchByIds__return);


        }
        {
        System.out.println("Invoking getParentsById...");
        java.lang.Integer _getParentsById_moleculeId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _getParentsById__return = port.getParentsById(_getParentsById_moleculeId);
        System.out.println("getParentsById.result=" + _getParentsById__return);


        }
        {
        System.out.println("Invoking searchByAllergyId...");
        java.lang.Integer _searchByAllergyId_allergyId = null;
        com.vidal.merlin.wsclient.molecule.ArrayOfMolecule _searchByAllergyId__return = port.searchByAllergyId(_searchByAllergyId_allergyId);
        System.out.println("searchByAllergyId.result=" + _searchByAllergyId__return);


        }

        System.exit(0);
    }

}
