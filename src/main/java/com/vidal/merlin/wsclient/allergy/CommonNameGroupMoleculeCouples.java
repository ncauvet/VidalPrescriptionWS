
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonNameGroupMoleculeCouples complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupMoleculeCouples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeExcipientMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *         &lt;element name="activePrincipleMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *         &lt;element name="othersExcipientMoleculeAlerts" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupMoleculeCouples", propOrder = {
    "activeExcipientMoleculeAlerts",
    "activePrincipleMoleculeAlerts",
    "othersExcipientMoleculeAlerts"
})
public class CommonNameGroupMoleculeCouples {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple activeExcipientMoleculeAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple activePrincipleMoleculeAlerts;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple othersExcipientMoleculeAlerts;

    /**
     * Gets the value of the activeExcipientMoleculeAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getActiveExcipientMoleculeAlerts() {
        return activeExcipientMoleculeAlerts;
    }

    /**
     * Sets the value of the activeExcipientMoleculeAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setActiveExcipientMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.activeExcipientMoleculeAlerts = value;
    }

    /**
     * Gets the value of the activePrincipleMoleculeAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getActivePrincipleMoleculeAlerts() {
        return activePrincipleMoleculeAlerts;
    }

    /**
     * Sets the value of the activePrincipleMoleculeAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setActivePrincipleMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.activePrincipleMoleculeAlerts = value;
    }

    /**
     * Gets the value of the othersExcipientMoleculeAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getOthersExcipientMoleculeAlerts() {
        return othersExcipientMoleculeAlerts;
    }

    /**
     * Sets the value of the othersExcipientMoleculeAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setOthersExcipientMoleculeAlerts(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.othersExcipientMoleculeAlerts = value;
    }

}
