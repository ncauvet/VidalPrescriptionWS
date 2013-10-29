
package com.vidal.merlin.wsclient.semp;

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
 *         &lt;element name="sempList" type="{urn:Vidal}ArrayOfSemp"/>
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
    "sempList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSemp sempList;

    /**
     * Gets the value of the sempList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSemp }
     *     
     */
    public ArrayOfSemp getSempList() {
        return sempList;
    }

    /**
     * Sets the value of the sempList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSemp }
     *     
     */
    public void setSempList(ArrayOfSemp value) {
        this.sempList = value;
    }

}
