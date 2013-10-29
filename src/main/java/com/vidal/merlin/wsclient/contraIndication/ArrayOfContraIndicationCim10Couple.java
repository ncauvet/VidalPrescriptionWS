
package com.vidal.merlin.wsclient.contraIndication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndicationCim10Couple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationCim10Couple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationCim10Couple" type="{urn:Vidal}contraIndicationCim10Couple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationCim10Couple", propOrder = {
    "contraIndicationCim10Couple"
})
public class ArrayOfContraIndicationCim10Couple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationCim10Couple> contraIndicationCim10Couple;

    /**
     * Gets the value of the contraIndicationCim10Couple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationCim10Couple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationCim10Couple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationCim10Couple }
     * 
     * 
     */
    public List<ContraIndicationCim10Couple> getContraIndicationCim10Couple() {
        if (contraIndicationCim10Couple == null) {
            contraIndicationCim10Couple = new ArrayList<ContraIndicationCim10Couple>();
        }
        return this.contraIndicationCim10Couple;
    }

}
