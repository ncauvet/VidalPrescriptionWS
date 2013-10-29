
package com.vidal.merlin.wsclient.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for interactionCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interactionCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClassA" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="drugInteractionClassB" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="interactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precautionComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productA" type="{urn:Vidal}product"/>
 *         &lt;element name="productB" type="{urn:Vidal}product"/>
 *         &lt;element name="riskComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severity" type="{urn:Vidal}InteractionSeverityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interactionCouple", propOrder = {
    "drugInteractionClassA",
    "drugInteractionClassB",
    "interactionId",
    "precautionComment",
    "productA",
    "productB",
    "riskComment",
    "severity"
})
public class InteractionCouple {

    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassA;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassB;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer interactionId;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected Product productA;
    @XmlElement(required = true, nillable = true)
    protected Product productB;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Gets the value of the drugInteractionClassA property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClassA() {
        return drugInteractionClassA;
    }

    /**
     * Sets the value of the drugInteractionClassA property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassA(DrugInteractionClass value) {
        this.drugInteractionClassA = value;
    }

    /**
     * Gets the value of the drugInteractionClassB property.
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractionClass }
     *     
     */
    public DrugInteractionClass getDrugInteractionClassB() {
        return drugInteractionClassB;
    }

    /**
     * Sets the value of the drugInteractionClassB property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassB(DrugInteractionClass value) {
        this.drugInteractionClassB = value;
    }

    /**
     * Gets the value of the interactionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInteractionId() {
        return interactionId;
    }

    /**
     * Sets the value of the interactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInteractionId(Integer value) {
        this.interactionId = value;
    }

    /**
     * Gets the value of the precautionComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecautionComment() {
        return precautionComment;
    }

    /**
     * Sets the value of the precautionComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecautionComment(String value) {
        this.precautionComment = value;
    }

    /**
     * Gets the value of the productA property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductA() {
        return productA;
    }

    /**
     * Sets the value of the productA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductA(Product value) {
        this.productA = value;
    }

    /**
     * Gets the value of the productB property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductB() {
        return productB;
    }

    /**
     * Sets the value of the productB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductB(Product value) {
        this.productB = value;
    }

    /**
     * Gets the value of the riskComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskComment() {
        return riskComment;
    }

    /**
     * Sets the value of the riskComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskComment(String value) {
        this.riskComment = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionSeverityType }
     *     
     */
    public InteractionSeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionSeverityType }
     *     
     */
    public void setSeverity(InteractionSeverityType value) {
        this.severity = value;
    }

}
