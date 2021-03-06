
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
 *         &lt;element name="patient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prescriptionLineList" type="{urn:Vidal}ArrayOfString"/>
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
    "patient",
    "prescriptionLineList"
})
@XmlRootElement(name = "getAlertsAsHTML")
public class GetAlertsAsHTML {

    @XmlElement(required = true, nillable = true)
    protected String patient;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString prescriptionLineList;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatient(String value) {
        this.patient = value;
    }

    /**
     * Gets the value of the prescriptionLineList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrescriptionLineList() {
        return prescriptionLineList;
    }

    /**
     * Sets the value of the prescriptionLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrescriptionLineList(ArrayOfString value) {
        this.prescriptionLineList = value;
    }

}
