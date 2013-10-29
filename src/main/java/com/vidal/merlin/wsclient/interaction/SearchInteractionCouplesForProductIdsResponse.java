
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
 *         &lt;element name="interactionResult" type="{urn:Vidal}InteractionResult"/>
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
    "interactionResult"
})
@XmlRootElement(name = "searchInteractionCouplesForProductIdsResponse")
public class SearchInteractionCouplesForProductIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected InteractionResult interactionResult;

    /**
     * Gets the value of the interactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionResult }
     *     
     */
    public InteractionResult getInteractionResult() {
        return interactionResult;
    }

    /**
     * Sets the value of the interactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionResult }
     *     
     */
    public void setInteractionResult(InteractionResult value) {
        this.interactionResult = value;
    }

}
