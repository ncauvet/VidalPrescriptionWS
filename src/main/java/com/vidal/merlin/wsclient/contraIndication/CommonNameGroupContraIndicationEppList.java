
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupContraIndicationEppList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupContraIndicationEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndicationTypeEppTuple"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CommonNameGroupContraIndicationEppList", propOrder = {
    "contraIndications",
    "homogeneous",
    "messages"
})
public class CommonNameGroupContraIndicationEppList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationTypeEppTuple contraIndications;
    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;

    /**
     * Gets the value of the contraIndications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationTypeEppTuple }
     *     
     */
    public ArrayOfContraIndicationTypeEppTuple getContraIndications() {
        return contraIndications;
    }

    /**
     * Sets the value of the contraIndications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationTypeEppTuple }
     *     
     */
    public void setContraIndications(ArrayOfContraIndicationTypeEppTuple value) {
        this.contraIndications = value;
    }

    /**
     * Gets the value of the homogeneous property.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
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
