
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosologyAlerts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosologyAlerts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="missingParamaterMessage" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="posologyText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosologyAlerts", propOrder = {
    "alerts",
    "missingParamaterMessage",
    "posologyText"
})
public class PosologyAlerts {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage missingParamaterMessage;
    @XmlElement(required = true, nillable = true)
    protected String posologyText;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public ArrayOfSimplePosologyAlert getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public void setAlerts(ArrayOfSimplePosologyAlert value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the missingParamaterMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMissingParamaterMessage() {
        return missingParamaterMessage;
    }

    /**
     * Sets the value of the missingParamaterMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMissingParamaterMessage(ArrayOfMessage value) {
        this.missingParamaterMessage = value;
    }

    /**
     * Gets the value of the posologyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosologyText() {
        return posologyText;
    }

    /**
     * Sets the value of the posologyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosologyText(String value) {
        this.posologyText = value;
    }

}
