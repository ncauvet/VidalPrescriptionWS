
package com.vidal.merlin.wsclient.contraIndication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndicationTypeCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationTypeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationTypeCouple" type="{urn:Vidal}contraIndicationTypeCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationTypeCouple", propOrder = {
    "contraIndicationTypeCouple"
})
public class ArrayOfContraIndicationTypeCouple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationTypeCouple> contraIndicationTypeCouple;

    /**
     * Gets the value of the contraIndicationTypeCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationTypeCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationTypeCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationTypeCouple }
     * 
     * 
     */
    public List<ContraIndicationTypeCouple> getContraIndicationTypeCouple() {
        if (contraIndicationTypeCouple == null) {
            contraIndicationTypeCouple = new ArrayList<ContraIndicationTypeCouple>();
        }
        return this.contraIndicationTypeCouple;
    }

}
