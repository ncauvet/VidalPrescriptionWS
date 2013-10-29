
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summarizedAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summarizedAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allergiesAlert" type="{http://summerizedAlert.merlin.vidal.com}SummarizedAllergyAlert"/>
 *         &lt;element name="contraIndicationsAlert" type="{urn:Vidal}SummarizedContraIndicationAlert"/>
 *         &lt;element name="interactionsAlert" type="{http://summerizedAlert.merlin.vidal.com}SummarizedInteractionAlert"/>
 *         &lt;element name="physicoChemicalAlert" type="{urn:Vidal}SummarizedPhysicoChemicalAlert"/>
 *         &lt;element name="posologyAlert" type="{http://summerizedAlert.merlin.vidal.com}SummarizedPosologyAlert"/>
 *         &lt;element name="precautionsAlert" type="{http://summerizedAlert.merlin.vidal.com}SummarizedPrecautionAlert"/>
 *         &lt;element name="redundantInteractionsAlert" type="{http://summerizedAlert.merlin.vidal.com}SummarizedRedundantInteractionAlert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summarizedAlert", propOrder = {
    "allergiesAlert",
    "contraIndicationsAlert",
    "interactionsAlert",
    "physicoChemicalAlert",
    "posologyAlert",
    "precautionsAlert",
    "redundantInteractionsAlert"
})
public class SummarizedAlert {

    @XmlElement(required = true, nillable = true)
    protected SummarizedAllergyAlert allergiesAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedContraIndicationAlert contraIndicationsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedInteractionAlert interactionsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPhysicoChemicalAlert physicoChemicalAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPosologyAlert posologyAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedPrecautionAlert precautionsAlert;
    @XmlElement(required = true, nillable = true)
    protected SummarizedRedundantInteractionAlert redundantInteractionsAlert;

    /**
     * Gets the value of the allergiesAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedAllergyAlert }
     *     
     */
    public SummarizedAllergyAlert getAllergiesAlert() {
        return allergiesAlert;
    }

    /**
     * Sets the value of the allergiesAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedAllergyAlert }
     *     
     */
    public void setAllergiesAlert(SummarizedAllergyAlert value) {
        this.allergiesAlert = value;
    }

    /**
     * Gets the value of the contraIndicationsAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedContraIndicationAlert }
     *     
     */
    public SummarizedContraIndicationAlert getContraIndicationsAlert() {
        return contraIndicationsAlert;
    }

    /**
     * Sets the value of the contraIndicationsAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedContraIndicationAlert }
     *     
     */
    public void setContraIndicationsAlert(SummarizedContraIndicationAlert value) {
        this.contraIndicationsAlert = value;
    }

    /**
     * Gets the value of the interactionsAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedInteractionAlert }
     *     
     */
    public SummarizedInteractionAlert getInteractionsAlert() {
        return interactionsAlert;
    }

    /**
     * Sets the value of the interactionsAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedInteractionAlert }
     *     
     */
    public void setInteractionsAlert(SummarizedInteractionAlert value) {
        this.interactionsAlert = value;
    }

    /**
     * Gets the value of the physicoChemicalAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPhysicoChemicalAlert }
     *     
     */
    public SummarizedPhysicoChemicalAlert getPhysicoChemicalAlert() {
        return physicoChemicalAlert;
    }

    /**
     * Sets the value of the physicoChemicalAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPhysicoChemicalAlert }
     *     
     */
    public void setPhysicoChemicalAlert(SummarizedPhysicoChemicalAlert value) {
        this.physicoChemicalAlert = value;
    }

    /**
     * Gets the value of the posologyAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPosologyAlert }
     *     
     */
    public SummarizedPosologyAlert getPosologyAlert() {
        return posologyAlert;
    }

    /**
     * Sets the value of the posologyAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPosologyAlert }
     *     
     */
    public void setPosologyAlert(SummarizedPosologyAlert value) {
        this.posologyAlert = value;
    }

    /**
     * Gets the value of the precautionsAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedPrecautionAlert }
     *     
     */
    public SummarizedPrecautionAlert getPrecautionsAlert() {
        return precautionsAlert;
    }

    /**
     * Sets the value of the precautionsAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedPrecautionAlert }
     *     
     */
    public void setPrecautionsAlert(SummarizedPrecautionAlert value) {
        this.precautionsAlert = value;
    }

    /**
     * Gets the value of the redundantInteractionsAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SummarizedRedundantInteractionAlert }
     *     
     */
    public SummarizedRedundantInteractionAlert getRedundantInteractionsAlert() {
        return redundantInteractionsAlert;
    }

    /**
     * Sets the value of the redundantInteractionsAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummarizedRedundantInteractionAlert }
     *     
     */
    public void setRedundantInteractionsAlert(SummarizedRedundantInteractionAlert value) {
        this.redundantInteractionsAlert = value;
    }

}
