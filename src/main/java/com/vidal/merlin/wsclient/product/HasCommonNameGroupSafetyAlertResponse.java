
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
 *         &lt;element name="safetyAlertStatus" type="{urn:Vidal}SafetyAlertStatus"/>
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
    "safetyAlertStatus"
})
@XmlRootElement(name = "hasCommonNameGroupSafetyAlertResponse")
public class HasCommonNameGroupSafetyAlertResponse {

    @XmlElement(required = true, nillable = true)
    protected SafetyAlertStatus safetyAlertStatus;

    /**
     * Gets the value of the safetyAlertStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SafetyAlertStatus }
     *     
     */
    public SafetyAlertStatus getSafetyAlertStatus() {
        return safetyAlertStatus;
    }

    /**
     * Sets the value of the safetyAlertStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyAlertStatus }
     *     
     */
    public void setSafetyAlertStatus(SafetyAlertStatus value) {
        this.safetyAlertStatus = value;
    }

}
