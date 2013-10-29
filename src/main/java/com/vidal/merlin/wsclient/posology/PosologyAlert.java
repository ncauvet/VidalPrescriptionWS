
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posologyAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="posologyAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePrincipleDose" type="{urn:Vidal}detailedActivePrincipleDose"/>
 *         &lt;element name="activePrincipleDoseLimit" type="{urn:Vidal}detailedActivePrincipleDose"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndication"/>
 *         &lt;element name="duration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="durationLimit" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="frequency" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="frequencyLimit" type="{urn:Vidal}posologyFrequency"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="maxAge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minAge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfDose" type="{urn:Vidal}detailedNumberOfDose"/>
 *         &lt;element name="numberOfDoseLimit" type="{urn:Vidal}detailedNumberOfDose"/>
 *         &lt;element name="posology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restrictedGender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="type" type="{urn:Vidal}PosologyAlertType"/>
 *         &lt;element name="warnings" type="{urn:Vidal}ArrayOfWarning"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posologyAlert", propOrder = {
    "activePrincipleDose",
    "activePrincipleDoseLimit",
    "age",
    "contraIndications",
    "duration",
    "durationLimit",
    "frequency",
    "frequencyLimit",
    "gender",
    "maxAge",
    "maxWeight",
    "minAge",
    "minWeight",
    "numberOfDose",
    "numberOfDoseLimit",
    "posology",
    "restrictedGender",
    "type",
    "warnings",
    "weight"
})
public class PosologyAlert {

    @XmlElement(required = true, nillable = true)
    protected DetailedActivePrincipleDose activePrincipleDose;
    @XmlElement(required = true, nillable = true)
    protected DetailedActivePrincipleDose activePrincipleDoseLimit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float age;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndication contraIndications;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration duration;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration durationLimit;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequency;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequency frequencyLimit;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxAge;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxWeight;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minAge;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer minWeight;
    @XmlElement(required = true, nillable = true)
    protected DetailedNumberOfDose numberOfDose;
    @XmlElement(required = true, nillable = true)
    protected DetailedNumberOfDose numberOfDoseLimit;
    @XmlElement(required = true, nillable = true)
    protected String posology;
    @XmlElement(required = true, nillable = true)
    protected Gender restrictedGender;
    @XmlElement(required = true, nillable = true)
    protected PosologyAlertType type;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarning warnings;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float weight;

    /**
     * Gets the value of the activePrincipleDose property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public DetailedActivePrincipleDose getActivePrincipleDose() {
        return activePrincipleDose;
    }

    /**
     * Sets the value of the activePrincipleDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public void setActivePrincipleDose(DetailedActivePrincipleDose value) {
        this.activePrincipleDose = value;
    }

    /**
     * Gets the value of the activePrincipleDoseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public DetailedActivePrincipleDose getActivePrincipleDoseLimit() {
        return activePrincipleDoseLimit;
    }

    /**
     * Sets the value of the activePrincipleDoseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedActivePrincipleDose }
     *     
     */
    public void setActivePrincipleDoseLimit(DetailedActivePrincipleDose value) {
        this.activePrincipleDoseLimit = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAge(Float value) {
        this.age = value;
    }

    /**
     * Gets the value of the contraIndications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public ArrayOfContraIndication getContraIndications() {
        return contraIndications;
    }

    /**
     * Sets the value of the contraIndications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public void setContraIndications(ArrayOfContraIndication value) {
        this.contraIndications = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setDuration(PosologyDuration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getDurationLimit() {
        return durationLimit;
    }

    /**
     * Sets the value of the durationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setDurationLimit(PosologyDuration value) {
        this.durationLimit = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequency(PosologyFrequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the frequencyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequency }
     *     
     */
    public PosologyFrequency getFrequencyLimit() {
        return frequencyLimit;
    }

    /**
     * Sets the value of the frequencyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequency }
     *     
     */
    public void setFrequencyLimit(PosologyFrequency value) {
        this.frequencyLimit = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxAge(Float value) {
        this.maxAge = value;
    }

    /**
     * Gets the value of the maxWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets the value of the maxWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxWeight(Integer value) {
        this.maxWeight = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinAge(Float value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the minWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinWeight() {
        return minWeight;
    }

    /**
     * Sets the value of the minWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinWeight(Integer value) {
        this.minWeight = value;
    }

    /**
     * Gets the value of the numberOfDose property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public DetailedNumberOfDose getNumberOfDose() {
        return numberOfDose;
    }

    /**
     * Sets the value of the numberOfDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public void setNumberOfDose(DetailedNumberOfDose value) {
        this.numberOfDose = value;
    }

    /**
     * Gets the value of the numberOfDoseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public DetailedNumberOfDose getNumberOfDoseLimit() {
        return numberOfDoseLimit;
    }

    /**
     * Sets the value of the numberOfDoseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedNumberOfDose }
     *     
     */
    public void setNumberOfDoseLimit(DetailedNumberOfDose value) {
        this.numberOfDoseLimit = value;
    }

    /**
     * Gets the value of the posology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosology() {
        return posology;
    }

    /**
     * Sets the value of the posology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosology(String value) {
        this.posology = value;
    }

    /**
     * Gets the value of the restrictedGender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getRestrictedGender() {
        return restrictedGender;
    }

    /**
     * Sets the value of the restrictedGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setRestrictedGender(Gender value) {
        this.restrictedGender = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyAlertType }
     *     
     */
    public PosologyAlertType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyAlertType }
     *     
     */
    public void setType(PosologyAlertType value) {
        this.type = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

}
