
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupAllergyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupAllergyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergies" type="{urn:Vidal}ArrayOfAllergy"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupAllergyList", propOrder = {
    "allergies",
    "homogeneous"
})
public class CommonNameGroupAllergyList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergy allergies;
    protected boolean homogeneous;

    /**
     * Gets the value of the allergies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public ArrayOfAllergy getAllergies() {
        return allergies;
    }

    /**
     * Sets the value of the allergies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public void setAllergies(ArrayOfAllergy value) {
        this.allergies = value;
    }

    /**
     * Gets the value of the homogeneous property.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

}
