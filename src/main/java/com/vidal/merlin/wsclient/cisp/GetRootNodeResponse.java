
package com.vidal.merlin.wsclient.cisp;

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
 *         &lt;element name="cisp" type="{urn:Vidal}cisp"/>
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
    "cisp"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Cisp cisp;

    /**
     * Gets the value of the cisp property.
     * 
     * @return
     *     possible object is
     *     {@link Cisp }
     *     
     */
    public Cisp getCisp() {
        return cisp;
    }

    /**
     * Sets the value of the cisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cisp }
     *     
     */
    public void setCisp(Cisp value) {
        this.cisp = value;
    }

}
