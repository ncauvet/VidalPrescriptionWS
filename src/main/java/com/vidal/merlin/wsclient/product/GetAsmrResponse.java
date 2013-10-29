
package com.vidal.merlin.wsclient.product;

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
 *         &lt;element name="asmrList" type="{urn:Vidal}ArrayOfAsmr"/>
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
    "asmrList"
})
@XmlRootElement(name = "getAsmrResponse")
public class GetAsmrResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAsmr asmrList;

    /**
     * Gets the value of the asmrList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAsmr }
     *     
     */
    public ArrayOfAsmr getAsmrList() {
        return asmrList;
    }

    /**
     * Sets the value of the asmrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAsmr }
     *     
     */
    public void setAsmrList(ArrayOfAsmr value) {
        this.asmrList = value;
    }

}
