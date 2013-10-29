
package com.vidal.merlin.wsclient.cim10;

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
 *         &lt;element name="cim10" type="{urn:Vidal}cim10"/>
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
    "cim10"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Cim10 cim10;

    /**
     * Gets the value of the cim10 property.
     * 
     * @return
     *     possible object is
     *     {@link Cim10 }
     *     
     */
    public Cim10 getCim10() {
        return cim10;
    }

    /**
     * Sets the value of the cim10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cim10 }
     *     
     */
    public void setCim10(Cim10 value) {
        this.cim10 = value;
    }

}
