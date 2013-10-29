
package com.vidal.merlin.wsclient.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItemCompositionsCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemCompositionsCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemCompositionsCouple" type="{urn:Vidal}itemCompositionsCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemCompositionsCouple", propOrder = {
    "itemCompositionsCouple"
})
public class ArrayOfItemCompositionsCouple {

    @XmlElement(nillable = true)
    protected List<ItemCompositionsCouple> itemCompositionsCouple;

    /**
     * Gets the value of the itemCompositionsCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCompositionsCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCompositionsCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCompositionsCouple }
     * 
     * 
     */
    public List<ItemCompositionsCouple> getItemCompositionsCouple() {
        if (itemCompositionsCouple == null) {
            itemCompositionsCouple = new ArrayList<ItemCompositionsCouple>();
        }
        return this.itemCompositionsCouple;
    }

}
