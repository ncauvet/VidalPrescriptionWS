
package com.vidal.merlin.wsclient.contraIndication;

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
 *         &lt;element name="contraIndicationList" type="{urn:Vidal}ArrayOfContraIndication"/>
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
    "contraIndicationList"
})
@XmlRootElement(name = "searchBySfmgIdResponse")
public class SearchBySfmgIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndication contraIndicationList;

    /**
     * Gets the value of the contraIndicationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public ArrayOfContraIndication getContraIndicationList() {
        return contraIndicationList;
    }

    /**
     * Sets the value of the contraIndicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndication }
     *     
     */
    public void setContraIndicationList(ArrayOfContraIndication value) {
        this.contraIndicationList = value;
    }

}
