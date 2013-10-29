
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
 *         &lt;element name="commonNameGroupAllergyCouples" type="{urn:Vidal}commonNameGroupAllergyCouples"/>
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
    "commonNameGroupAllergyCouples"
})
@XmlRootElement(name = "searchCommonNameGroupAllergyClassAlertsResponse")
public class SearchCommonNameGroupAllergyClassAlertsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupAllergyCouples commonNameGroupAllergyCouples;

    /**
     * Gets the value of the commonNameGroupAllergyCouples property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupAllergyCouples }
     *     
     */
    public CommonNameGroupAllergyCouples getCommonNameGroupAllergyCouples() {
        return commonNameGroupAllergyCouples;
    }

    /**
     * Sets the value of the commonNameGroupAllergyCouples property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupAllergyCouples }
     *     
     */
    public void setCommonNameGroupAllergyCouples(CommonNameGroupAllergyCouples value) {
        this.commonNameGroupAllergyCouples = value;
    }

}
