
package com.vidal.merlin.wsclient.sfmg;

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
 *         &lt;element name="sfmg" type="{urn:Vidal}sfmg"/>
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
    "sfmg"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected Sfmg sfmg;

    /**
     * Gets the value of the sfmg property.
     * 
     * @return
     *     possible object is
     *     {@link Sfmg }
     *     
     */
    public Sfmg getSfmg() {
        return sfmg;
    }

    /**
     * Sets the value of the sfmg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sfmg }
     *     
     */
    public void setSfmg(Sfmg value) {
        this.sfmg = value;
    }

}
