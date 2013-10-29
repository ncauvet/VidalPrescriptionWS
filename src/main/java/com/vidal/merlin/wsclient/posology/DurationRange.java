
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for durationRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="durationRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="min" type="{urn:Vidal}PosologyDuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "durationRange", propOrder = {
    "max",
    "min"
})
public class DurationRange {

    @XmlElement(required = true, nillable = true)
    protected PosologyDuration max;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration min;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setMax(PosologyDuration value) {
        this.max = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setMin(PosologyDuration value) {
        this.min = value;
    }

}
