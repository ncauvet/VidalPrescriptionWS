
package com.vidal.merlin.wsclient.foodInteraction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFoodInteractionCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFoodInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foodInteractionCommentCouple" type="{urn:Vidal}foodInteractionCommentCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFoodInteractionCommentCouple", propOrder = {
    "foodInteractionCommentCouple"
})
public class ArrayOfFoodInteractionCommentCouple {

    @XmlElement(nillable = true)
    protected List<FoodInteractionCommentCouple> foodInteractionCommentCouple;

    /**
     * Gets the value of the foodInteractionCommentCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodInteractionCommentCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodInteractionCommentCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodInteractionCommentCouple }
     * 
     * 
     */
    public List<FoodInteractionCommentCouple> getFoodInteractionCommentCouple() {
        if (foodInteractionCommentCouple == null) {
            foodInteractionCommentCouple = new ArrayList<FoodInteractionCommentCouple>();
        }
        return this.foodInteractionCommentCouple;
    }

}
