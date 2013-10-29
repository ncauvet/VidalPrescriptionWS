
package com.vidal.merlin.wsclient.vidal;

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
 *         &lt;element name="vidal" type="{urn:Vidal}vidal"/>
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
    "vidal"
})
@XmlRootElement(name = "getParentResponse")
public class GetParentResponse {

    @XmlElement(required = true, nillable = true)
    protected Vidal vidal;

    /**
     * Gets the value of the vidal property.
     * 
     * @return
     *     possible object is
     *     {@link Vidal }
     *     
     */
    public Vidal getVidal() {
        return vidal;
    }

    /**
     * Sets the value of the vidal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vidal }
     *     
     */
    public void setVidal(Vidal value) {
        this.vidal = value;
    }

}
