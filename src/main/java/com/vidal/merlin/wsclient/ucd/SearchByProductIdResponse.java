
package com.vidal.merlin.wsclient.ucd;

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
 *         &lt;element name="ucdList" type="{urn:Vidal}ArrayOfUcd"/>
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
    "ucdList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcd ucdList;

    /**
     * Gets the value of the ucdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcd }
     *     
     */
    public ArrayOfUcd getUcdList() {
        return ucdList;
    }

    /**
     * Sets the value of the ucdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcd }
     *     
     */
    public void setUcdList(ArrayOfUcd value) {
        this.ucdList = value;
    }

}
