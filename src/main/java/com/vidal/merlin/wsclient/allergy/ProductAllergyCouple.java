
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productAllergyCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productAllergyCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergy" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyLinked" type="{urn:Vidal}allergy"/>
 *         &lt;element name="allergyPatient" type="{urn:Vidal}allergy"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="molecule" type="{urn:Vidal}molecule"/>
 *         &lt;element name="product" type="{urn:Vidal}product"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productAllergyCouple", propOrder = {
    "allergy",
    "allergyLinked",
    "allergyPatient",
    "id",
    "molecule",
    "product"
})
public class ProductAllergyCouple {

    @XmlElement(required = true, nillable = true)
    protected Allergy allergy;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyLinked;
    @XmlElement(required = true, nillable = true)
    protected Allergy allergyPatient;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected Molecule molecule;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Gets the value of the allergy property.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergy() {
        return allergy;
    }

    /**
     * Sets the value of the allergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergy(Allergy value) {
        this.allergy = value;
    }

    /**
     * Gets the value of the allergyLinked property.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergyLinked() {
        return allergyLinked;
    }

    /**
     * Sets the value of the allergyLinked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergyLinked(Allergy value) {
        this.allergyLinked = value;
    }

    /**
     * Gets the value of the allergyPatient property.
     * 
     * @return
     *     possible object is
     *     {@link Allergy }
     *     
     */
    public Allergy getAllergyPatient() {
        return allergyPatient;
    }

    /**
     * Sets the value of the allergyPatient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allergy }
     *     
     */
    public void setAllergyPatient(Allergy value) {
        this.allergyPatient = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

}
