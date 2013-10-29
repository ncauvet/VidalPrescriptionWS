
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
 *         &lt;element name="commonNameGroupAllergyCoupleList" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
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
    "commonNameGroupAllergyCoupleList"
})
@XmlRootElement(name = "getAlertsOnCommonNameGroupActivePrincipleAllergiesClassResponse")
public class GetAlertsOnCommonNameGroupActivePrincipleAllergiesClassResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple commonNameGroupAllergyCoupleList;

    /**
     * Gets the value of the commonNameGroupAllergyCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getCommonNameGroupAllergyCoupleList() {
        return commonNameGroupAllergyCoupleList;
    }

    /**
     * Sets the value of the commonNameGroupAllergyCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setCommonNameGroupAllergyCoupleList(ArrayOfCommonNameGroupAllergyCouple value) {
        this.commonNameGroupAllergyCoupleList = value;
    }

}
