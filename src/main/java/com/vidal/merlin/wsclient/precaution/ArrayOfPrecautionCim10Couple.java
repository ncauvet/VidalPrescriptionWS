
package com.vidal.merlin.wsclient.precaution;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrecautionCim10Couple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrecautionCim10Couple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precautionCim10Couple" type="{urn:Vidal}precautionCim10Couple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrecautionCim10Couple", propOrder = {
    "precautionCim10Couple"
})
public class ArrayOfPrecautionCim10Couple {

    @XmlElement(nillable = true)
    protected List<PrecautionCim10Couple> precautionCim10Couple;

    /**
     * Gets the value of the precautionCim10Couple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionCim10Couple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionCim10Couple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecautionCim10Couple }
     * 
     * 
     */
    public List<PrecautionCim10Couple> getPrecautionCim10Couple() {
        if (precautionCim10Couple == null) {
            precautionCim10Couple = new ArrayList<PrecautionCim10Couple>();
        }
        return this.precautionCim10Couple;
    }

}
