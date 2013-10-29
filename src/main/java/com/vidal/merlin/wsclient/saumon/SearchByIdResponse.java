
package com.vidal.merlin.wsclient.saumon;

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
 *         &lt;element name="saumon" type="{urn:Vidal}saumon"/>
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
    "saumon"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Saumon saumon;

    /**
     * Gets the value of the saumon property.
     * 
     * @return
     *     possible object is
     *     {@link Saumon }
     *     
     */
    public Saumon getSaumon() {
        return saumon;
    }

    /**
     * Sets the value of the saumon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Saumon }
     *     
     */
    public void setSaumon(Saumon value) {
        this.saumon = value;
    }

}
