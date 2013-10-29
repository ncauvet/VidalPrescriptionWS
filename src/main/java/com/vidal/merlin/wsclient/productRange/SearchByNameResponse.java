
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
 *         &lt;element name="productRangeList" type="{urn:Vidal}ArrayOfProductRange"/>
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
    "productRangeList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductRange productRangeList;

    /**
     * Gets the value of the productRangeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public ArrayOfProductRange getProductRangeList() {
        return productRangeList;
    }

    /**
     * Sets the value of the productRangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRange }
     *     
     */
    public void setProductRangeList(ArrayOfProductRange value) {
        this.productRangeList = value;
    }

}
