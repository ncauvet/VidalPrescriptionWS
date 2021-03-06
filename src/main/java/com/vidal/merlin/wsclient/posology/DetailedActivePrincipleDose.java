
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedActivePrincipleDose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedActivePrincipleDose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequencyType" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="unit" type="{urn:Vidal}DoseUnit"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailedActivePrincipleDose", propOrder = {
    "frequencyType",
    "unit",
    "value"
})
public class DetailedActivePrincipleDose {

    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequencyType;
    @XmlElement(required = true, nillable = true)
    protected DoseUnit unit;
    protected double value;

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequencyType(PosologyFrequency value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link DoseUnit }
     *     
     */
    public DoseUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseUnit }
     *     
     */
    public void setUnit(DoseUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
