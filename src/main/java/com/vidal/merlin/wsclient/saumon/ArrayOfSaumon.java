
package com.vidal.merlin.wsclient.saumon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSaumon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaumon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saumon" type="{urn:Vidal}saumon" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaumon", propOrder = {
    "saumon"
})
public class ArrayOfSaumon {

    @XmlElement(nillable = true)
    protected List<Saumon> saumon;

    /**
     * Gets the value of the saumon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saumon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaumon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Saumon }
     * 
     * 
     */
    public List<Saumon> getSaumon() {
        if (saumon == null) {
            saumon = new ArrayList<Saumon>();
        }
        return this.saumon;
    }

}
