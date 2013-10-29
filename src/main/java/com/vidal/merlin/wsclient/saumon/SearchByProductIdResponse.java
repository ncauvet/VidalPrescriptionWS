
package com.vidal.merlin.wsclient.saumon;

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
 *         &lt;element name="saumonList" type="{urn:Vidal}ArrayOfSaumon"/>
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
    "saumonList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSaumon saumonList;

    /**
     * Gets the value of the saumonList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSaumon }
     *     
     */
    public ArrayOfSaumon getSaumonList() {
        return saumonList;
    }

    /**
     * Sets the value of the saumonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSaumon }
     *     
     */
    public void setSaumonList(ArrayOfSaumon value) {
        this.saumonList = value;
    }

}
