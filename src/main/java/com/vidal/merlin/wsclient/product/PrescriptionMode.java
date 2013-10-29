
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrescriptionMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrescriptionMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryRestrictedToHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationUnit" type="{urn:Vidal}UnitType"/>
 *         &lt;element name="initiallyPrescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="initiallyPrescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedByHospital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prescribedBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="renewalBySpecialist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specialistCenterList" type="{urn:Vidal}ArrayOfSpecialistCenter"/>
 *         &lt;element name="specialistList" type="{urn:Vidal}ArrayOfSpecialist"/>
 *         &lt;element name="specificMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrescriptionMode", propOrder = {
    "deliveryRestrictedToHospital",
    "duration",
    "durationUnit",
    "initiallyPrescribedByHospital",
    "initiallyPrescribedBySpecialist",
    "prescribedByHospital",
    "prescribedBySpecialist",
    "renewalBySpecialist",
    "specialistCenterList",
    "specialistList",
    "specificMonitoring"
})
public class PrescriptionMode {

    protected boolean deliveryRestrictedToHospital;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(required = true, nillable = true)
    protected UnitType durationUnit;
    protected boolean initiallyPrescribedByHospital;
    protected boolean initiallyPrescribedBySpecialist;
    protected boolean prescribedByHospital;
    protected boolean prescribedBySpecialist;
    protected boolean renewalBySpecialist;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialistCenter specialistCenterList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSpecialist specialistList;
    protected boolean specificMonitoring;

    /**
     * Gets the value of the deliveryRestrictedToHospital property.
     * 
     */
    public boolean isDeliveryRestrictedToHospital() {
        return deliveryRestrictedToHospital;
    }

    /**
     * Sets the value of the deliveryRestrictedToHospital property.
     * 
     */
    public void setDeliveryRestrictedToHospital(boolean value) {
        this.deliveryRestrictedToHospital = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getDurationUnit() {
        return durationUnit;
    }

    /**
     * Sets the value of the durationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setDurationUnit(UnitType value) {
        this.durationUnit = value;
    }

    /**
     * Gets the value of the initiallyPrescribedByHospital property.
     * 
     */
    public boolean isInitiallyPrescribedByHospital() {
        return initiallyPrescribedByHospital;
    }

    /**
     * Sets the value of the initiallyPrescribedByHospital property.
     * 
     */
    public void setInitiallyPrescribedByHospital(boolean value) {
        this.initiallyPrescribedByHospital = value;
    }

    /**
     * Gets the value of the initiallyPrescribedBySpecialist property.
     * 
     */
    public boolean isInitiallyPrescribedBySpecialist() {
        return initiallyPrescribedBySpecialist;
    }

    /**
     * Sets the value of the initiallyPrescribedBySpecialist property.
     * 
     */
    public void setInitiallyPrescribedBySpecialist(boolean value) {
        this.initiallyPrescribedBySpecialist = value;
    }

    /**
     * Gets the value of the prescribedByHospital property.
     * 
     */
    public boolean isPrescribedByHospital() {
        return prescribedByHospital;
    }

    /**
     * Sets the value of the prescribedByHospital property.
     * 
     */
    public void setPrescribedByHospital(boolean value) {
        this.prescribedByHospital = value;
    }

    /**
     * Gets the value of the prescribedBySpecialist property.
     * 
     */
    public boolean isPrescribedBySpecialist() {
        return prescribedBySpecialist;
    }

    /**
     * Sets the value of the prescribedBySpecialist property.
     * 
     */
    public void setPrescribedBySpecialist(boolean value) {
        this.prescribedBySpecialist = value;
    }

    /**
     * Gets the value of the renewalBySpecialist property.
     * 
     */
    public boolean isRenewalBySpecialist() {
        return renewalBySpecialist;
    }

    /**
     * Sets the value of the renewalBySpecialist property.
     * 
     */
    public void setRenewalBySpecialist(boolean value) {
        this.renewalBySpecialist = value;
    }

    /**
     * Gets the value of the specialistCenterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public ArrayOfSpecialistCenter getSpecialistCenterList() {
        return specialistCenterList;
    }

    /**
     * Sets the value of the specialistCenterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialistCenter }
     *     
     */
    public void setSpecialistCenterList(ArrayOfSpecialistCenter value) {
        this.specialistCenterList = value;
    }

    /**
     * Gets the value of the specialistList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public ArrayOfSpecialist getSpecialistList() {
        return specialistList;
    }

    /**
     * Sets the value of the specialistList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialist }
     *     
     */
    public void setSpecialistList(ArrayOfSpecialist value) {
        this.specialistList = value;
    }

    /**
     * Gets the value of the specificMonitoring property.
     * 
     */
    public boolean isSpecificMonitoring() {
        return specificMonitoring;
    }

    /**
     * Sets the value of the specificMonitoring property.
     * 
     */
    public void setSpecificMonitoring(boolean value) {
        this.specificMonitoring = value;
    }

}
