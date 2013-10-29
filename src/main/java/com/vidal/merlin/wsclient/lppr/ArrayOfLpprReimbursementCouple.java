
package com.vidal.merlin.wsclient.lppr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLpprReimbursementCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLpprReimbursementCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpprReimbursementCouple" type="{urn:Vidal}lpprReimbursementCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLpprReimbursementCouple", propOrder = {
    "lpprReimbursementCouple"
})
public class ArrayOfLpprReimbursementCouple {

    @XmlElement(nillable = true)
    protected List<LpprReimbursementCouple> lpprReimbursementCouple;

    /**
     * Gets the value of the lpprReimbursementCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lpprReimbursementCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLpprReimbursementCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LpprReimbursementCouple }
     * 
     * 
     */
    public List<LpprReimbursementCouple> getLpprReimbursementCouple() {
        if (lpprReimbursementCouple == null) {
            lpprReimbursementCouple = new ArrayList<LpprReimbursementCouple>();
        }
        return this.lpprReimbursementCouple;
    }

}
