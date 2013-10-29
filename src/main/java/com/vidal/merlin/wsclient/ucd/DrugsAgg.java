
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drugsAgg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="drugsAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroups" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *         &lt;element name="packs" type="{urn:Vidal}ArrayOfPack"/>
 *         &lt;element name="products" type="{urn:Vidal}ArrayOfProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drugsAgg", propOrder = {
    "commonNameGroups",
    "packs",
    "products"
})
public class DrugsAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup commonNameGroups;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPack packs;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct products;

    /**
     * Gets the value of the commonNameGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getCommonNameGroups() {
        return commonNameGroups;
    }

    /**
     * Sets the value of the commonNameGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setCommonNameGroups(ArrayOfCommonNameGroup value) {
        this.commonNameGroups = value;
    }

    /**
     * Gets the value of the packs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPack }
     *     
     */
    public ArrayOfPack getPacks() {
        return packs;
    }

    /**
     * Sets the value of the packs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPack }
     *     
     */
    public void setPacks(ArrayOfPack value) {
        this.packs = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setProducts(ArrayOfProduct value) {
        this.products = value;
    }

}
