
package com.vidal.merlin.wsclient.precaution;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrecautionEPPCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrecautionEPPCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precautionEPPCouple" type="{urn:Vidal}precautionEPPCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrecautionEPPCouple", propOrder = {
    "precautionEPPCouple"
})
public class ArrayOfPrecautionEPPCouple {

    @XmlElement(nillable = true)
    protected List<PrecautionEPPCouple> precautionEPPCouple;

    /**
     * Gets the value of the precautionEPPCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionEPPCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionEPPCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecautionEPPCouple }
     * 
     * 
     */
    public List<PrecautionEPPCouple> getPrecautionEPPCouple() {
        if (precautionEPPCouple == null) {
            precautionEPPCouple = new ArrayList<PrecautionEPPCouple>();
        }
        return this.precautionEPPCouple;
    }

}
