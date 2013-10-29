
package com.vidal.merlin.wsclient.foodInteraction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodInteractionCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foodInteraction" type="{urn:Vidal}foodInteraction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodInteractionCommentCouple", propOrder = {
    "comment",
    "foodInteraction"
})
public class FoodInteractionCommentCouple {

    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected FoodInteraction foodInteraction;

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
     * Gets the value of the foodInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link FoodInteraction }
     *     
     */
    public FoodInteraction getFoodInteraction() {
        return foodInteraction;
    }

    /**
     * Sets the value of the foodInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodInteraction }
     *     
     */
    public void setFoodInteraction(FoodInteraction value) {
        this.foodInteraction = value;
    }

}
