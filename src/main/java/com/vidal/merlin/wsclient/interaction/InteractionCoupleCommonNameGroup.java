
package com.vidal.merlin.wsclient.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for interactionCoupleCommonNameGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interactionCoupleCommonNameGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupA" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupB" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="drugInteractionClassA" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="drugInteractionClassB" type="{urn:Vidal}drugInteractionClass"/>
 *         &lt;element name="precautionComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "interactionCoupleCommonNameGroup", propOrder = {
    "commonNameGroupA",
    "commonNameGroupB",
    "drugInteractionClassA",
    "drugInteractionClassB",
    "precautionComment",
    "riskComment",
    "severity"
})
public class InteractionCoupleCommonNameGroup {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupA;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroupB;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassA;
    @XmlElement(required = true, nillable = true)
    protected DrugInteractionClass drugInteractionClassB;
    @XmlElement(required = true, nillable = true)
    protected String precautionComment;
    @XmlElement(required = true, nillable = true)
    protected String riskComment;
    @XmlElement(required = true, nillable = true)
    protected InteractionSeverityType severity;

    /**
     * Gets the value of the commonNameGroupA property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupA() {
        return commonNameGroupA;
    }

    /**
     * Sets the value of the commonNameGroupA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupA(CommonNameGroup value) {
        this.commonNameGroupA = value;
    }

    /**
     * Gets the value of the commonNameGroupB property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroupB() {
        return commonNameGroupB;
    }

    /**
     * Sets the value of the commonNameGroupB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroupB(CommonNameGroup value) {
        this.commonNameGroupB = value;
    }

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
