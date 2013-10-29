
package com.vidal.merlin.wsclient.posology;

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
 *         &lt;element name="posologyAlerts" type="{urn:Vidal}PosologyAlerts"/>
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
    "posologyAlerts"
})
@XmlRootElement(name = "checkDailyActivePrincipleDoseByProductIdResponse")
public class CheckDailyActivePrincipleDoseByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected PosologyAlerts posologyAlerts;

    /**
     * Gets the value of the posologyAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyAlerts }
     *     
     */
    public PosologyAlerts getPosologyAlerts() {
        return posologyAlerts;
    }

    /**
     * Sets the value of the posologyAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyAlerts }
     *     
     */
    public void setPosologyAlerts(PosologyAlerts value) {
        this.posologyAlerts = value;
    }

}
