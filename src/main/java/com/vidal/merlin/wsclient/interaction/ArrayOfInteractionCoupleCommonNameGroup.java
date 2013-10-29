
package com.vidal.merlin.wsclient.interaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInteractionCoupleCommonNameGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInteractionCoupleCommonNameGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionCoupleCommonNameGroup" type="{urn:Vidal}interactionCoupleCommonNameGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInteractionCoupleCommonNameGroup", propOrder = {
    "interactionCoupleCommonNameGroup"
})
public class ArrayOfInteractionCoupleCommonNameGroup {

    @XmlElement(nillable = true)
    protected List<InteractionCoupleCommonNameGroup> interactionCoupleCommonNameGroup;

    /**
     * Gets the value of the interactionCoupleCommonNameGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionCoupleCommonNameGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionCoupleCommonNameGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionCoupleCommonNameGroup }
     * 
     * 
     */
    public List<InteractionCoupleCommonNameGroup> getInteractionCoupleCommonNameGroup() {
        if (interactionCoupleCommonNameGroup == null) {
            interactionCoupleCommonNameGroup = new ArrayList<InteractionCoupleCommonNameGroup>();
        }
        return this.interactionCoupleCommonNameGroup;
    }

}
