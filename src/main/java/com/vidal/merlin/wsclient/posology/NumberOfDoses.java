
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfDoses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="maxAbsoluteNumberOfDose" type="{urn:Vidal}numberOfDose"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *         &lt;element name="usualDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="usualNumberOfDoseRange" type="{urn:Vidal}numberOfDoseRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "absoluteDurationRange",
    "alerts",
    "maxAbsoluteNumberOfDose",
    "routes",
    "usualDurationRange",
    "usualNumberOfDoseRange"
})
public class NumberOfDoses {

    @XmlElement(required = true, nillable = true)
    protected DurationRange absoluteDurationRange;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDose maxAbsoluteNumberOfDose;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;
    @XmlElement(required = true, nillable = true)
    protected DurationRange usualDurationRange;
    @XmlElement(required = true, nillable = true)
    protected NumberOfDoseRange usualNumberOfDoseRange;

    /**
     * Gets the value of the absoluteDurationRange property.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getAbsoluteDurationRange() {
        return absoluteDurationRange;
    }

    /**
     * Sets the value of the absoluteDurationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setAbsoluteDurationRange(DurationRange value) {
        this.absoluteDurationRange = value;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public ArrayOfSimplePosologyAlert getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimplePosologyAlert }
     *     
     */
    public void setAlerts(ArrayOfSimplePosologyAlert value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the maxAbsoluteNumberOfDose property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDose }
     *     
     */
    public NumberOfDose getMaxAbsoluteNumberOfDose() {
        return maxAbsoluteNumberOfDose;
    }

    /**
     * Sets the value of the maxAbsoluteNumberOfDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDose }
     *     
     */
    public void setMaxAbsoluteNumberOfDose(NumberOfDose value) {
        this.maxAbsoluteNumberOfDose = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRoutes(ArrayOfRoute value) {
        this.routes = value;
    }

    /**
     * Gets the value of the usualDurationRange property.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getUsualDurationRange() {
        return usualDurationRange;
    }

    /**
     * Sets the value of the usualDurationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setUsualDurationRange(DurationRange value) {
        this.usualDurationRange = value;
    }

    /**
     * Gets the value of the usualNumberOfDoseRange property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfDoseRange }
     *     
     */
    public NumberOfDoseRange getUsualNumberOfDoseRange() {
        return usualNumberOfDoseRange;
    }

    /**
     * Sets the value of the usualNumberOfDoseRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfDoseRange }
     *     
     */
    public void setUsualNumberOfDoseRange(NumberOfDoseRange value) {
        this.usualNumberOfDoseRange = value;
    }

}
