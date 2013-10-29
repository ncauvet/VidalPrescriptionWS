
package com.vidal.merlin.wsclient.physicoChemicalInteraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for physicoChemicalInteractionCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicoChemicalInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="physicoChemicalInteraction" type="{urn:Vidal}physicoChemicalInteraction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicoChemicalInteractionCommentCouple", propOrder = {
    "comment",
    "physicoChemicalInteraction"
})
public class PhysicoChemicalInteractionCommentCouple {

    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected PhysicoChemicalInteraction physicoChemicalInteraction;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the physicoChemicalInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public PhysicoChemicalInteraction getPhysicoChemicalInteraction() {
        return physicoChemicalInteraction;
    }

    /**
     * Sets the value of the physicoChemicalInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicoChemicalInteraction }
     *     
     */
    public void setPhysicoChemicalInteraction(PhysicoChemicalInteraction value) {
        this.physicoChemicalInteraction = value;
    }

}
