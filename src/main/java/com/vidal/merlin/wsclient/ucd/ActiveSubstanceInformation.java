
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activeSubstanceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activeSubstanceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concentrationUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="concentrationValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="quantityUnit" type="{urn:Vidal}posologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activeSubstanceInformation", propOrder = {
    "concentrationUnit",
    "concentrationValue",
    "molecule",
    "quantity",
    "quantityUnit"
})
public class ActiveSubstanceInformation {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit concentrationUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float concentrationValue;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float quantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit quantityUnit;

    /**
     * Gets the value of the concentrationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getConcentrationUnit() {
        return concentrationUnit;
    }

    /**
     * Sets the value of the concentrationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setConcentrationUnit(PosologyUnit value) {
        this.concentrationUnit = value;
    }

    /**
     * Gets the value of the concentrationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConcentrationValue() {
        return concentrationValue;
    }

    /**
     * Sets the value of the concentrationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConcentrationValue(Float value) {
        this.concentrationValue = value;
    }

    /**
     * Gets the value of the molecule property.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getMolecule() {
        return molecule;
    }

    /**
     * Sets the value of the molecule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setMolecule(Molecule value) {
        this.molecule = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Sets the value of the quantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setQuantityUnit(PosologyUnit value) {
        this.quantityUnit = value;
    }

}
