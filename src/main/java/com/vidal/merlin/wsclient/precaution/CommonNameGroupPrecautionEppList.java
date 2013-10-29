
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupPrecautionEppList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionEppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="messages" type="{http://utils.api.vidal.com}ArrayOfMessage"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecautionEppPair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionEppList", propOrder = {
    "homogeneous",
    "messages",
    "precautions"
})
public class CommonNameGroupPrecautionEppList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMessage messages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionEppPair precautions;

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

    /**
     * Gets the value of the precautions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionEppPair }
     *     
     */
    public ArrayOfPrecautionEppPair getPrecautions() {
        return precautions;
    }

    /**
     * Sets the value of the precautions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionEppPair }
     *     
     */
    public void setPrecautions(ArrayOfPrecautionEppPair value) {
        this.precautions = value;
    }

}
