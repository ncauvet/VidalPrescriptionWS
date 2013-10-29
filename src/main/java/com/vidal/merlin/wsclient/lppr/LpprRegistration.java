
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lpprRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lpprRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpprExpiryDate" type="{urn:Vidal}lpprExpiryDate"/>
 *         &lt;element name="lpprRegistrationDate" type="{urn:Vidal}lpprRegistrationDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprRegistration", propOrder = {
    "lpprExpiryDate",
    "lpprRegistrationDate"
})
public class LpprRegistration {

    @XmlElement(required = true, nillable = true)
    protected LpprExpiryDate lpprExpiryDate;
    @XmlElement(required = true, nillable = true)
    protected LpprRegistrationDate lpprRegistrationDate;

    /**
     * Gets the value of the lpprExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link LpprExpiryDate }
     *     
     */
    public LpprExpiryDate getLpprExpiryDate() {
        return lpprExpiryDate;
    }

    /**
     * Sets the value of the lpprExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprExpiryDate }
     *     
     */
    public void setLpprExpiryDate(LpprExpiryDate value) {
        this.lpprExpiryDate = value;
    }

    /**
     * Gets the value of the lpprRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link LpprRegistrationDate }
     *     
     */
    public LpprRegistrationDate getLpprRegistrationDate() {
        return lpprRegistrationDate;
    }

    /**
     * Sets the value of the lpprRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprRegistrationDate }
     *     
     */
    public void setLpprRegistrationDate(LpprRegistrationDate value) {
        this.lpprRegistrationDate = value;
    }

}
