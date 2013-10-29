
package com.vidal.merlin.wsclient.product;

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
 *         &lt;element name="moleculeIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="substanceTypes" type="{urn:Vidal}ArrayOfSubstanceType"/>
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
    "moleculeIds",
    "substanceTypes"
})
@XmlRootElement(name = "searchByMoleculeIds")
public class SearchByMoleculeIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt moleculeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSubstanceType substanceTypes;

    /**
     * Gets the value of the moleculeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMoleculeIds() {
        return moleculeIds;
    }

    /**
     * Sets the value of the moleculeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMoleculeIds(ArrayOfInt value) {
        this.moleculeIds = value;
    }

    /**
     * Gets the value of the substanceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public ArrayOfSubstanceType getSubstanceTypes() {
        return substanceTypes;
    }

    /**
     * Sets the value of the substanceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubstanceType }
     *     
     */
    public void setSubstanceTypes(ArrayOfSubstanceType value) {
        this.substanceTypes = value;
    }

}
