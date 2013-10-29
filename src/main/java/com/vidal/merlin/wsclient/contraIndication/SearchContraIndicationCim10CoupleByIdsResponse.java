
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
 *         &lt;element name="contraIndicationCim10CoupleList" type="{urn:Vidal}ArrayOfContraIndicationCim10Couple"/>
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
    "contraIndicationCim10CoupleList"
})
@XmlRootElement(name = "searchContraIndicationCim10CoupleByIdsResponse")
public class SearchContraIndicationCim10CoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationCim10Couple contraIndicationCim10CoupleList;

    /**
     * Gets the value of the contraIndicationCim10CoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationCim10Couple }
     *     
     */
    public ArrayOfContraIndicationCim10Couple getContraIndicationCim10CoupleList() {
        return contraIndicationCim10CoupleList;
    }

    /**
     * Sets the value of the contraIndicationCim10CoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationCim10Couple }
     *     
     */
    public void setContraIndicationCim10CoupleList(ArrayOfContraIndicationCim10Couple value) {
        this.contraIndicationCim10CoupleList = value;
    }

}
