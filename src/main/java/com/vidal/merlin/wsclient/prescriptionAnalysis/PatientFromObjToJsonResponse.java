
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
 *         &lt;element name="patientFromObjToJson" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "patientFromObjToJson"
})
@XmlRootElement(name = "patientFromObjToJsonResponse")
public class PatientFromObjToJsonResponse {

    @XmlElement(required = true, nillable = true)
    protected String patientFromObjToJson;

    /**
     * Gets the value of the patientFromObjToJson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFromObjToJson() {
        return patientFromObjToJson;
    }

    /**
     * Sets the value of the patientFromObjToJson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFromObjToJson(String value) {
        this.patientFromObjToJson = value;
    }

}
