
package com.vidal.merlin.wsclient.contraIndication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndicationProductCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndicationProductCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationProductCouple" type="{urn:Vidal}contraIndicationProductCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndicationProductCouple", propOrder = {
    "contraIndicationProductCouple"
})
public class ArrayOfContraIndicationProductCouple {

    @XmlElement(nillable = true)
    protected List<ContraIndicationProductCouple> contraIndicationProductCouple;

    /**
     * Gets the value of the contraIndicationProductCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndicationProductCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndicationProductCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndicationProductCouple }
     * 
     * 
     */
    public List<ContraIndicationProductCouple> getContraIndicationProductCouple() {
        if (contraIndicationProductCouple == null) {
            contraIndicationProductCouple = new ArrayList<ContraIndicationProductCouple>();
        }
        return this.contraIndicationProductCouple;
    }

}
