
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
 *         &lt;element name="commonNameGroupMoleculeCouples" type="{urn:Vidal}commonNameGroupMoleculeCouples"/>
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
    "commonNameGroupMoleculeCouples"
})
@XmlRootElement(name = "searchCommonNameGroupAllergyMoleculeAlertsResponse")
public class SearchCommonNameGroupAllergyMoleculeAlertsResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupMoleculeCouples commonNameGroupMoleculeCouples;

    /**
     * Gets the value of the commonNameGroupMoleculeCouples property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupMoleculeCouples }
     *     
     */
    public CommonNameGroupMoleculeCouples getCommonNameGroupMoleculeCouples() {
        return commonNameGroupMoleculeCouples;
    }

    /**
     * Sets the value of the commonNameGroupMoleculeCouples property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupMoleculeCouples }
     *     
     */
    public void setCommonNameGroupMoleculeCouples(CommonNameGroupMoleculeCouples value) {
        this.commonNameGroupMoleculeCouples = value;
    }

}
