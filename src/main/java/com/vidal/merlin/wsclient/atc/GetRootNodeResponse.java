
package com.vidal.merlin.wsclient.atc;

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
 *         &lt;element name="atc" type="{urn:Vidal}atc"/>
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
    "atc"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Atc atc;

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Atc }
     *     
     */
    public Atc getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atc }
     *     
     */
    public void setAtc(Atc value) {
        this.atc = value;
    }

}
