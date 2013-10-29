
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugSummarizedAlertCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugSummarizedAlertCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summarizedAlert" type="{urn:Vidal}summarizedAlert"/>
 *         &lt;element name="summarizedDrug" type="{urn:Vidal}summarizedDrug"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugSummarizedAlertCouple", namespace = "http://prescriptionAnalysis.api.vidal.com", propOrder = {
    "summarizedAlert",
    "summarizedDrug"
})
public class DrugSummarizedAlertCouple {

    @XmlElement(required = true, nillable = true)
    protected SummarizedAlert summarizedAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedDrug summarizedDrug;

    /**
     * Gets the value of the summarizedAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedAlert }
     *     
     */
    public SummarizedAlert getSummarizedAlert() {
        return summarizedAlert;
    }

    /**
     * Sets the value of the summarizedAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedAlert }
     *     
     */
    public void setSummarizedAlert(SummarizedAlert value) {
        this.summarizedAlert = value;
    }

    /**
     * Gets the value of the summarizedDrug property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedDrug }
     *     
     */
    public SummarizedDrug getSummarizedDrug() {
        return summarizedDrug;
    }

    /**
     * Sets the value of the summarizedDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedDrug }
     *     
     */
    public void setSummarizedDrug(SummarizedDrug value) {
        this.summarizedDrug = value;
    }

}
