
package com.vidal.merlin.wsclient.ald;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productAldAtcListCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productAldAtcListCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aldAtcList" type="{urn:Vidal}ArrayOfAldAtc"/>
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
@XmlType(name = "productAldAtcListCouple", propOrder = {
    "aldAtcList",
    "product"
})
public class ProductAldAtcListCouple {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAldAtc aldAtcList;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Gets the value of the aldAtcList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAldAtc }
     *     
     */
    public ArrayOfAldAtc getAldAtcList() {
        return aldAtcList;
    }

    /**
     * Sets the value of the aldAtcList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAldAtc }
     *     
     */
    public void setAldAtcList(ArrayOfAldAtc value) {
        this.aldAtcList = value;
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
