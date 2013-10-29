
package com.vidal.merlin.wsclient.foodInteraction;

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
 *         &lt;element name="foodInteractionCommentCoupleList" type="{urn:Vidal}ArrayOfFoodInteractionCommentCouple"/>
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
    "foodInteractionCommentCoupleList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfFoodInteractionCommentCouple foodInteractionCommentCoupleList;

    /**
     * Gets the value of the foodInteractionCommentCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFoodInteractionCommentCouple }
     *     
     */
    public ArrayOfFoodInteractionCommentCouple getFoodInteractionCommentCoupleList() {
        return foodInteractionCommentCoupleList;
    }

    /**
     * Sets the value of the foodInteractionCommentCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFoodInteractionCommentCouple }
     *     
     */
    public void setFoodInteractionCommentCoupleList(ArrayOfFoodInteractionCommentCouple value) {
        this.foodInteractionCommentCoupleList = value;
    }

}
