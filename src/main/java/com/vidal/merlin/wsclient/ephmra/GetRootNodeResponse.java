
package com.vidal.merlin.wsclient.ephmra;

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
 *         &lt;element name="ephmra" type="{urn:Vidal}ephmra"/>
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
    "ephmra"
})
@XmlRootElement(name = "getRootNodeResponse")
public class GetRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Ephmra ephmra;

    /**
     * Gets the value of the ephmra property.
     * 
     * @return
     *     possible object is
     *     {@link Ephmra }
     *     
     */
    public Ephmra getEphmra() {
        return ephmra;
    }

    /**
     * Sets the value of the ephmra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ephmra }
     *     
     */
    public void setEphmra(Ephmra value) {
        this.ephmra = value;
    }

}
