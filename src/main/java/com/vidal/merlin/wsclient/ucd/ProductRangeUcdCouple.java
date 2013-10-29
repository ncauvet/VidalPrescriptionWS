
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productRangeUcdCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productRangeUcdCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRange" type="{urn:Vidal}productRange"/>
 *         &lt;element name="ucd" type="{urn:Vidal}ucd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRangeUcdCouple", propOrder = {
    "productRange",
    "ucd"
})
public class ProductRangeUcdCouple {

    @XmlElement(required = true, nillable = true)
    protected ProductRange productRange;
    @XmlElement(required = true, nillable = true)
    protected Ucd ucd;

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

    /**
     * Gets the value of the ucd property.
     * 
     * @return
     *     possible object is
     *     {@link Ucd }
     *     
     */
    public Ucd getUcd() {
        return ucd;
    }

    /**
     * Sets the value of the ucd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucd }
     *     
     */
    public void setUcd(Ucd value) {
        this.ucd = value;
    }

}
