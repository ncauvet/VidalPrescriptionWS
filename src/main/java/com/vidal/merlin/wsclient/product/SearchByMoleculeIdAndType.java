
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
 *         &lt;element name="moleculeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="substanceType" type="{urn:Vidal}SubstanceType"/>
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
    "moleculeId",
    "substanceType"
})
@XmlRootElement(name = "searchByMoleculeIdAndType")
public class SearchByMoleculeIdAndType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer moleculeId;
    @XmlElement(required = true, nillable = true)
    protected SubstanceType substanceType;

    /**
     * Gets the value of the moleculeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoleculeId() {
        return moleculeId;
    }

    /**
     * Sets the value of the moleculeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoleculeId(Integer value) {
        this.moleculeId = value;
    }

    /**
     * Gets the value of the substanceType property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceType }
     *     
     */
    public SubstanceType getSubstanceType() {
        return substanceType;
    }

    /**
     * Sets the value of the substanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceType }
     *     
     */
    public void setSubstanceType(SubstanceType value) {
        this.substanceType = value;
    }

}
