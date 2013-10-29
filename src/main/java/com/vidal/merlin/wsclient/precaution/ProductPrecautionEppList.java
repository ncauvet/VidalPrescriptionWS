
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPrecautionEppList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPrecautionEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="precautionEppCouples" type="{urn:Vidal}ArrayOfPrecautionEPPCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPrecautionEppList", namespace = "http://contraindication.api.vidal.com", propOrder = {
    "messages",
    "precautionEppCouples"
})
public class ProductPrecautionEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionEPPCouple precautionEppCouples;

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

    /**
     * Gets the value of the precautionEppCouples property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public ArrayOfPrecautionEPPCouple getPrecautionEppCouples() {
        return precautionEppCouples;
    }

    /**
     * Sets the value of the precautionEppCouples property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public void setPrecautionEppCouples(ArrayOfPrecautionEPPCouple value) {
        this.precautionEppCouples = value;
    }

}
