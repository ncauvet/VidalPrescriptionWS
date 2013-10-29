
package com.vidal.merlin.wsclient.commonnamegroup;

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
 *         &lt;element name="galenicForm" type="{urn:Vidal}GalenicForm"/>
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
    "galenicForm"
})
@XmlRootElement(name = "getGalenicFormResponse")
public class GetGalenicFormResponse {

    @XmlElement(required = true, nillable = true)
    protected GalenicForm galenicForm;

    /**
     * Gets the value of the galenicForm property.
     * 
     * @return
     *     possible object is
     *     {@link GalenicForm }
     *     
     */
    public GalenicForm getGalenicForm() {
        return galenicForm;
    }

    /**
     * Sets the value of the galenicForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalenicForm }
     *     
     */
    public void setGalenicForm(GalenicForm value) {
        this.galenicForm = value;
    }

}
