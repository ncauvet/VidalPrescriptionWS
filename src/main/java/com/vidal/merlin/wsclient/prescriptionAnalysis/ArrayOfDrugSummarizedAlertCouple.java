
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDrugSummarizedAlertCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDrugSummarizedAlertCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DrugSummarizedAlertCouple" type="{http://prescriptionAnalysis.api.vidal.com}DrugSummarizedAlertCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDrugSummarizedAlertCouple", namespace = "http://prescriptionAnalysis.api.vidal.com", propOrder = {
    "drugSummarizedAlertCouple"
})
public class ArrayOfDrugSummarizedAlertCouple {

    @XmlElement(name = "DrugSummarizedAlertCouple", nillable = true)
    protected List<DrugSummarizedAlertCouple> drugSummarizedAlertCouple;

    /**
     * Gets the value of the drugSummarizedAlertCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugSummarizedAlertCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugSummarizedAlertCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugSummarizedAlertCouple }
     * 
     * 
     */
    public List<DrugSummarizedAlertCouple> getDrugSummarizedAlertCouple() {
        if (drugSummarizedAlertCouple == null) {
            drugSummarizedAlertCouple = new ArrayList<DrugSummarizedAlertCouple>();
        }
        return this.drugSummarizedAlertCouple;
    }

}
