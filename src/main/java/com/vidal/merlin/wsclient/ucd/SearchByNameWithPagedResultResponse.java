
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
 *         &lt;element name="pagedResultUcd" type="{urn:Vidal}pagedResultUcd"/>
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
    "pagedResultUcd"
})
@XmlRootElement(name = "searchByNameWithPagedResultResponse")
public class SearchByNameWithPagedResultResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUcd pagedResultUcd;

    /**
     * Gets the value of the pagedResultUcd property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUcd }
     *     
     */
    public PagedResultUcd getPagedResultUcd() {
        return pagedResultUcd;
    }

    /**
     * Sets the value of the pagedResultUcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUcd }
     *     
     */
    public void setPagedResultUcd(PagedResultUcd value) {
        this.pagedResultUcd = value;
    }

}
