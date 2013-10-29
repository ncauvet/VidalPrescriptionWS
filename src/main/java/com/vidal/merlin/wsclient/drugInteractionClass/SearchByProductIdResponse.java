
package com.vidal.merlin.wsclient.drugInteractionClass;

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
 *         &lt;element name="drugInteractionClassList" type="{urn:Vidal}ArrayOfDrugInteractionClass"/>
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
    "drugInteractionClassList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugInteractionClass drugInteractionClassList;

    /**
     * Gets the value of the drugInteractionClassList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public ArrayOfDrugInteractionClass getDrugInteractionClassList() {
        return drugInteractionClassList;
    }

    /**
     * Sets the value of the drugInteractionClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassList(ArrayOfDrugInteractionClass value) {
        this.drugInteractionClassList = value;
    }

}
