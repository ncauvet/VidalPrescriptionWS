
package com.vidal.merlin.wsclient.genericGroup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productGenericGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productGenericGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericGroup" type="{urn:Vidal}genericGroup"/>
 *         &lt;element name="mainGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "productGenericGroup", propOrder = {
    "genericGroup",
    "mainGroup",
    "product"
})
public class ProductGenericGroup {

    @XmlElement(required = true, nillable = true)
    protected GenericGroup genericGroup;
    protected boolean mainGroup;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Gets the value of the genericGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GenericGroup }
     *     
     */
    public GenericGroup getGenericGroup() {
        return genericGroup;
    }

    /**
     * Sets the value of the genericGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericGroup }
     *     
     */
    public void setGenericGroup(GenericGroup value) {
        this.genericGroup = value;
    }

    /**
     * Gets the value of the mainGroup property.
     * 
     */
    public boolean isMainGroup() {
        return mainGroup;
    }

    /**
     * Sets the value of the mainGroup property.
     * 
     */
    public void setMainGroup(boolean value) {
        this.mainGroup = value;
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
