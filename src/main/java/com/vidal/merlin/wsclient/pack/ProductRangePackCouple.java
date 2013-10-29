
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productRangePackCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productRangePackCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
 *         &lt;element name="productRange" type="{urn:Vidal}productRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRangePackCouple", propOrder = {
    "pack",
    "productRange"
})
public class ProductRangePackCouple {

    @XmlElement(required = true, nillable = true)
    protected Pack pack;
    @XmlElement(required = true, nillable = true)
    protected ProductRange productRange;

    /**
     * Gets the value of the pack property.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

    /**
     * Gets the value of the productRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRange }
     *     
     */
    public ProductRange getProductRange() {
        return productRange;
    }

    /**
     * Sets the value of the productRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRange }
     *     
     */
    public void setProductRange(ProductRange value) {
        this.productRange = value;
    }

}
