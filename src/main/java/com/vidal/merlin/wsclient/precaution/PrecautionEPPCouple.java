
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for precautionEPPCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="precautionEPPCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epp" type="{urn:Vidal}Epp"/>
 *         &lt;element name="precaution" type="{urn:Vidal}precaution"/>
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
@XmlType(name = "precautionEPPCouple", propOrder = {
    "epp",
    "precaution",
    "product"
})
public class PrecautionEPPCouple {

    @XmlElement(required = true, nillable = true)
    protected Epp epp;
    @XmlElement(required = true, nillable = true)
    protected Precaution precaution;
    @XmlElement(required = true, nillable = true)
    protected Product product;

    /**
     * Gets the value of the epp property.
     * 
     * @return
     *     possible object is
     *     {@link Epp }
     *     
     */
    public Epp getEpp() {
        return epp;
    }

    /**
     * Sets the value of the epp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Epp }
     *     
     */
    public void setEpp(Epp value) {
        this.epp = value;
    }

    /**
     * Gets the value of the precaution property.
     * 
     * @return
     *     possible object is
     *     {@link Precaution }
     *     
     */
    public Precaution getPrecaution() {
        return precaution;
    }

    /**
     * Sets the value of the precaution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Precaution }
     *     
     */
    public void setPrecaution(Precaution value) {
        this.precaution = value;
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
