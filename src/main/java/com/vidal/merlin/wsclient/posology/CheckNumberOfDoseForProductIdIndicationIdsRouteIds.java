
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="administrationDividedPerTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="frequencyType" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="frequencyTypeDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="secondDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="secondDurationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="thirdDurationValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thirdDurationType" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creatinClearance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="indicationIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="routeIds" type="{urn:Vidal}ArrayOfInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productId",
    "dose",
    "unitId",
    "administrationDividedPerTimeUnit",
    "frequency",
    "frequencyType",
    "frequencyTypeDetail",
    "durationValue",
    "durationType",
    "secondDurationValue",
    "secondDurationType",
    "thirdDurationValue",
    "thirdDurationType",
    "gender",
    "age",
    "weight",
    "height",
    "creatinClearance",
    "hepaticInsufficiency",
    "indicationIds",
    "routeIds"
})
@XmlRootElement(name = "checkNumberOfDoseForProductIdIndicationIdsRouteIds")
public class CheckNumberOfDoseForProductIdIndicationIdsRouteIds {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer unitId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean administrationDividedPerTimeUnit;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double frequency;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType frequencyType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer frequencyTypeDetail;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer durationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType durationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer secondDurationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType secondDurationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer thirdDurationValue;
    @XmlElement(required = true, nillable = true)
    protected DurationType thirdDurationType;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    protected float age;
    protected float weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatinClearance;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt indicationIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt routeIds;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Gets the value of the dose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDose(Double value) {
        this.dose = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitId(Integer value) {
        this.unitId = value;
    }

    /**
     * Gets the value of the administrationDividedPerTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAdministrationDividedPerTimeUnit() {
        return administrationDividedPerTimeUnit;
    }

    /**
     * Sets the value of the administrationDividedPerTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdministrationDividedPerTimeUnit(Boolean value) {
        this.administrationDividedPerTimeUnit = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrequency(Double value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setFrequencyType(PosologyFrequencyType value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the frequencyTypeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrequencyTypeDetail() {
        return frequencyTypeDetail;
    }

    /**
     * Sets the value of the frequencyTypeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequencyTypeDetail(Integer value) {
        this.frequencyTypeDetail = value;
    }

    /**
     * Gets the value of the durationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationValue() {
        return durationValue;
    }

    /**
     * Sets the value of the durationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationValue(Integer value) {
        this.durationValue = value;
    }

    /**
     * Gets the value of the durationType property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDurationType() {
        return durationType;
    }

    /**
     * Sets the value of the durationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDurationType(DurationType value) {
        this.durationType = value;
    }

    /**
     * Gets the value of the secondDurationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondDurationValue() {
        return secondDurationValue;
    }

    /**
     * Sets the value of the secondDurationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondDurationValue(Integer value) {
        this.secondDurationValue = value;
    }

    /**
     * Gets the value of the secondDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getSecondDurationType() {
        return secondDurationType;
    }

    /**
     * Sets the value of the secondDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setSecondDurationType(DurationType value) {
        this.secondDurationType = value;
    }

    /**
     * Gets the value of the thirdDurationValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdDurationValue() {
        return thirdDurationValue;
    }

    /**
     * Sets the value of the thirdDurationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdDurationValue(Integer value) {
        this.thirdDurationValue = value;
    }

    /**
     * Gets the value of the thirdDurationType property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getThirdDurationType() {
        return thirdDurationType;
    }

    /**
     * Sets the value of the thirdDurationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setThirdDurationType(DurationType value) {
        this.thirdDurationType = value;
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
     * Gets the value of the age property.
     * 
     */
    public float getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(float value) {
        this.age = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the creatinClearance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatinClearance() {
        return creatinClearance;
    }

    /**
     * Sets the value of the creatinClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatinClearance(Integer value) {
        this.creatinClearance = value;
    }

    /**
     * Gets the value of the hepaticInsufficiency property.
     * 
     * @return
     *     possible object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public HepaticInsufficiency getHepaticInsufficiency() {
        return hepaticInsufficiency;
    }

    /**
     * Sets the value of the hepaticInsufficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public void setHepaticInsufficiency(HepaticInsufficiency value) {
        this.hepaticInsufficiency = value;
    }

    /**
     * Gets the value of the indicationIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIndicationIds() {
        return indicationIds;
    }

    /**
     * Sets the value of the indicationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIndicationIds(ArrayOfInt value) {
        this.indicationIds = value;
    }

    /**
     * Gets the value of the routeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getRouteIds() {
        return routeIds;
    }

    /**
     * Sets the value of the routeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setRouteIds(ArrayOfInt value) {
        this.routeIds = value;
    }

}
