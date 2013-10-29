
package com.vidal.merlin.wsclient.physicoChemicalInteraction;

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
 *         &lt;element name="physicoChemicalInteractionList" type="{urn:Vidal}ArrayOfPhysicoChemicalInteraction"/>
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
    "physicoChemicalInteractionList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPhysicoChemicalInteraction physicoChemicalInteractionList;

    /**
     * Gets the value of the physicoChemicalInteractionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhysicoChemicalInteraction }
     *     
     */
    public ArrayOfPhysicoChemicalInteraction getPhysicoChemicalInteractionList() {
        return physicoChemicalInteractionList;
    }

    /**
     * Sets the value of the physicoChemicalInteractionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhysicoChemicalInteraction }
     *     
     */
    public void setPhysicoChemicalInteractionList(ArrayOfPhysicoChemicalInteraction value) {
        this.physicoChemicalInteractionList = value;
    }

}
