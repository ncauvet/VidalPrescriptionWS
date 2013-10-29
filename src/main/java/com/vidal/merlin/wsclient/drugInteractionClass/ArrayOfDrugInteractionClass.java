
package com.vidal.merlin.wsclient.drugInteractionClass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDrugInteractionClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDrugInteractionClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClass" type="{urn:Vidal}drugInteractionClass" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDrugInteractionClass", propOrder = {
    "drugInteractionClass"
})
public class ArrayOfDrugInteractionClass {

    @XmlElement(nillable = true)
    protected List<DrugInteractionClass> drugInteractionClass;

    /**
     * Gets the value of the drugInteractionClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugInteractionClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugInteractionClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugInteractionClass }
     * 
     * 
     */
    public List<DrugInteractionClass> getDrugInteractionClass() {
        if (drugInteractionClass == null) {
            drugInteractionClass = new ArrayList<DrugInteractionClass>();
        }
        return this.drugInteractionClass;
    }

}
