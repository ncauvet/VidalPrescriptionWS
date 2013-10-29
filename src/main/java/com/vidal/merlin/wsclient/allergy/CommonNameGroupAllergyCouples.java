
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonNameGroupAllergyCouples complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupAllergyCouples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeExcipientAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *         &lt;element name="activePrincipleAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *         &lt;element name="othersExcipientAllergyAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupAllergyCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupAllergyCouples", propOrder = {
    "activeExcipientAllergyAlerts",
    "activePrincipleAllergyAlerts",
    "othersExcipientAllergyAlerts"
})
public class CommonNameGroupAllergyCouples {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple activeExcipientAllergyAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple activePrincipleAllergyAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupAllergyCouple othersExcipientAllergyAlerts;

    /**
     * Gets the value of the activeExcipientAllergyAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getActiveExcipientAllergyAlerts() {
        return activeExcipientAllergyAlerts;
    }

    /**
     * Sets the value of the activeExcipientAllergyAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setActiveExcipientAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.activeExcipientAllergyAlerts = value;
    }

    /**
     * Gets the value of the activePrincipleAllergyAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getActivePrincipleAllergyAlerts() {
        return activePrincipleAllergyAlerts;
    }

    /**
     * Sets the value of the activePrincipleAllergyAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setActivePrincipleAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.activePrincipleAllergyAlerts = value;
    }

    /**
     * Gets the value of the othersExcipientAllergyAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public ArrayOfCommonNameGroupAllergyCouple getOthersExcipientAllergyAlerts() {
        return othersExcipientAllergyAlerts;
    }

    /**
     * Sets the value of the othersExcipientAllergyAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupAllergyCouple }
     *     
     */
    public void setOthersExcipientAllergyAlerts(ArrayOfCommonNameGroupAllergyCouple value) {
        this.othersExcipientAllergyAlerts = value;
    }

}
