
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
 *         &lt;element name="drugInteractionClassList" type="{urn:Vidal}ArrayOfDrugInteractionClassSeverityCouple"/>
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
@XmlRootElement(name = "searchAllInteractingClassesWithDrugInteractionClassIdResponse")
public class SearchAllInteractingClassesWithDrugInteractionClassIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugInteractionClassSeverityCouple drugInteractionClassList;

    /**
     * Gets the value of the drugInteractionClassList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugInteractionClassSeverityCouple }
     *     
     */
    public ArrayOfDrugInteractionClassSeverityCouple getDrugInteractionClassList() {
        return drugInteractionClassList;
    }

    /**
     * Sets the value of the drugInteractionClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugInteractionClassSeverityCouple }
     *     
     */
    public void setDrugInteractionClassList(ArrayOfDrugInteractionClassSeverityCouple value) {
        this.drugInteractionClassList = value;
    }

}
