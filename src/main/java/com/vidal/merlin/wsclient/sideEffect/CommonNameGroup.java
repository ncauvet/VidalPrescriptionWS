
package com.vidal.merlin.wsclient.sideEffect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonNameGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notHomogeneousByInteractions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroup", propOrder = {
    "id",
    "maxUcdRangePrice",
    "minUcdRangePrice",
    "name",
    "notHomogeneousByInteractions"
})
public class CommonNameGroup {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxUcdRangePrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean notHomogeneousByInteractions;

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
     * Gets the value of the maxUcdRangePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxUcdRangePrice() {
        return maxUcdRangePrice;
    }

    /**
     * Sets the value of the maxUcdRangePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxUcdRangePrice(Float value) {
        this.maxUcdRangePrice = value;
    }

    /**
     * Gets the value of the minUcdRangePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinUcdRangePrice() {
        return minUcdRangePrice;
    }

    /**
     * Sets the value of the minUcdRangePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinUcdRangePrice(Float value) {
        this.minUcdRangePrice = value;
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
     * Gets the value of the notHomogeneousByInteractions property.
     * 
     */
    public boolean isNotHomogeneousByInteractions() {
        return notHomogeneousByInteractions;
    }

    /**
     * Sets the value of the notHomogeneousByInteractions property.
     * 
     */
    public void setNotHomogeneousByInteractions(boolean value) {
        this.notHomogeneousByInteractions = value;
    }

}
