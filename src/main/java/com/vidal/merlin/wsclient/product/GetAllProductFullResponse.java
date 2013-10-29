
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
 *         &lt;element name="pagedResultProductFull" type="{urn:Vidal}pagedResultProductFull"/>
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
    "pagedResultProductFull"
})
@XmlRootElement(name = "getAllProductFullResponse")
public class GetAllProductFullResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProductFull pagedResultProductFull;

    /**
     * Gets the value of the pagedResultProductFull property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProductFull }
     *     
     */
    public PagedResultProductFull getPagedResultProductFull() {
        return pagedResultProductFull;
    }

    /**
     * Sets the value of the pagedResultProductFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProductFull }
     *     
     */
    public void setPagedResultProductFull(PagedResultProductFull value) {
        this.pagedResultProductFull = value;
    }

}
