
package com.vidal.merlin.wsclient.redundantInteraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redundantInteractionCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redundantInteractionCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productA" type="{urn:Vidal}product"/>
 *         &lt;element name="productB" type="{urn:Vidal}product"/>
 *         &lt;element name="redundantMolecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="redundantMoleculeDrugA" type="{urn:Vidal}molecule"/>
 *         &lt;element name="redundantMoleculeDrugB" type="{urn:Vidal}molecule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redundantInteractionCouple", propOrder = {
    "productA",
    "productB",
    "redundantMolecule",
    "redundantMoleculeDrugA",
    "redundantMoleculeDrugB"
})
public class RedundantInteractionCouple {

    @XmlElement(required = true, nillable = true)
    protected Product productA;
    @XmlElement(required = true, nillable = true)
    protected Product productB;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMolecule;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugA;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugB;

    /**
     * Gets the value of the productA property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductA() {
        return productA;
    }

    /**
     * Sets the value of the productA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductA(Product value) {
        this.productA = value;
    }

    /**
     * Gets the value of the productB property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductB() {
        return productB;
    }

    /**
     * Sets the value of the productB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductB(Product value) {
        this.productB = value;
    }

    /**
     * Gets the value of the redundantMolecule property.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMolecule() {
        return redundantMolecule;
    }

    /**
     * Sets the value of the redundantMolecule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMolecule(Molecule value) {
        this.redundantMolecule = value;
    }

    /**
     * Gets the value of the redundantMoleculeDrugA property.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMoleculeDrugA() {
        return redundantMoleculeDrugA;
    }

    /**
     * Sets the value of the redundantMoleculeDrugA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMoleculeDrugA(Molecule value) {
        this.redundantMoleculeDrugA = value;
    }

    /**
     * Gets the value of the redundantMoleculeDrugB property.
     * 
     * @return
     *     possible object is
     *     {@link Molecule }
     *     
     */
    public Molecule getRedundantMoleculeDrugB() {
        return redundantMoleculeDrugB;
    }

    /**
     * Sets the value of the redundantMoleculeDrugB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Molecule }
     *     
     */
    public void setRedundantMoleculeDrugB(Molecule value) {
        this.redundantMoleculeDrugB = value;
    }

}
