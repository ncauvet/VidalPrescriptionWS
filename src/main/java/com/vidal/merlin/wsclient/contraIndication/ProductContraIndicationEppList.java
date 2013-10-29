
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductContraIndicationEppList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductContraIndicationEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndicationEPPCoupleList" type="{urn:Vidal}ArrayOfContraIndicationEPPCouple"/>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductContraIndicationEppList", namespace = "http://contraindication.api.vidal.com", propOrder = {
    "contraIndicationEPPCoupleList",
    "messages"
})
public class ProductContraIndicationEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationEPPCouple contraIndicationEPPCoupleList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;

    /**
     * Gets the value of the contraIndicationEPPCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public ArrayOfContraIndicationEPPCouple getContraIndicationEPPCoupleList() {
        return contraIndicationEPPCoupleList;
    }

    /**
     * Sets the value of the contraIndicationEPPCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationEPPCouple }
     *     
     */
    public void setContraIndicationEPPCoupleList(ArrayOfContraIndicationEPPCouple value) {
        this.contraIndicationEPPCoupleList = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessage }
     *     
     */
    public ArrayOfMessage getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessage }
     *     
     */
    public void setMessages(ArrayOfMessage value) {
        this.messages = value;
    }

}
