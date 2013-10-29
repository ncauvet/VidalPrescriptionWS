
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prescriptionCostAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prescriptionCostAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evaluatedPrescriptionLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ignoredPrescriptionLineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prescriptionLineCostList" type="{urn:Vidal}ArrayOfPrescriptionLineCost"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prescriptionCostAnalysis", propOrder = {
    "evaluatedPrescriptionLineCount",
    "ignoredPrescriptionLineCount",
    "maxPrice",
    "minPrice",
    "prescriptionLineCostList"
})
public class PrescriptionCostAnalysis {

    protected int evaluatedPrescriptionLineCount;
    protected int ignoredPrescriptionLineCount;
    protected float maxPrice;
    protected float minPrice;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrescriptionLineCost prescriptionLineCostList;

    /**
     * Gets the value of the evaluatedPrescriptionLineCount property.
     * 
     */
    public int getEvaluatedPrescriptionLineCount() {
        return evaluatedPrescriptionLineCount;
    }

    /**
     * Sets the value of the evaluatedPrescriptionLineCount property.
     * 
     */
    public void setEvaluatedPrescriptionLineCount(int value) {
        this.evaluatedPrescriptionLineCount = value;
    }

    /**
     * Gets the value of the ignoredPrescriptionLineCount property.
     * 
     */
    public int getIgnoredPrescriptionLineCount() {
        return ignoredPrescriptionLineCount;
    }

    /**
     * Sets the value of the ignoredPrescriptionLineCount property.
     * 
     */
    public void setIgnoredPrescriptionLineCount(int value) {
        this.ignoredPrescriptionLineCount = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     */
    public float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     */
    public void setMaxPrice(float value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     */
    public float getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     */
    public void setMinPrice(float value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the prescriptionLineCostList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrescriptionLineCost }
     *     
     */
    public ArrayOfPrescriptionLineCost getPrescriptionLineCostList() {
        return prescriptionLineCostList;
    }

    /**
     * Sets the value of the prescriptionLineCostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrescriptionLineCost }
     *     
     */
    public void setPrescriptionLineCostList(ArrayOfPrescriptionLineCost value) {
        this.prescriptionLineCostList = value;
    }

}
