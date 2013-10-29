
package com.vidal.merlin.wsclient.redundantInteraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for molecule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="molecule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="homeopathy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="role" type="{urn:Vidal}SubstanceRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "molecule", propOrder = {
    "allergyAlert",
    "homeopathy",
    "id",
    "name",
    "role"
})
public class Molecule {

    protected boolean allergyAlert;
    protected boolean homeopathy;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected SubstanceRole role;

    /**
     * Gets the value of the allergyAlert property.
     * 
     */
    public boolean isAllergyAlert() {
        return allergyAlert;
    }

    /**
     * Sets the value of the allergyAlert property.
     * 
     */
    public void setAllergyAlert(boolean value) {
        this.allergyAlert = value;
    }

    /**
     * Gets the value of the homeopathy property.
     * 
     */
    public boolean isHomeopathy() {
        return homeopathy;
    }

    /**
     * Sets the value of the homeopathy property.
     * 
     */
    public void setHomeopathy(boolean value) {
        this.homeopathy = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceRole }
     *     
     */
    public SubstanceRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceRole }
     *     
     */
    public void setRole(SubstanceRole value) {
        this.role = value;
    }

}
