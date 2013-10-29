
package com.vidal.merlin.wsclient.redundantInteraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redundantInteractionCommonNameGroupCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redundantInteractionCommonNameGroupCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupA" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupB" type="{urn:Vidal}commonNameGroup"/>
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
@XmlType(name = "redundantInteractionCommonNameGroupCouple", propOrder = {
    "commonNameGroupA",
    "commonNameGroupB",
    "redundantMolecule",
    "redundantMoleculeDrugA",
    "redundantMoleculeDrugB"
})
public class RedundantInteractionCommonNameGroupCouple {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupA;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupB;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMolecule;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugA;
    @XmlElement(required = true, nillable = true)
    protected Molecule redundantMoleculeDrugB;

    /**
     * Gets the value of the commonNameGroupA property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupA() {
        return commonNameGroupA;
    }

    /**
     * Sets the value of the commonNameGroupA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupA(CommonNameGroup value) {
        this.commonNameGroupA = value;
    }

    /**
     * Gets the value of the commonNameGroupB property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupB() {
        return commonNameGroupB;
    }

    /**
     * Sets the value of the commonNameGroupB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupB(CommonNameGroup value) {
        this.commonNameGroupB = value;
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
