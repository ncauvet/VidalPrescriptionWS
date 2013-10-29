
package com.vidal.merlin.wsclient.packConservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageConservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageConservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conservationDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conservationDurationUnit" type="{urn:Vidal}UnitType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfConservationCaution"/>
 *         &lt;element name="unpacked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageConservation", propOrder = {
    "conservationDuration",
    "conservationDurationUnit",
    "id",
    "maxTemperature",
    "minTemperature",
    "precautions",
    "unpacked"
})
public class PackageConservation {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer conservationDuration;
    @XmlElement(required = true, nillable = true)
    protected UnitType conservationDurationUnit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxTemperature;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer minTemperature;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfConservationCaution precautions;
    protected boolean unpacked;

    /**
     * Gets the value of the conservationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConservationDuration() {
        return conservationDuration;
    }

    /**
     * Sets the value of the conservationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConservationDuration(Integer value) {
        this.conservationDuration = value;
    }

    /**
     * Gets the value of the conservationDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getConservationDurationUnit() {
        return conservationDurationUnit;
    }

    /**
     * Sets the value of the conservationDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setConservationDurationUnit(UnitType value) {
        this.conservationDurationUnit = value;
    }

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
     * Gets the value of the maxTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Sets the value of the maxTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTemperature(Integer value) {
        this.maxTemperature = value;
    }

    /**
     * Gets the value of the minTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinTemperature() {
        return minTemperature;
    }

    /**
     * Sets the value of the minTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinTemperature(Integer value) {
        this.minTemperature = value;
    }

    /**
     * Gets the value of the precautions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConservationCaution }
     *     
     */
    public ArrayOfConservationCaution getPrecautions() {
        return precautions;
    }

    /**
     * Sets the value of the precautions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConservationCaution }
     *     
     */
    public void setPrecautions(ArrayOfConservationCaution value) {
        this.precautions = value;
    }

    /**
     * Gets the value of the unpacked property.
     * 
     */
    public boolean isUnpacked() {
        return unpacked;
    }

    /**
     * Sets the value of the unpacked property.
     * 
     */
    public void setUnpacked(boolean value) {
        this.unpacked = value;
    }

}
