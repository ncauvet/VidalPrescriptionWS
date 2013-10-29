
package com.vidal.merlin.wsclient.lppr;

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
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
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
    "lppr"
})
@XmlRootElement(name = "getClassificationRootNodeResponse")
public class GetClassificationRootNodeResponse {

    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;

    /**
     * Gets the value of the lppr property.
     * 
     * @return
     *     possible object is
     *     {@link Lppr }
     *     
     */
    public Lppr getLppr() {
        return lppr;
    }

    /**
     * Sets the value of the lppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lppr }
     *     
     */
    public void setLppr(Lppr value) {
        this.lppr = value;
    }

}
