
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
 *         &lt;element name="allergyList" type="{urn:Vidal}ArrayOfAllergy"/>
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
    "allergyList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergy allergyList;

    /**
     * Gets the value of the allergyList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public ArrayOfAllergy getAllergyList() {
        return allergyList;
    }

    /**
     * Sets the value of the allergyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public void setAllergyList(ArrayOfAllergy value) {
        this.allergyList = value;
    }

}
