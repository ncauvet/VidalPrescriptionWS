
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
 *         &lt;element name="ucdFullList" type="{urn:Vidal}ArrayOfUcdFull"/>
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
    "ucdFullList"
})
@XmlRootElement(name = "getAllUcdFullByIdsResponse")
public class GetAllUcdFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdFull ucdFullList;

    /**
     * Gets the value of the ucdFullList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdFull }
     *     
     */
    public ArrayOfUcdFull getUcdFullList() {
        return ucdFullList;
    }

    /**
     * Sets the value of the ucdFullList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdFull }
     *     
     */
    public void setUcdFullList(ArrayOfUcdFull value) {
        this.ucdFullList = value;
    }

}
