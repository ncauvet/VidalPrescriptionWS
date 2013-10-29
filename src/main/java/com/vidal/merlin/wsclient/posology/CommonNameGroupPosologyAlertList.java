
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupPosologyAlertList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPosologyAlertList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="posologyAlerts" type="{urn:Vidal}ArrayOfPosologyAlert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPosologyAlertList", propOrder = {
    "homogeneous",
    "posologyAlerts"
})
public class CommonNameGroupPosologyAlertList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyAlert posologyAlerts;

    /**
     * Gets the value of the homogeneous property.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

    /**
     * Gets the value of the posologyAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public ArrayOfPosologyAlert getPosologyAlerts() {
        return posologyAlerts;
    }

    /**
     * Sets the value of the posologyAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public void setPosologyAlerts(ArrayOfPosologyAlert value) {
        this.posologyAlerts = value;
    }

}
