
package com.vidal.merlin.wsclient.redundantInteraction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRedundantInteractionCommonNameGroupCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRedundantInteractionCommonNameGroupCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="redundantInteractionCommonNameGroupCouple" type="{urn:Vidal}redundantInteractionCommonNameGroupCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRedundantInteractionCommonNameGroupCouple", propOrder = {
    "redundantInteractionCommonNameGroupCouple"
})
public class ArrayOfRedundantInteractionCommonNameGroupCouple {

    @XmlElement(nillable = true)
    protected List<RedundantInteractionCommonNameGroupCouple> redundantInteractionCommonNameGroupCouple;

    /**
     * Gets the value of the redundantInteractionCommonNameGroupCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redundantInteractionCommonNameGroupCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedundantInteractionCommonNameGroupCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedundantInteractionCommonNameGroupCouple }
     * 
     * 
     */
    public List<RedundantInteractionCommonNameGroupCouple> getRedundantInteractionCommonNameGroupCouple() {
        if (redundantInteractionCommonNameGroupCouple == null) {
            redundantInteractionCommonNameGroupCouple = new ArrayList<RedundantInteractionCommonNameGroupCouple>();
        }
        return this.redundantInteractionCommonNameGroupCouple;
    }

}
