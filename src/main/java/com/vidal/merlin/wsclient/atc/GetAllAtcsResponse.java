
package com.vidal.merlin.wsclient.atc;

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
 *         &lt;element name="pagedResultAtc" type="{urn:Vidal}pagedResultAtc"/>
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
    "pagedResultAtc"
})
@XmlRootElement(name = "getAllAtcsResponse")
public class GetAllAtcsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultAtc pagedResultAtc;

    /**
     * Gets the value of the pagedResultAtc property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultAtc }
     *     
     */
    public PagedResultAtc getPagedResultAtc() {
        return pagedResultAtc;
    }

    /**
     * Sets the value of the pagedResultAtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultAtc }
     *     
     */
    public void setPagedResultAtc(PagedResultAtc value) {
        this.pagedResultAtc = value;
    }

}
