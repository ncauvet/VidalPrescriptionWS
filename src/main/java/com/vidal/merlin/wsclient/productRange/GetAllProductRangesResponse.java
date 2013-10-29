
package com.vidal.merlin.wsclient.productRange;

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
 *         &lt;element name="pagedResultProductRange" type="{urn:Vidal}pagedResultProductRange"/>
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
    "pagedResultProductRange"
})
@XmlRootElement(name = "getAllProductRangesResponse")
public class GetAllProductRangesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProductRange pagedResultProductRange;

    /**
     * Gets the value of the pagedResultProductRange property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProductRange }
     *     
     */
    public PagedResultProductRange getPagedResultProductRange() {
        return pagedResultProductRange;
    }

    /**
     * Sets the value of the pagedResultProductRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProductRange }
     *     
     */
    public void setPagedResultProductRange(PagedResultProductRange value) {
        this.pagedResultProductRange = value;
    }

}
