
package com.vidal.merlin.wsclient.physicoChemicalInteraction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPhysicoChemicalInteractionCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPhysicoChemicalInteractionCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicoChemicalInteractionCommentCouple" type="{urn:Vidal}physicoChemicalInteractionCommentCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicoChemicalInteractionCommentCouple", propOrder = {
    "physicoChemicalInteractionCommentCouple"
})
public class ArrayOfPhysicoChemicalInteractionCommentCouple {

    @XmlElement(nillable = true)
    protected List<PhysicoChemicalInteractionCommentCouple> physicoChemicalInteractionCommentCouple;

    /**
     * Gets the value of the physicoChemicalInteractionCommentCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicoChemicalInteractionCommentCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicoChemicalInteractionCommentCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicoChemicalInteractionCommentCouple }
     * 
     * 
     */
    public List<PhysicoChemicalInteractionCommentCouple> getPhysicoChemicalInteractionCommentCouple() {
        if (physicoChemicalInteractionCommentCouple == null) {
            physicoChemicalInteractionCommentCouple = new ArrayList<PhysicoChemicalInteractionCommentCouple>();
        }
        return this.physicoChemicalInteractionCommentCouple;
    }

}
