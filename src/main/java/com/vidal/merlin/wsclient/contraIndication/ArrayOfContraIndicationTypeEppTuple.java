
package com.vidal.merlin.wsclient.contraIndication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndicationTypeEppTuple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationTypeEppTuple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationTypeEppTuple" type="{urn:Vidal}contraIndicationTypeEppTuple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationTypeEppTuple", propOrder = {
    "contraIndicationTypeEppTuple"
})
public class ArrayOfContraIndicationTypeEppTuple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationTypeEppTuple> contraIndicationTypeEppTuple;

    /**
     * Gets the value of the contraIndicationTypeEppTuple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationTypeEppTuple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationTypeEppTuple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationTypeEppTuple }
     * 
     * 
     */
    public List<ContraIndicationTypeEppTuple> getContraIndicationTypeEppTuple() {
        if (contraIndicationTypeEppTuple == null) {
            contraIndicationTypeEppTuple = new ArrayList<ContraIndicationTypeEppTuple>();
        }
        return this.contraIndicationTypeEppTuple;
    }

}
