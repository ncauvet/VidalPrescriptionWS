
package com.vidal.merlin.wsclient.drugInteractionClass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDrugInteractionClassSeverityCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDrugInteractionClassSeverityCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClassSeverityCouple" type="{urn:Vidal}drugInteractionClassSeverityCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDrugInteractionClassSeverityCouple", propOrder = {
    "drugInteractionClassSeverityCouple"
})
public class ArrayOfDrugInteractionClassSeverityCouple {

    @XmlElement(nillable = true)
    protected List<DrugInteractionClassSeverityCouple> drugInteractionClassSeverityCouple;

    /**
     * Gets the value of the drugInteractionClassSeverityCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugInteractionClassSeverityCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugInteractionClassSeverityCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugInteractionClassSeverityCouple }
     * 
     * 
     */
    public List<DrugInteractionClassSeverityCouple> getDrugInteractionClassSeverityCouple() {
        if (drugInteractionClassSeverityCouple == null) {
            drugInteractionClassSeverityCouple = new ArrayList<DrugInteractionClassSeverityCouple>();
        }
        return this.drugInteractionClassSeverityCouple;
    }

}
