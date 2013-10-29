
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
 *         &lt;element name="pagedResultFullUcd" type="{urn:Vidal}pagedResultUcdFull"/>
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
    "pagedResultFullUcd"
})
@XmlRootElement(name = "getAllUcdFullResponse")
public class GetAllUcdFullResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcdFull pagedResultFullUcd;

    /**
     * Gets the value of the pagedResultFullUcd property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcdFull }
     *     
     */
    public PagedResultUcdFull getPagedResultFullUcd() {
        return pagedResultFullUcd;
    }

    /**
     * Sets the value of the pagedResultFullUcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcdFull }
     *     
     */
    public void setPagedResultFullUcd(PagedResultUcdFull value) {
        this.pagedResultFullUcd = value;
    }

}
