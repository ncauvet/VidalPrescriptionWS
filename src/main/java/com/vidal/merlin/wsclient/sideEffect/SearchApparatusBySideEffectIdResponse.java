
package com.vidal.merlin.wsclient.sideEffect;

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
 *         &lt;element name="apparatus" type="{urn:Vidal}apparatus"/>
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
    "apparatus"
})
@XmlRootElement(name = "searchApparatusBySideEffectIdResponse")
public class SearchApparatusBySideEffectIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Apparatus apparatus;

    /**
     * Gets the value of the apparatus property.
     * 
     * @return
     *     possible object is
     *     {@link Apparatus }
     *     
     */
    public Apparatus getApparatus() {
        return apparatus;
    }

    /**
     * Sets the value of the apparatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Apparatus }
     *     
     */
    public void setApparatus(Apparatus value) {
        this.apparatus = value;
    }

}
