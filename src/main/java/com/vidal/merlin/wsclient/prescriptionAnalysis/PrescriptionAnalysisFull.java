
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prescriptionAnalysisFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prescriptionAnalysisFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugSummarizedAlertCouple" type="{http://prescriptionAnalysis.api.vidal.com}ArrayOfDrugSummarizedAlertCouple"/>
 *         &lt;element name="htmlAnalysis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionAnalysis" type="{urn:Vidal}prescriptionAnalysis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionAnalysisFull", propOrder = {
    "drugSummarizedAlertCouple",
    "htmlAnalysis",
    "prescriptionAnalysis"
})
public class PrescriptionAnalysisFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugSummarizedAlertCouple drugSummarizedAlertCouple;
    @XmlElement(required = true, nillable = true)
    protected String htmlAnalysis;
    @XmlElement(required = true, nillable = true)
    protected PrescriptionAnalysis prescriptionAnalysis;

    /**
     * Gets the value of the drugSummarizedAlertCouple property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public ArrayOfDrugSummarizedAlertCouple getDrugSummarizedAlertCouple() {
        return drugSummarizedAlertCouple;
    }

    /**
     * Sets the value of the drugSummarizedAlertCouple property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugSummarizedAlertCouple }
     *     
     */
    public void setDrugSummarizedAlertCouple(ArrayOfDrugSummarizedAlertCouple value) {
        this.drugSummarizedAlertCouple = value;
    }

    /**
     * Gets the value of the htmlAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlAnalysis() {
        return htmlAnalysis;
    }

    /**
     * Sets the value of the htmlAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlAnalysis(String value) {
        this.htmlAnalysis = value;
    }

    /**
     * Gets the value of the prescriptionAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public PrescriptionAnalysis getPrescriptionAnalysis() {
        return prescriptionAnalysis;
    }

    /**
     * Sets the value of the prescriptionAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionAnalysis }
     *     
     */
    public void setPrescriptionAnalysis(PrescriptionAnalysis value) {
        this.prescriptionAnalysis = value;
    }

}
