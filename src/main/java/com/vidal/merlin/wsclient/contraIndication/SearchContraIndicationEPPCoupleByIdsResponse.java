
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
 *         &lt;element name="contraIndicationEppCoupleList" type="{urn:Vidal}ArrayOfContraIndicationEPPCouple"/>
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
    "contraIndicationEppCoupleList"
})
@XmlRootElement(name = "searchContraIndicationEPPCoupleByIdsResponse")
public class SearchContraIndicationEPPCoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationEPPCouple contraIndicationEppCoupleList;

    /**
     * Gets the value of the contraIndicationEppCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public ArrayOfContraIndicationEPPCouple getContraIndicationEppCoupleList() {
        return contraIndicationEppCoupleList;
    }

    /**
     * Sets the value of the contraIndicationEppCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public void setContraIndicationEppCoupleList(ArrayOfContraIndicationEPPCouple value) {
        this.contraIndicationEppCoupleList = value;
    }

}
