
package com.vidal.merlin.wsclient.interaction;

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
 *         &lt;element name="interactionCommonNameGroupResult" type="{urn:Vidal}InteractionCommonNameGroupResult"/>
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
    "interactionCommonNameGroupResult"
})
@XmlRootElement(name = "getInteractionCouplesForCommonNameGroupIdsResponse")
public class GetInteractionCouplesForCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected InteractionCommonNameGroupResult interactionCommonNameGroupResult;

    /**
     * Gets the value of the interactionCommonNameGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionCommonNameGroupResult }
     *     
     */
    public InteractionCommonNameGroupResult getInteractionCommonNameGroupResult() {
        return interactionCommonNameGroupResult;
    }

    /**
     * Sets the value of the interactionCommonNameGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionCommonNameGroupResult }
     *     
     */
    public void setInteractionCommonNameGroupResult(InteractionCommonNameGroupResult value) {
        this.interactionCommonNameGroupResult = value;
    }

}
