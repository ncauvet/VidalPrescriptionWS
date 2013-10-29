
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
 *         &lt;element name="pagedResultProduct" type="{urn:Vidal}pagedResultProduct"/>
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
    "pagedResultProduct"
})
@XmlRootElement(name = "searchByNameWithPagedResultResponse")
public class SearchByNameWithPagedResultResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultProduct pagedResultProduct;

    /**
     * Gets the value of the pagedResultProduct property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultProduct }
     *     
     */
    public PagedResultProduct getPagedResultProduct() {
        return pagedResultProduct;
    }

    /**
     * Sets the value of the pagedResultProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultProduct }
     *     
     */
    public void setPagedResultProduct(PagedResultProduct value) {
        this.pagedResultProduct = value;
    }

}
