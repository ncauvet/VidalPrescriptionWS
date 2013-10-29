
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivePrincipleDoses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivePrincipleDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="absoluteDurationRange" type="{urn:Vidal}durationRange"/>
 *         &lt;element name="alerts" type="{urn:Vidal}ArrayOfSimplePosologyAlert"/>
 *         &lt;element name="maxAbsoluteActivePrincipleDose" type="{urn:Vidal}activePrincipleDose"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *         &lt;element name="usualActivePrincipleDoseRange" type="{urn:Vidal}activePrincipleDoseRange"/>
 *         &lt;element name="usualDurationRange" type="{urn:Vidal}durationRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivePrincipleDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "absoluteDurationRange",
    "alerts",
    "maxAbsoluteActivePrincipleDose",
    "routes",
    "usualActivePrincipleDoseRange",
    "usualDurationRange"
})
public class ActivePrincipleDoses {

    @XmlElement(required = true, nillable = true)
    protected DurationRange absoluteDurationRange;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSimplePosologyAlert alerts;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose maxAbsoluteActivePrincipleDose;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDoseRange usualActivePrincipleDoseRange;
    @XmlElement(required = true, nillable = true)
    protected DurationRange usualDurationRange;

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
     * Gets the value of the maxAbsoluteActivePrincipleDose property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMaxAbsoluteActivePrincipleDose() {
        return maxAbsoluteActivePrincipleDose;
    }

    /**
     * Sets the value of the maxAbsoluteActivePrincipleDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMaxAbsoluteActivePrincipleDose(ActivePrincipleDose value) {
        this.maxAbsoluteActivePrincipleDose = value;
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
     * Gets the value of the usualActivePrincipleDoseRange property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDoseRange }
     *     
     */
    public ActivePrincipleDoseRange getUsualActivePrincipleDoseRange() {
        return usualActivePrincipleDoseRange;
    }

    /**
     * Sets the value of the usualActivePrincipleDoseRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDoseRange }
     *     
     */
    public void setUsualActivePrincipleDoseRange(ActivePrincipleDoseRange value) {
        this.usualActivePrincipleDoseRange = value;
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

}
