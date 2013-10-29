
package com.vidal.merlin.wsclient.semp;

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
 *         &lt;element name="semp" type="{urn:Vidal}semp"/>
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
    "semp"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Semp semp;

    /**
     * Gets the value of the semp property.
     * 
     * @return
     *     possible object is
     *     {@link Semp }
     *     
     */
    public Semp getSemp() {
        return semp;
    }

    /**
     * Sets the value of the semp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Semp }
     *     
     */
    public void setSemp(Semp value) {
        this.semp = value;
    }

}
