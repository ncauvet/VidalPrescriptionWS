
package com.vidal.merlin.wsclient.precaution;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrecautionCim10Pair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrecautionCim10Pair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precautionCim10Pair" type="{urn:Vidal}precautionCim10Pair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrecautionCim10Pair", propOrder = {
    "precautionCim10Pair"
})
public class ArrayOfPrecautionCim10Pair {

    @XmlElement(nillable = true)
    protected List<PrecautionCim10Pair> precautionCim10Pair;

    /**
     * Gets the value of the precautionCim10Pair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precautionCim10Pair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecautionCim10Pair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecautionCim10Pair }
     * 
     * 
     */
    public List<PrecautionCim10Pair> getPrecautionCim10Pair() {
        if (precautionCim10Pair == null) {
            precautionCim10Pair = new ArrayList<PrecautionCim10Pair>();
        }
        return this.precautionCim10Pair;
    }

}
