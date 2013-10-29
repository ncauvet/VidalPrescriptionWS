
package com.vidal.merlin.wsclient.interaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCoupleList" type="{urn:Vidal}ArrayOfInteractionCouple"/>
 *         &lt;element name="unkownProductInteractionList" type="{urn:Vidal}ArrayOfProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionResult", propOrder = {
    "interactionCoupleList",
    "unkownProductInteractionList"
})
public class InteractionResult {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInteractionCouple interactionCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct unkownProductInteractionList;

    /**
     * Gets the value of the interactionCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInteractionCouple }
     *     
     */
    public ArrayOfInteractionCouple getInteractionCoupleList() {
        return interactionCoupleList;
    }

    /**
     * Sets the value of the interactionCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInteractionCouple }
     *     
     */
    public void setInteractionCoupleList(ArrayOfInteractionCouple value) {
        this.interactionCoupleList = value;
    }

    /**
     * Gets the value of the unkownProductInteractionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getUnkownProductInteractionList() {
        return unkownProductInteractionList;
    }

    /**
     * Sets the value of the unkownProductInteractionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setUnkownProductInteractionList(ArrayOfProduct value) {
        this.unkownProductInteractionList = value;
    }

}
