
package com.vidal.merlin.wsclient.administrationRoute;

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
 *         &lt;element name="pagedResultRoute" type="{urn:Vidal}pagedResultRoute"/>
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
    "pagedResultRoute"
})
@XmlRootElement(name = "getAllRoutesResponse")
public class GetAllRoutesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultRoute pagedResultRoute;

    /**
     * Gets the value of the pagedResultRoute property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultRoute }
     *     
     */
    public PagedResultRoute getPagedResultRoute() {
        return pagedResultRoute;
    }

    /**
     * Sets the value of the pagedResultRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultRoute }
     *     
     */
    public void setPagedResultRoute(PagedResultRoute value) {
        this.pagedResultRoute = value;
    }

}
