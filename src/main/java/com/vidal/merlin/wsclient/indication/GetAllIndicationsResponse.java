
package com.vidal.merlin.wsclient.indication;

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
 *         &lt;element name="pagedResultIndication" type="{urn:Vidal}pagedResultIndication"/>
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
    "pagedResultIndication"
})
@XmlRootElement(name = "getAllIndicationsResponse")
public class GetAllIndicationsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultIndication pagedResultIndication;

    /**
     * Gets the value of the pagedResultIndication property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultIndication }
     *     
     */
    public PagedResultIndication getPagedResultIndication() {
        return pagedResultIndication;
    }

    /**
     * Sets the value of the pagedResultIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultIndication }
     *     
     */
    public void setPagedResultIndication(PagedResultIndication value) {
        this.pagedResultIndication = value;
    }

}
