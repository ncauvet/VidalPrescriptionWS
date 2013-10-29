
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
 *         &lt;element name="prescriptionLineFromObjToJson" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "prescriptionLineFromObjToJson"
})
@XmlRootElement(name = "prescriptionLineFromObjToJsonResponse")
public class PrescriptionLineFromObjToJsonResponse {

    @XmlElement(required = true, nillable = true)
    protected String prescriptionLineFromObjToJson;

    /**
     * Gets the value of the prescriptionLineFromObjToJson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionLineFromObjToJson() {
        return prescriptionLineFromObjToJson;
    }

    /**
     * Sets the value of the prescriptionLineFromObjToJson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionLineFromObjToJson(String value) {
        this.prescriptionLineFromObjToJson = value;
    }

}
