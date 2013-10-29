
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
 *         &lt;element name="ProductRangeProductCoupleList" type="{urn:Vidal}ArrayOfProductRangeProductCouple"/>
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
    "productRangeProductCoupleList"
})
@XmlRootElement(name = "searchByProductRangeIdsResponse")
public class SearchByProductRangeIdsResponse {

    @XmlElement(name = "ProductRangeProductCoupleList", required = true, nillable = true)
    protected ArrayOfProductRangeProductCouple productRangeProductCoupleList;

    /**
     * Gets the value of the productRangeProductCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRangeProductCouple }
     *     
     */
    public ArrayOfProductRangeProductCouple getProductRangeProductCoupleList() {
        return productRangeProductCoupleList;
    }

    /**
     * Sets the value of the productRangeProductCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRangeProductCouple }
     *     
     */
    public void setProductRangeProductCoupleList(ArrayOfProductRangeProductCouple value) {
        this.productRangeProductCoupleList = value;
    }

}
