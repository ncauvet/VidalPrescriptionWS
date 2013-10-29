
package com.vidal.merlin.wsclient.sfmg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSfmg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSfmg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sfmg" type="{urn:Vidal}sfmg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSfmg", propOrder = {
    "sfmg"
})
public class ArrayOfSfmg {

    @XmlElement(nillable = true)
    protected List<Sfmg> sfmg;

    /**
     * Gets the value of the sfmg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfmg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfmg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sfmg }
     * 
     * 
     */
    public List<Sfmg> getSfmg() {
        if (sfmg == null) {
            sfmg = new ArrayList<Sfmg>();
        }
        return this.sfmg;
    }

}
