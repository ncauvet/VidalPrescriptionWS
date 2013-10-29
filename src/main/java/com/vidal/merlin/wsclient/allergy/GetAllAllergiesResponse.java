
package com.vidal.merlin.wsclient.allergy;

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
 *         &lt;element name="pagedResultAllergy" type="{urn:Vidal}pagedResultAllergy"/>
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
    "pagedResultAllergy"
})
@XmlRootElement(name = "getAllAllergiesResponse")
public class GetAllAllergiesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultAllergy pagedResultAllergy;

    /**
     * Gets the value of the pagedResultAllergy property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultAllergy }
     *     
     */
    public PagedResultAllergy getPagedResultAllergy() {
        return pagedResultAllergy;
    }

    /**
     * Sets the value of the pagedResultAllergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultAllergy }
     *     
     */
    public void setPagedResultAllergy(PagedResultAllergy value) {
        this.pagedResultAllergy = value;
    }

}
