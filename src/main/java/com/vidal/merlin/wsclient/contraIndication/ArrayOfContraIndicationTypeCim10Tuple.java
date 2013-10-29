
package com.vidal.merlin.wsclient.contraIndication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndicationTypeCim10Tuple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationTypeCim10Tuple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationTypeCim10Tuple" type="{urn:Vidal}contraIndicationTypeCim10Tuple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationTypeCim10Tuple", propOrder = {
    "contraIndicationTypeCim10Tuple"
})
public class ArrayOfContraIndicationTypeCim10Tuple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationTypeCim10Tuple> contraIndicationTypeCim10Tuple;

    /**
     * Gets the value of the contraIndicationTypeCim10Tuple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationTypeCim10Tuple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationTypeCim10Tuple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationTypeCim10Tuple }
     * 
     * 
     */
    public List<ContraIndicationTypeCim10Tuple> getContraIndicationTypeCim10Tuple() {
        if (contraIndicationTypeCim10Tuple == null) {
            contraIndicationTypeCim10Tuple = new ArrayList<ContraIndicationTypeCim10Tuple>();
        }
        return this.contraIndicationTypeCim10Tuple;
    }

}
