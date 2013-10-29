
package com.vidal.merlin.wsclient.cim10;

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
 *         &lt;element name="pagedResultCim10" type="{urn:Vidal}pagedResultCim10"/>
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
    "pagedResultCim10"
})
@XmlRootElement(name = "getAllCim10sResponse")
public class GetAllCim10SResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCim10 pagedResultCim10;

    /**
     * Gets the value of the pagedResultCim10 property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCim10 }
     *     
     */
    public PagedResultCim10 getPagedResultCim10() {
        return pagedResultCim10;
    }

    /**
     * Sets the value of the pagedResultCim10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCim10 }
     *     
     */
    public void setPagedResultCim10(PagedResultCim10 value) {
        this.pagedResultCim10 = value;
    }

}
