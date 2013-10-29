
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
 *         &lt;element name="productAllergyCoupleList" type="{urn:Vidal}ArrayOfProductAllergyCouple"/>
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
    "productAllergyCoupleList"
})
@XmlRootElement(name = "getAlertsOnAllergiesClassResponse")
public class GetAlertsOnAllergiesClassResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductAllergyCouple productAllergyCoupleList;

    /**
     * Gets the value of the productAllergyCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductAllergyCouple }
     *     
     */
    public ArrayOfProductAllergyCouple getProductAllergyCoupleList() {
        return productAllergyCoupleList;
    }

    /**
     * Sets the value of the productAllergyCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductAllergyCouple }
     *     
     */
    public void setProductAllergyCoupleList(ArrayOfProductAllergyCouple value) {
        this.productAllergyCoupleList = value;
    }

}
