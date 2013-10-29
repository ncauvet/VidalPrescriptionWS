
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prescriptionAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prescriptionAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescriptionLineAnalysisList" type="{urn:Vidal}ArrayOfPrescriptionLineAnalysis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionAnalysis", propOrder = {
    "prescriptionLineAnalysisList"
})
public class PrescriptionAnalysis {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrescriptionLineAnalysis prescriptionLineAnalysisList;

    /**
     * Gets the value of the prescriptionLineAnalysisList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrescriptionLineAnalysis }
     *     
     */
    public ArrayOfPrescriptionLineAnalysis getPrescriptionLineAnalysisList() {
        return prescriptionLineAnalysisList;
    }

    /**
     * Sets the value of the prescriptionLineAnalysisList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrescriptionLineAnalysis }
     *     
     */
    public void setPrescriptionLineAnalysisList(ArrayOfPrescriptionLineAnalysis value) {
        this.prescriptionLineAnalysisList = value;
    }

}
