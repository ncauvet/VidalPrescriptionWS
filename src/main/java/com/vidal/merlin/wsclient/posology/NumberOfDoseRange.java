
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberOfDoseRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numberOfDoseRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}numberOfDose"/>
 *         &lt;element name="min" type="{urn:Vidal}numberOfDose"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberOfDoseRange", propOrder = {
    "max",
    "min"
})
public class NumberOfDoseRange {

    @XmlElement(required = true, nillable = true)
    protected NumberOfDose max;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDose min;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMax(NumberOfDose value) {
        this.max = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMin(NumberOfDose value) {
        this.min = value;
    }

}
