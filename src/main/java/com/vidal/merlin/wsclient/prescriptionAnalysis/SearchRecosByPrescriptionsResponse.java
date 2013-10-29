
package com.vidal.merlin.wsclient.prescriptionAnalysis;

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
 *         &lt;element name="recos" type="{urn:Vidal}ArrayOfCodedReco"/>
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
    "recos"
})
@XmlRootElement(name = "searchRecosByPrescriptionsResponse")
public class SearchRecosByPrescriptionsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCodedReco recos;

    /**
     * Gets the value of the recos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodedReco }
     *     
     */
    public ArrayOfCodedReco getRecos() {
        return recos;
    }

    /**
     * Sets the value of the recos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodedReco }
     *     
     */
    public void setRecos(ArrayOfCodedReco value) {
        this.recos = value;
    }

}
