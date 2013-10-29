
package com.vidal.merlin.wsclient.smr;

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
 *         &lt;element name="smrList" type="{urn:Vidal}ArrayOfSmr"/>
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
    "smrList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSmr smrList;

    /**
     * Gets the value of the smrList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmr }
     *     
     */
    public ArrayOfSmr getSmrList() {
        return smrList;
    }

    /**
     * Sets the value of the smrList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmr }
     *     
     */
    public void setSmrList(ArrayOfSmr value) {
        this.smrList = value;
    }

}
