
package com.vidal.merlin.wsclient.product;

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
 *         &lt;element name="prescriptionMode" type="{urn:Vidal}PrescriptionMode"/>
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
    "prescriptionMode"
})
@XmlRootElement(name = "getPrescriptionModeResponse")
public class GetPrescriptionModeResponse {

    @XmlElement(required = true, nillable = true)
    protected PrescriptionMode prescriptionMode;

    /**
     * Gets the value of the prescriptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionMode }
     *     
     */
    public PrescriptionMode getPrescriptionMode() {
        return prescriptionMode;
    }

    /**
     * Sets the value of the prescriptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionMode }
     *     
     */
    public void setPrescriptionMode(PrescriptionMode value) {
        this.prescriptionMode = value;
    }

}
