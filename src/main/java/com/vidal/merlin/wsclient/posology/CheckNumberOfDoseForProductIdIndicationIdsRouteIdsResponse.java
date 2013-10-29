
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
 *         &lt;element name="posologyAlertList" type="{urn:Vidal}ArrayOfPosologyAlert"/>
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
    "posologyAlertList"
})
@XmlRootElement(name = "checkNumberOfDoseForProductIdIndicationIdsRouteIdsResponse")
public class CheckNumberOfDoseForProductIdIndicationIdsRouteIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyAlert posologyAlertList;

    /**
     * Gets the value of the posologyAlertList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public ArrayOfPosologyAlert getPosologyAlertList() {
        return posologyAlertList;
    }

    /**
     * Sets the value of the posologyAlertList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyAlert }
     *     
     */
    public void setPosologyAlertList(ArrayOfPosologyAlert value) {
        this.posologyAlertList = value;
    }

}
