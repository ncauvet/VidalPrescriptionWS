
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescriptionCostAnalysis" type="{urn:Vidal}prescriptionCostAnalysis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prescriptionCostAnalysis"
})
@XmlRootElement(name = "getPrescriptionCostAnalysisResponse")
public class GetPrescriptionCostAnalysisResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionCostAnalysis prescriptionCostAnalysis;

    /**
     * Gets the value of the prescriptionCostAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionCostAnalysis }
     *     
     */
    public PrescriptionCostAnalysis getPrescriptionCostAnalysis() {
        return prescriptionCostAnalysis;
    }

    /**
     * Sets the value of the prescriptionCostAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionCostAnalysis }
     *     
     */
    public void setPrescriptionCostAnalysis(PrescriptionCostAnalysis value) {
        this.prescriptionCostAnalysis = value;
    }

}
