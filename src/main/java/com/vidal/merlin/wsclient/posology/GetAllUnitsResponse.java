
package com.vidal.merlin.wsclient.posology;

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
 *         &lt;element name="pagedResultUnit" type="{urn:Vidal}pagedResultUnit"/>
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
    "pagedResultUnit"
})
@XmlRootElement(name = "getAllUnitsResponse")
public class GetAllUnitsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultUnit pagedResultUnit;

    /**
     * Gets the value of the pagedResultUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultUnit }
     *     
     */
    public PagedResultUnit getPagedResultUnit() {
        return pagedResultUnit;
    }

    /**
     * Sets the value of the pagedResultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultUnit }
     *     
     */
    public void setPagedResultUnit(PagedResultUnit value) {
        this.pagedResultUnit = value;
    }

}
