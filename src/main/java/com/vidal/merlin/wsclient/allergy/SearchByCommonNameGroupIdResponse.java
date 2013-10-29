
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
 *         &lt;element name="allergyList" type="{urn:Vidal}CommonNameGroupAllergyList"/>
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
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupAllergyList allergyList;

    /**
     * Gets the value of the allergyList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupAllergyList }
     *     
     */
    public CommonNameGroupAllergyList getAllergyList() {
        return allergyList;
    }

    /**
     * Sets the value of the allergyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupAllergyList }
     *     
     */
    public void setAllergyList(CommonNameGroupAllergyList value) {
        this.allergyList = value;
    }

}
