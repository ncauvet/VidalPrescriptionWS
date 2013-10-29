
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
 *         &lt;element name="productFullList" type="{urn:Vidal}ArrayOfProductFull"/>
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
    "productFullList"
})
@XmlRootElement(name = "getProductFullByIdsResponse")
public class GetProductFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductFull productFullList;

    /**
     * Gets the value of the productFullList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductFull }
     *     
     */
    public ArrayOfProductFull getProductFullList() {
        return productFullList;
    }

    /**
     * Sets the value of the productFullList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductFull }
     *     
     */
    public void setProductFullList(ArrayOfProductFull value) {
        this.productFullList = value;
    }

}
