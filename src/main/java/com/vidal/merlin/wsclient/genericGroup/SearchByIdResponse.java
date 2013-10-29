
package com.vidal.merlin.wsclient.genericGroup;

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
 *         &lt;element name="genericGroup" type="{urn:Vidal}genericGroup"/>
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
    "genericGroup"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected GenericGroup genericGroup;

    /**
     * Gets the value of the genericGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GenericGroup }
     *     
     */
    public GenericGroup getGenericGroup() {
        return genericGroup;
    }

    /**
     * Sets the value of the genericGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericGroup }
     *     
     */
    public void setGenericGroup(GenericGroup value) {
        this.genericGroup = value;
    }

}
