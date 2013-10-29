
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
 *         &lt;element name="alertsAsHTML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "alertsAsHTML"
})
@XmlRootElement(name = "getAlertsAsHTMLResponse")
public class GetAlertsAsHTMLResponse {

    @XmlElement(required = true, nillable = true)
    protected String alertsAsHTML;

    /**
     * Gets the value of the alertsAsHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertsAsHTML() {
        return alertsAsHTML;
    }

    /**
     * Sets the value of the alertsAsHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertsAsHTML(String value) {
        this.alertsAsHTML = value;
    }

}
