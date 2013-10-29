
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemCompositionsCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemCompositionsCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compositions" type="{urn:Vidal}ArrayOfComposition"/>
 *         &lt;element name="item" type="{urn:Vidal}Item"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemCompositionsCouple", propOrder = {
    "compositions",
    "item"
})
public class ItemCompositionsCouple {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfComposition compositions;
    @XmlElement(required = true, nillable = true)
    protected Item item;

    /**
     * Gets the value of the compositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComposition }
     *     
     */
    public ArrayOfComposition getCompositions() {
        return compositions;
    }

    /**
     * Sets the value of the compositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComposition }
     *     
     */
    public void setCompositions(ArrayOfComposition value) {
        this.compositions = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

}
