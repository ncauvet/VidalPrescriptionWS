
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfDosesList" type="{http://posology.api.vidal.com}ArrayOfNumberOfDoses"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numberOfDosesList"
})
@XmlRootElement(name = "searchDosesByProductIdResponse")
public class SearchDosesByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfNumberOfDoses numberOfDosesList;

    /**
     * Gets the value of the numberOfDosesList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumberOfDoses }
     *     
     */
    public ArrayOfNumberOfDoses getNumberOfDosesList() {
        return numberOfDosesList;
    }

    /**
     * Sets the value of the numberOfDosesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumberOfDoses }
     *     
     */
    public void setNumberOfDosesList(ArrayOfNumberOfDoses value) {
        this.numberOfDosesList = value;
    }

}
