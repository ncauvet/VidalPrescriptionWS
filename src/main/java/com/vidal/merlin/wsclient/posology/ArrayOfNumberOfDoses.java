
package com.vidal.merlin.wsclient.posology;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNumberOfDoses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNumberOfDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfDoses" type="{http://posology.api.vidal.com}NumberOfDoses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNumberOfDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "numberOfDoses"
})
public class ArrayOfNumberOfDoses {

    @XmlElement(name = "NumberOfDoses", nillable = true)
    protected List<NumberOfDoses> numberOfDoses;

    /**
     * Gets the value of the numberOfDoses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfDoses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfDoses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfDoses }
     * 
     * 
     */
    public List<NumberOfDoses> getNumberOfDoses() {
        if (numberOfDoses == null) {
            numberOfDoses = new ArrayList<NumberOfDoses>();
        }
        return this.numberOfDoses;
    }

}
