
package com.vidal.merlin.wsclient.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionCommonNameGroupResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionCommonNameGroupResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCommonNameGroupCoupleList" type="{urn:Vidal}ArrayOfInteractionCoupleCommonNameGroup"/>
 *         &lt;element name="noHomogeneousByInteractionsCommonNameGroupList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *         &lt;element name="unkownCommonNameGroupInteractionList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionCommonNameGroupResult", propOrder = {
    "interactionCommonNameGroupCoupleList",
    "noHomogeneousByInteractionsCommonNameGroupList",
    "unkownCommonNameGroupInteractionList"
})
public class InteractionCommonNameGroupResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInteractionCoupleCommonNameGroup interactionCommonNameGroupCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup noHomogeneousByInteractionsCommonNameGroupList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup unkownCommonNameGroupInteractionList;

    /**
     * Gets the value of the interactionCommonNameGroupCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInteractionCoupleCommonNameGroup }
     *     
     */
    public ArrayOfInteractionCoupleCommonNameGroup getInteractionCommonNameGroupCoupleList() {
        return interactionCommonNameGroupCoupleList;
    }

    /**
     * Sets the value of the interactionCommonNameGroupCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInteractionCoupleCommonNameGroup }
     *     
     */
    public void setInteractionCommonNameGroupCoupleList(ArrayOfInteractionCoupleCommonNameGroup value) {
        this.interactionCommonNameGroupCoupleList = value;
    }

    /**
     * Gets the value of the noHomogeneousByInteractionsCommonNameGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getNoHomogeneousByInteractionsCommonNameGroupList() {
        return noHomogeneousByInteractionsCommonNameGroupList;
    }

    /**
     * Sets the value of the noHomogeneousByInteractionsCommonNameGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setNoHomogeneousByInteractionsCommonNameGroupList(ArrayOfCommonNameGroup value) {
        this.noHomogeneousByInteractionsCommonNameGroupList = value;
    }

    /**
     * Gets the value of the unkownCommonNameGroupInteractionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getUnkownCommonNameGroupInteractionList() {
        return unkownCommonNameGroupInteractionList;
    }

    /**
     * Sets the value of the unkownCommonNameGroupInteractionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setUnkownCommonNameGroupInteractionList(ArrayOfCommonNameGroup value) {
        this.unkownCommonNameGroupInteractionList = value;
    }

}
