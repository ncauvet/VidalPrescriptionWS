
package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActiveSubstanceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActiveSubstanceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeSubstanceInformation" type="{urn:Vidal}activeSubstanceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActiveSubstanceInformation", propOrder = {
    "activeSubstanceInformation"
})
public class ArrayOfActiveSubstanceInformation {

    @XmlElement(nillable = true)
    protected List<ActiveSubstanceInformation> activeSubstanceInformation;

    /**
     * Gets the value of the activeSubstanceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeSubstanceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveSubstanceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveSubstanceInformation }
     * 
     * 
     */
    public List<ActiveSubstanceInformation> getActiveSubstanceInformation() {
        if (activeSubstanceInformation == null) {
            activeSubstanceInformation = new ArrayList<ActiveSubstanceInformation>();
        }
        return this.activeSubstanceInformation;
    }

}
