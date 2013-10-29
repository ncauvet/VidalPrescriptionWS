
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prescriptionLineAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prescriptionLineAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertList" type="{urn:Vidal}ArrayOfAlert"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="drug" type="{urn:Vidal}summarizedDrug"/>
 *         &lt;element name="dur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="durUnit" type="{urn:Vidal}DurationType"/>
 *         &lt;element name="posologyFrequency" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionLineAnalysis", propOrder = {
    "alertList",
    "dose",
    "drug",
    "dur",
    "durUnit",
    "posologyFrequency",
    "unit"
})
public class PrescriptionLineAnalysis {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAlert alertList;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double dose;
    @XmlElement(required = true, nillable = true)
    protected SummarizedDrug drug;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dur;
    @XmlElement(required = true, nillable = true)
    protected DurationType durUnit;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType posologyFrequency;
    @XmlElement(required = true, nillable = true)
    protected String unit;

    /**
     * Gets the value of the alertList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlert }
     *     
     */
    public ArrayOfAlert getAlertList() {
        return alertList;
    }

    /**
     * Sets the value of the alertList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlert }
     *     
     */
    public void setAlertList(ArrayOfAlert value) {
        this.alertList = value;
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
     * Gets the value of the drug property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedDrug }
     *     
     */
    public SummarizedDrug getDrug() {
        return drug;
    }

    /**
     * Sets the value of the drug property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedDrug }
     *     
     */
    public void setDrug(SummarizedDrug value) {
        this.drug = value;
    }

    /**
     * Gets the value of the dur property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDur(Integer value) {
        this.dur = value;
    }

    /**
     * Gets the value of the durUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDurUnit() {
        return durUnit;
    }

    /**
     * Sets the value of the durUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDurUnit(DurationType value) {
        this.durUnit = value;
    }

    /**
     * Gets the value of the posologyFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getPosologyFrequency() {
        return posologyFrequency;
    }

    /**
     * Sets the value of the posologyFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setPosologyFrequency(PosologyFrequencyType value) {
        this.posologyFrequency = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
