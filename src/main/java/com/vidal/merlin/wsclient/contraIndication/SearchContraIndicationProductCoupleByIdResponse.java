
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
 *         &lt;element name="contraIndicationProductCoupleList" type="{urn:Vidal}ArrayOfContraIndicationProductCouple"/>
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
    "contraIndicationProductCoupleList"
})
@XmlRootElement(name = "searchContraIndicationProductCoupleByIdResponse")
public class SearchContraIndicationProductCoupleByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationProductCouple contraIndicationProductCoupleList;

    /**
     * Gets the value of the contraIndicationProductCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationProductCouple }
     *     
     */
    public ArrayOfContraIndicationProductCouple getContraIndicationProductCoupleList() {
        return contraIndicationProductCoupleList;
    }

    /**
     * Sets the value of the contraIndicationProductCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationProductCouple }
     *     
     */
    public void setContraIndicationProductCoupleList(ArrayOfContraIndicationProductCouple value) {
        this.contraIndicationProductCoupleList = value;
    }

}
